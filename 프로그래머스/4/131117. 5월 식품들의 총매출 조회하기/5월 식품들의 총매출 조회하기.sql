WITH may_product AS (
    SELECT 
        product_id, amount
    FROM food_order o
    WHERE TO_CHAR(o.produce_date, 'YYYY-MM') = '2022-05'
    )
SELECT
    p.product_id, 
    p.product_name, 
    SUM(p.price * m.amount) AS TOTAL_SALES
FROM may_product m
JOIN food_product p
ON m.product_id = p.product_id
GROUP BY p.product_id, p.product_name
ORDER BY TOTAL_SALES DESC, product_id ASC;