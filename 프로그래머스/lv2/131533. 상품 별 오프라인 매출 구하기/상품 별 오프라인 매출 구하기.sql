SELECT a.PRODUCT_CODE, a.PRICE * SUM(IFNULL(b.SALES_AMOUNT, 0)) AS SALES
FROM PRODUCT a
INNER JOIN OFFLINE_SALE b ON b.PRODUCT_ID = a.PRODUCT_ID 
GROUP BY a.PRODUCT_ID
ORDER BY SALES DESC, a.PRODUCT_CODE ASC