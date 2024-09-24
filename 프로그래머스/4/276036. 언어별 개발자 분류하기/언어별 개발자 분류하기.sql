WITH p AS (
    SELECT CODE
    FROM SKILLCODES
    WHERE NAME = "Python"
),
c AS (
    SELECT CODE 
    FROM SKILLCODES
    WHERE NAME = "C#"
),
f AS (
    SELECT SUM(CODE)
    FROM SKILLCODES
    WHERE CATEGORY = "Front End"
)
SELECT CASE WHEN SKILL_CODE & (SELECT * FROM p) > 0 AND SKILL_CODE & (SELECT * FROM f) > 0 THEN "A"
    WHEN SKILL_CODE & (SELECT * FROM c) > 0 THEN "B"
    WHEN SKILL_CODE & (SELECT * FROM f) > 0 THEN "C"
    ELSE null END GRADE, 
    d.ID, EMAIL
FROM DEVELOPERS d, p, c, f
HAVING GRADE IS NOT NULL
ORDER BY 1, 2;