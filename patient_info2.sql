SELECT patient_name, sex, age FROM patient_info;

SELECT DISTINCT height, weigtht FROM patient_info;

SELECT * FROM patient_info WHERE age BETWEEN 40 and 60;

SELECT * FROM patient_info WHERE height > 175;

SELECT * FROM patient_info WHERE age > 60 and weigtht >80;

SELECT * FROM patient_info WHERE sex = '女' and (weigtht > 70 or weigtht < 50);

SELECT * FROM patient_info ORDER BY age, height ASC;

INSERT INTO patient_info (patient_id, name)
VALUES (1001, '初期値');

UPDATE patient_info 
SET age= 55, sex ='男' 
WHERE patient_id = 10010;

DELETE FROM patient_info
WHERE patient_id = 10010;

SELECT * FROM patient_id LIMIT 2;

SELECT * FROM patient_info
WHERE blood_type LIKE 'A%';

SELECT * FROM patient_info
WHERE address NOT LIKE ('千葉%');

SELECT * FROM patient_info
WHERE address LIKE '東京都%';

SELECT * FROM patient_info
WHERE blood_type IN ('O','B');

SELECT name AS n, sex AS s
FROM patient_info;

SELECT name, CONCAT(age, ', ', height, ', ', weigtht) AS site_info
FROM patient_info;

SELECT sex FROM patient_info
UNION
SELECT sex FROM student_info
ORDER BY sex;

SELECT age, name FROM patient_info
WHERE age='30'
UNION ALL
SELECT age, name FROM student_info
WHERE age='30'
ORDER BY age;

ALTER TABLE patient_info
MODIFY patient_id int NULL;

ALTER TABLE patient_info
ADD CHECK (age > 20);

ALTER TABLE patient_info
ALTER sex SET DEFAULT '男';

CREATE INDEX index_patient_id
ON patient_info (name);

SELECT * FROM patient_info WHERE birthday='1955/12/29';

SELECT name FROM patient_info
WHERE sex IS NULL;

SELECT patient_id,name*(patient_id+name)
FROM patient_info;

SELECT patient_info.patient_id
FROM patient_info
INNER JOIN student_info
ON patient_info.patient_id = student_info.student_id
ORDER BY student_info.student_id;

SELECT AVG(height) AS hightAverage FROM patient_info;

SELECT patient_id, height FROM patient_info
WHERE height > (SELECT AVG(height) FROM patient_info);

SELECT name AS FirstID FROM patient_info LIMIT 1;

SELECT name FROM patient_info
ORDER BY patient_id DESC
LIMIT 1;

SELECT SUM(age) AS nums FROM patient_info;

SELECT name, SUM(patient_info.age) AS nums
FROM patient_info GROUP BY name;

SELECT name, LENGTH(tel) as LengthOfTel
FROM patient_info;

SELECT name, Now() AS date
FROM patient_info;

SELECT name, age, DATE_FORMAT(Now(),'%Y-%m-%d') AS date
FROM patient_info;
