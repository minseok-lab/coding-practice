-- 1단계: 회원별 리뷰 개수를 세고, 1등(RANK() = 1)을 찾습니다.
WITH MEMBER_RANK AS (
    SELECT
        MEMBER_ID,
        -- 리뷰 개수를 기준으로 내림차순 1등을 찾습니다.
        RANK() OVER (ORDER BY COUNT(REVIEW_ID) DESC) AS RNK
    FROM
        REST_REVIEW
    GROUP BY
        MEMBER_ID -- 오직 MEMBER_ID로만 그룹화합니다.
)
-- 2단계: 1등 회원의 리뷰 내역을 조회합니다.
SELECT
    M.MEMBER_NAME,
    R.REVIEW_TEXT,
    TO_CHAR(R.REVIEW_DATE, 'YYYY-MM-DD') AS REVIEW_DATE
FROM
    REST_REVIEW R
JOIN
    MEMBER_PROFILE M ON R.MEMBER_ID = M.MEMBER_ID
WHERE
    R.MEMBER_ID IN (
        -- 1단계에서 찾은 1등(RNK = 1) 회원의 ID만 선택
        SELECT MEMBER_ID
        FROM MEMBER_RANK
        WHERE RNK = 1
    )
ORDER BY
    R.REVIEW_DATE ASC, R.REVIEW_TEXT ASC;