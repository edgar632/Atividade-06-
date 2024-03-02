main :: IO ()
main = do
    putStr "Digite a quantidade de jogos vendidos por Catarina: "
    quantidadeJogos <- readLn :: IO Int

    let custoPorJogo = 19.90
        totalVendas = fromIntegral quantidadeJogos * custoPorJogo
        bonus = (fromIntegral quantidadeJogos / 15) * 0.08 * totalVendas
        salario = 0.5 * totalVendas
        totalRecebido = salario + bonus

    putStrLn $ "Total de Vendas: " ++ show totalVendas
    putStrLn $ "Bônus: " ++ show bonus
    putStrLn $ "Total Recebido: " ++ show totalRecebido
