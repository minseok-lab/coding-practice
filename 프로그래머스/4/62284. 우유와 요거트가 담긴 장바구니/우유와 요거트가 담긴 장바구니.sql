WITH Buy_Milk AS (
    SELECT CART_ID, ID
    FROM CART_PRODUCTS 
    WHERE NAME = 'Milk'
    ),
    Buy_Yogurt AS (
    SELECT CART_ID, ID
    FROM CART_PRODUCTS 
    WHERE NAME = 'Yogurt'
)

SELECT m.CART_ID
FROM Buy_Milk m
JOIN Buy_Yogurt y
ON m.CART_ID = y.CART_ID
ORDER BY m.ID ASC;