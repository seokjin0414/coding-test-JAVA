WITH max AS(SELECT CATEGORY, MAX(PRICE) MAX_PRICE
FROM FOOD_PRODUCT 
WHERE CATEGORY IN('과자', '국', '김치', '식용유')
GROUP BY CATEGORY
)

SELECT a.CATEGORY, a.MAX_PRICE, b.PRODUCT_NAME
FROM max a
INNER JOIN FOOD_PRODUCT b ON b.CATEGORY = a.CATEGORY AND b.PRICE = a.MAX_PRICE
ORDER BY 2 DESC