-- 코드를 입력하세요
SELECT a.animal_id, a.name
FROM (
    SELECT ins.animal_id, ins.name, (outs.DATETIME - ins.DATETIME) AS period
    FROM ANIMAL_INS ins
    JOIN ANIMAL_OUTS outs
    ON ins.ANIMAL_ID = outs.ANIMAL_ID
    ORDER BY (outs.DATETIME - ins.DATETIME) DESC
    ) a
WHERE ROWNUM <= 2;