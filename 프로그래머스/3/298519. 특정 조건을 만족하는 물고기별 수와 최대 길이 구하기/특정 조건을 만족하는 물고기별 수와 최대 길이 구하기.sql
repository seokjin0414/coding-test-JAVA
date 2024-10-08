SELECT COUNT(*) FISH_COUNT, MAX(LENGTH) MAX_LENGTH, FISH_TYPE
FROM FISH_INFO
GROUP BY 3
HAVING AVG(IFNULL(LENGTH, 10)) >= 33
ORDER BY 3