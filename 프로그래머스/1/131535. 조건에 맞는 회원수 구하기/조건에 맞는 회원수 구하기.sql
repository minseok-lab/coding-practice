-- 코드를 입력하세요
SELECT COUNT(user_id) AS users
FROM user_info
WHERE age BETWEEN 20 AND 29
AND TO_CHAR(joined, 'YYYY') = '2021';