SELECT COUNT(*) FISH_COUNT, n.FISH_NAME
FROM FISH_INFO i
INNER JOIN FISH_NAME_INFO n USING(FISH_TYPE)
GROUP BY 2
ORDER BY 1 DESC