1. SELECT:

Patientsテーブルから全ての患者情報を取得してください。

SELECT * FROM patients;

2. SELECT DISTINCT:

Patientsテーブルから重複しないメールアドレスを取得してください。

SELECT DISTINCT email FROM patients;

3. WHERE:

1990年以降に生まれた患者の情報をPatientsテーブルから取得してください。

SELECT * FROM patients WHERE birthday>'1990/01/01';

4. AND & OR:

Patientsテーブルから、1990年以降に生まれ、かつ男性またはTokyoに住んでいる患者の情報を取得してください。

SELECT * FROM patients WHERE birthday>'1990/01/01' AND (gender='M' OR address='東京都');

5. ORDER BY:

Patientsテーブルから全ての患者情報を生年月日の新しい順に取得してください。

SELECT * FROM patients ORDER BY birthday;

6. INSERT INTO:

新しい患者「高橋 修」氏をPatientsテーブルに追加してください。

INSERT INTO patients (name,birthday,gender,address,phone,email,insurance_id,created_at,updated_at,del_flag) 
VALUES ('高橋 修',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

7. UPDATE:

Patientsテーブルで「山田 太郎」氏の住所をOsakaに更新してください。

UPDATE patients SET address='Osaka' WHERE name='山田 太郎';

8. DELETE:

Patientsテーブルからメールアドレスがyamada@example.comの患者情報を削除してください。

DELETE FROM patients WHERE email='yamada@example.com';

9. SELECT TOP (またはLIMIT):

SELECT * FROM Patients LIMIT 2

10. LIKE:

Patientsテーブルから、メールアドレスが@example.comで終わる患者の情報を取得してください。

SELECT * FROM patients WHERE email LIKE '%@example.com';

11. IN:

Patientsテーブルから、住所がTokyo、Osaka、またはFukuokaのいずれかの患者の情報を取得してください。

SELECT * FROM patients WHERE address IN ('Tokyo','Osaka','Fukuoka');

12. BETWEEN:

Patientsテーブルから、1985年から1995年の間に生まれた患者の情報を取得してください。

SELECT * FROM patients WHERE birthday BETWEEN '1985/01/01' AND '1995/01/01';

13. AS:

Patientsテーブルから患者の名前を取得し、列名をFullNameとして表示してください。

SELECT name AS FullName FROM patients;

14. JOIN (INNER JOINを使用):

PatientsとInsuranceテーブルを結合し、患者とその保険情報を取得してください。

SELECT Insurance.insurance_id,patients.name,Insurance.provider,Insurance.policy_no,Insurance.valid_from,Insurance.valid_to,Insurance.created_at,Insurance.updated_at,Insurance.del_flag
FROM patients INNER JOIN Insurance ON patients.patient_id=Insurance.insurance_id;

15. LEFT JOIN:

PatientsテーブルとAllergiesテーブルを結合し、アレルギー情報がない患者も含めて全ての患者情報を取得してください。

SELECT Insurance.insurance_id,patients.name,Insurance.provider,Insurance.policy_no,Insurance.valid_from,Insurance.valid_to,Insurance.created_at,Insurance.updated_at,Insurance.del_flag
FROM patients LEFT JOIN Insurance ON patients.patient_id=Insurance.insurance_id;

16. RIGHT JOIN:

（PostgreSQLではRIGHT JOINはサポートされていますが、使われることは少ないです。そのため、LEFT JOINやINNER JOINで問題を作成する方が現実的です。）

17. FULL JOIN:

PatientsテーブルとInsuranceテーブルを結合し、患者が保険情報を持っているかどうかに関わらず全ての情報を取得してください。

SELECT Patients.*, Insurance.* FROM Patients
FULL JOIN Insurance ON Patients.insurance_id=Insurance.insurance_id;

18. UNION:

Patientsテーブルから1985年と1990年に生まれた患者の名前を取得してください。

SELECT * FROM patients WHERE birthday BETWEEN '1985/01/01' AND '1990/01/01';



19. NOT NULL:

NULLでない電話番号を持つ患者の情報をPatientsテーブルから取得してください。




20. UNIQUE:

（UNIQUEはテーブルの設計/構造に関する制約なので、これに関する具体的な問題は作成するのが難しいです。）

21. PRIMARY KEY:

（PRIMARY KEYもテーブルの設計/構造に関する制約なので、具体的な問題は作成するのが難しいです。）

22. FOREIGN KEY:

Patientsテーブルにあるinsurance_idはどのテーブルを参照していますか？

Insurance;

23. CHECK:

（CHECK制約を使用して、gender列にMまたはFのみが入力されるようにPatientsテーブルを設定してください。）



24. DEFAULT:

（del_flag列のデフォルト値として0を設定してください。）



25. CREATE INDEX:

Patientsテーブルのemail列にインデックスを作成してください。

CREATE INDEX index_email ON patients (email)

26. DROP:

名前がtest_tableのテーブルを削除してください。

DROP TABLE test_table

27. ALTER:

Patientsテーブルに新しい列emergency_contactを追加してください。

ALTER TABLE patients ADD emergency_contact VARCHAR(50);

28. AVG():

FamilyMedicalHistoriesテーブルから平均診断年齢を計算してください。

SELECT AVG(age_at_diagnosis) FROM FamilyMedicalHistories;

29. COUNT():

Allergiesテーブルでアレルギーの情報が登録されている患者の数を計算してください。

SELECT COUNT(allergy_id) FROM Allergies;

30. FIRST() & LAST():

（注意: FIRST() と LAST() はPostgreSQLには存在しない関数です。他のDBMSでは使えるかもしれませんが、ここではスキップします。）



31. MAX() & MIN():

FamilyMedicalHistoriesテーブルから最も若い診断年齢と最も高い診断年齢を取得してください。

SELECT MAX(age_at_diagnosis) FROM FamilyMedicalHistories;

SELECT MIN(age_at_diagnosis) FROM FamilyMedicalHistories;


32. SUM():

（例：特定の条件に基づくカラムの合計を取得する場合などに使用します。ここでは具体的な問題を作成するのが難しいので、スキップします。）



33. GROUP BY:

Allergiesテーブルを使用して、各物質(substance)に対するアレルギー反応の数をカウントしてください。

SELECT substance, COUNT(Allergies) AS reaction
FROM Allergies
GROUP BY substance;

34. HAVING:

Allergiesテーブルを使用して、3人以上の患者が持っているアレルギー物質を取得してください。



35. EXISTS:

Insuranceを持っている患者の情報をPatientsテーブルから取得してください。



36. LEN():

（注意: PostgreSQLではLEN()関数はLENGTH()として実装されています。）Patientsテーブルから名前の長さが5文字以上の患者を取得してください。

37. ROUND():

FamilyMedicalHistoriesテーブルの診断年齢の平均を小数第二位で四捨五入して取得してください。

SELECT ROUND(AVG(age_at_diagnosis), 2) FROM FamilyMedicalHistories;

38. NOW():

現在の日付と時刻を取得してください。

SELECT NOW() FROM Patients;


--------------------------------------------------------------------------------------------------------------------------------------------
*********************************************************************************************************************************************
--------------------------------------------------------------------------------------------------------------------------------------------

問題1: Patientsテーブルのすべての患者に対して、彼らが持っているアレルギー物質(substance)と反応(reaction)を一覧表示してください。ただし、アレルギーの情報がない患者もリストに表示してください。

SELECT P.name, A.substance, A.reaction 
FROM Patients P 
LEFT JOIN Allergies A ON P.patient_id = A.patient_id;


問題2: Patientsテーブルで1995年以降に生まれた患者が、どの保険プロバイダー（provider）に加入しているのかを一覧表示してください。

SELECT P.name, I.provider 
FROM Patients P 
INNER JOIN Insurance I ON P.insurance_id = I.insurance_id 
WHERE P.birthday >= '1995-01-01';



問題3: FamilyMedicalHistoriesテーブルで「糖尿病」の医療履歴を持つ患者の名前とその関係者の情報を取得してください。

SELECT P.name, F.relationship, F.age_at_diagnosis 
FROM Patients P 
INNER JOIN FamilyMedicalHistories F ON P.patient_id = F.patient_id 
WHERE F.medical_condition = '糖尿病';


問題4: 保険が論理削除（del_flagが1）されている患者の名前とメールアドレスを取得してください。

SELECT P.name, P.email 
FROM Patients P 
INNER JOIN Insurance I ON P.insurance_id = I.insurance_id 
WHERE I.del_flag = '1';


問題5: 各保険プロバイダー（provider）の加入者数を計算してください。結果は加入者数が多い順に並べてください。

SELECT I.provider, COUNT(P.patient_id) AS number_of_patients 
FROM Insurance I
LEFT JOIN Patients P ON I.insurance_id = P.insurance_id 
GROUP BY I.provider 
ORDER BY number_of_patients DESC;



問題6: アレルギー情報を持たない患者の名前と生年月日を取得してください。

SELECT P.name, P.birthday 
FROM Patients P 
LEFT JOIN Allergies A ON P.patient_id = A.patient_id 
WHERE A.allergy_id IS NULL;



問題7: Patients テーブルと FamilyMedicalHistories テーブルを使って、自身または家族に心臓疾患の履歴がある患者の名前を取得してください。

SELECT DISTINCT P.name 
FROM Patients P 
LEFT JOIN FamilyMedicalHistories F ON P.patient_id = F.patient_id 
WHERE F.medical_condition LIKE '%心臓%';


問題8: 論理削除されたレコード（del_flagが1）を除外し、すべてのテーブル（Patients, Insurance, Allergies, FamilyMedicalHistories）からデータを取得してください。

#NAME?
SELECT * FROM Patients WHERE del_flag != '1';

#NAME?
SELECT * FROM Insurance WHERE del_flag != '1';

#NAME?
SELECT * FROM Allergies WHERE del_flag != '1';

#NAME?
SELECT * FROM FamilyMedicalHistories WHERE del_flag != '1';


問題9: 患者が加入している保険の有効期限（valid_to）が2023年12月31日以前の患者の名前とその保険の有効期限を取得してください。

SELECT P.name, I.valid_to 
FROM Patients P 
JOIN Insurance I ON P.insurance_id = I.insurance_id 
WHERE I.valid_to <= '2023-12-31';


問題10: アレルギーの物質（substance）ごとに、反応（reaction）の異なる数を計算してください。


SELECT A.substance, COUNT(DISTINCT A.reaction) AS number_of_distinct_reactions 
FROM Allergies A 
GROUP BY A.substance;



問題11: 男性（genderが'M'）の中で最も年上の患者の名前と生年月日を取得してください。

SELECT P.name, P.birthday 
FROM Patients P 
WHERE P.gender = 'M' 
ORDER BY P.birthday ASC 
LIMIT 1;


問題12: すべての患者の中で、家族の医療履歴情報が5件以上ある患者の名前とその家族の医療履歴情報の件数を取得してください。

SELECT P.name, COUNT(F.history_id) AS number_of_family_histories 
FROM Patients P 
LEFT JOIN FamilyMedicalHistories F ON P.patient_id = F.patient_id 
GROUP BY P.name 
HAVING COUNT(F.history_id) >= 5;


問題13: 患者の住所（address）が「東京」を含むすべての患者の名前とメールアドレスを取得して、名前のアルファベット順に並べてください。

SELECT P.name, P.email 
FROM Patients P 
WHERE P.address LIKE '%東京%' 
ORDER BY P.name ASC;


問題14: 2023年1月1日から2023年12月31日までの期間に、保険の有効期限が切れる患者の名前と、その保険の有効期限をリストアップしてください。

SELECT P.name, I.valid_to 
FROM Patients P 
JOIN Insurance I ON P.insurance_id = I.insurance_id 
WHERE I.valid_to BETWEEN '2023-01-01' AND '2023-12-31';


問題15: すべての患者の中で、家族の医療履歴に「糖尿病」が登録されている患者の名前を取得してください。

SELECT DISTINCT P.name 
FROM Patients P 
JOIN FamilyMedicalHistories F ON P.patient_id = F.patient_id 
WHERE F.medical_condition = '糖尿病';


問題16: アレルギー反応（reaction）が3種類以上ある患者の名前と、その患者のアレルギー反応の数を取得してください。

SELECT P.name, COUNT(DISTINCT A.reaction) AS number_of_allergies 
FROM Patients P 
JOIN Allergies A ON P.patient_id = A.patient_id 
GROUP BY P.name 
HAVING COUNT(DISTINCT A.reaction) >= 3;


問題17: すべての患者の中で、論理削除されていない（del_flagが'0'）患者のみを取得し、名前のアルファベット順に並べ替えてください。

SELECT P.name 
FROM Patients P 
WHERE P.del_flag = '0' 
ORDER BY P.name ASC;




問題18: 2つ以上のアレルギーを持っている患者の名前と、そのアレルギーの数を取得してください。


SELECT P.name, COUNT(A.allergy_id) AS number_of_allergies 
FROM Patients P 
JOIN Allergies A ON P.patient_id = A.patient_id 
GROUP BY P.name 
HAVING COUNT(A.allergy_id) >= 2;



