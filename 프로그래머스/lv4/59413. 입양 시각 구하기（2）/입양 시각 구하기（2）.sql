SET @t = -1;
SELECT (@t := @t +1) HOUR, (SELECT COUNT(1)
                        FROM ANIMAL_OUTS
                        WHERE HOUR(DATETIME) = @t) COUNT
FROM ANIMAL_OUTS
WHERE @t < 23
ORDER BY HOUR;