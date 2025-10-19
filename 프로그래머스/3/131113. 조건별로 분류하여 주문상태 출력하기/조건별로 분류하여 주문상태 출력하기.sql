-- 코드를 입력하세요
SELECT order_id, product_id, 
    TO_CHAR(out_date, 'YYYY-MM-DD') AS OUT_DATE,
    CASE
        WHEN out_date IS NULL THEN '출고미정'
        WHEN TO_CHAR(out_date, 'YYYYMMDD') <= '20220501' THEN '출고완료'
        ELSE '출고대기' END AS "출고여부"
FROM FOOD_ORDER 
ORDER BY order_id ASC;