SELECT * FROM estados

SELECT nome AS 'Nome do Estado', sigla FROM estados
WHERE regiao = 'Sul'

SELECT nome, populacao, regiao FROM estados
WHERE populacao >= 10
ORDER BY populacao DESC