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
    SELECT CODE 
    FROM SKILLCODES
    WHERE CATEGORY = "Front End"
),
g AS (
    SELECT ID, EMAIL,
    CASE WHEN SKILL_CODE & (SELECT * FROM p) >= 1 AND (SELECT COUNT(*) FROM f WHERE SKILL_CODE & CODE >= 1) >= 1 THEN "A"
    WHEN SKILL_CODE & (SELECT * FROM c) >= 1 THEN "B"
    WHEN (SELECT COUNT(*) FROM f WHERE SKILL_CODE & CODE >= 1) >= 1 THEN "C"
    ELSE null END GRADE
    FROM DEVELOPERS 
)
SELECT GRADE, ID, EMAIL
FROM g 
WHERE GRADE IS NOT NULL
ORDER BY 1, 2;