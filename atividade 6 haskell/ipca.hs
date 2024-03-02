import Data.List (minimumBy, maximumBy)

data IPCAData = IPCAData { anoMes :: String, valorIndice :: Double }

main :: IO ()
main = do
    putStrLn "Digite os dados do IPCA (ano/mês índice). Para encerrar, digite *:"
    processarEntrada []

processarEntrada :: [IPCAData] -> IO ()
processarEntrada dados = do
    entrada <- getLine
    if entrada == "*"
        then processarResultados dados
        else do
            let (anoMesStr:indiceStr:_) = words entrada
                dadoIPCA = IPCAData { anoMes = anoMesStr, valorIndice = read indiceStr }
            processarEntrada (dadoIPCA : dados)

processarResultados :: [IPCAData] -> IO ()
processarResultados dados = do
    let (menorIPCA, maiorIPCA, mediaIPCA) = calcularResultados dados
    putStrLn $ "Menor IPCA: " ++ mostrarIPCA menorIPCA
    putStrLn $ "Maior IPCA: " ++ mostrarIPCA maiorIPCA
    putStrLn $ "Média do IPCA: " ++ show mediaIPCA

calcularResultados :: [IPCAData] -> (IPCAData, IPCAData, Double)
calcularResultados dados = (minimumBy compararIPCA dados, maximumBy compararIPCA dados, mediaIPCA dados)

compararIPCA :: IPCAData -> IPCAData -> Ordering
compararIPCA a b = compare (valorIndice a) (valorIndice b)

mostrarIPCA :: IPCAData -> String
mostrarIPCA dado = valorIndiceStr ++ " (Ano/Mês: " ++ anoMes dado ++ ")"
    where valorIndiceStr = show (valorIndice dado)

mediaIPCA :: [IPCAData] -> Double
mediaIPCA dados = sum (map valorIndice dados) / fromIntegral (length dados)
