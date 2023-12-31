SELECT b.USER_ID, b.NICKNAME, CONCAT_WS(' ', b.CITY, b.STREET_ADDRESS1, b.STREET_ADDRESS2) 전체주소, CONCAT_WS('-', SUBSTR(b.TLNO, 1, 3), SUBSTR(b.TLNO, 4, 4), SUBSTR(b.TLNO, 8, 4)) 전화번호
FROM USED_GOODS_BOARD a
INNER JOIN USED_GOODS_USER b ON b.USER_ID = a.WRITER_ID
GROUP BY 1
HAVING COUNT(*) >= 3
ORDER BY 1 DESC