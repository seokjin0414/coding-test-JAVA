WITH v AS (
    SELECT FISH_TYPE
    FROM FISH_NAME_INFO
    WHERE FISH_NAME IN ('BASS', 'SNAPPER')
)
SELECT COUNT(ID) FISH_COUNT
FROM FISH_INFO 
WHERE FISH_TYPE IN (SELECT * FROM v)