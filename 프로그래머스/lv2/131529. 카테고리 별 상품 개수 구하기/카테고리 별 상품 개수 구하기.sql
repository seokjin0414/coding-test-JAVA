SELECT LEFT(PRODUCT_CODE, 2) CATEGORY, COUNT(PRODUCT_ID) PRODUCTS
FROM PRODUCT
GROUP BY 1
ORDER BY 1 
