SELECT t.ITEM_ID, i.ITEM_NAME
FROM ITEM_TREE t
INNER JOIN ITEM_INFO i USING(ITEM_ID)
WHERE t.PARENT_ITEM_ID IS NULL