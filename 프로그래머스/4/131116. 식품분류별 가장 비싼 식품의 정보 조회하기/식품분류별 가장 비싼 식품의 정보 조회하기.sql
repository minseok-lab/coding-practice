WITH in_category AS (
    SELECT
        category,
        price, 
        product_name, 
        RANK() OVER (PARTITION BY CATEGORY ORDER BY PRICE DESC) AS rnk
    FROM food_product
    WHERE category IN ( '과자', '국', '김치', '식용유' )
    )
SELECT category, price, product_name
FROM in_category
WHERE rnk = 1
ORDER BY price DESC;