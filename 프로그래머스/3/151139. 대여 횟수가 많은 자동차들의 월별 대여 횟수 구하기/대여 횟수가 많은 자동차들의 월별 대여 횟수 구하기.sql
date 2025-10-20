WITH rental_period AS (
    SELECT car_id, start_date
    FROM car_rental_company_rental_history
    WHERE start_date 
        BETWEEN TO_DATE('2022-08-01', 'YYYY-MM-DD')
        AND TO_DATE('2022-10-31', 'YYYY-MM-DD'))
SELECT
    EXTRACT(MONTH FROM start_date) AS MONTH,
    car_id,
    COUNT(car_id) AS RECORDS
FROM rental_period
WHERE car_id IN (
    SELECT car_id
    FROM rental_period
    GROUP BY car_id
    HAVING COUNT(car_id) >= 5
    )
GROUP BY 
    EXTRACT(MONTH FROM start_date),
    car_id
ORDER BY 
    month ASC,
    car_id DESC;