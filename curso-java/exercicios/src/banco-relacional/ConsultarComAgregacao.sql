SELECT 
    regiao as 'Região',
    sum(populacao) as Total
FROM estados
GROUP BY regiao
ORDER BY Total DESC

SELECT 
    sum(populacao) as Total
FROM estados

SELECT 
    avg(populacao) as Total
FROM estados