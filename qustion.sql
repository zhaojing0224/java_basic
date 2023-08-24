1. SELECT:

Patients�e�[�u������S�Ă̊��ҏ����擾���Ă��������B

SELECT * FROM patients;

2. SELECT DISTINCT:

Patients�e�[�u������d�����Ȃ����[���A�h���X���擾���Ă��������B

SELECT DISTINCT email FROM patients;

3. WHERE:

1990�N�ȍ~�ɐ��܂ꂽ���҂̏���Patients�e�[�u������擾���Ă��������B

SELECT * FROM patients WHERE birthday>'1990/01/01';

4. AND & OR:

Patients�e�[�u������A1990�N�ȍ~�ɐ��܂�A���j���܂���Tokyo�ɏZ��ł��銳�҂̏����擾���Ă��������B

SELECT * FROM patients WHERE birthday>'1990/01/01' AND (gender='M' OR address='�����s');

5. ORDER BY:

Patients�e�[�u������S�Ă̊��ҏ��𐶔N�����̐V�������Ɏ擾���Ă��������B

SELECT * FROM patients ORDER BY birthday;

6. INSERT INTO:

�V�������ҁu���� �C�v����Patients�e�[�u���ɒǉ����Ă��������B

INSERT INTO patients (name,birthday,gender,address,phone,email,insurance_id,created_at,updated_at,del_flag) 
VALUES ('���� �C',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

7. UPDATE:

Patients�e�[�u���Łu�R�c ���Y�v���̏Z����Osaka�ɍX�V���Ă��������B

UPDATE patients SET address='Osaka' WHERE name='�R�c ���Y';

8. DELETE:

Patients�e�[�u�����烁�[���A�h���X��yamada@example.com�̊��ҏ����폜���Ă��������B

DELETE FROM patients WHERE email='yamada@example.com';

9. SELECT TOP (�܂���LIMIT):

SELECT * FROM Patients LIMIT 2

10. LIKE:

Patients�e�[�u������A���[���A�h���X��@example.com�ŏI��銳�҂̏����擾���Ă��������B

SELECT * FROM patients WHERE email LIKE '%@example.com';

11. IN:

Patients�e�[�u������A�Z����Tokyo�AOsaka�A�܂���Fukuoka�̂����ꂩ�̊��҂̏����擾���Ă��������B

SELECT * FROM patients WHERE address IN ('Tokyo','Osaka','Fukuoka');

12. BETWEEN:

Patients�e�[�u������A1985�N����1995�N�̊Ԃɐ��܂ꂽ���҂̏����擾���Ă��������B

SELECT * FROM patients WHERE birthday BETWEEN '1985/01/01' AND '1995/01/01';

13. AS:

Patients�e�[�u�����犳�҂̖��O���擾���A�񖼂�FullName�Ƃ��ĕ\�����Ă��������B

SELECT name AS FullName FROM patients;

14. JOIN (INNER JOIN���g�p):

Patients��Insurance�e�[�u�����������A���҂Ƃ��̕ی������擾���Ă��������B

SELECT Insurance.insurance_id,patients.name,Insurance.provider,Insurance.policy_no,Insurance.valid_from,Insurance.valid_to,Insurance.created_at,Insurance.updated_at,Insurance.del_flag
FROM patients INNER JOIN Insurance ON patients.patient_id=Insurance.insurance_id;

15. LEFT JOIN:

Patients�e�[�u����Allergies�e�[�u�����������A�A�����M�[��񂪂Ȃ����҂��܂߂đS�Ă̊��ҏ����擾���Ă��������B

SELECT Insurance.insurance_id,patients.name,Insurance.provider,Insurance.policy_no,Insurance.valid_from,Insurance.valid_to,Insurance.created_at,Insurance.updated_at,Insurance.del_flag
FROM patients LEFT JOIN Insurance ON patients.patient_id=Insurance.insurance_id;

16. RIGHT JOIN:

�iPostgreSQL�ł�RIGHT JOIN�̓T�|�[�g����Ă��܂����A�g���邱�Ƃ͏��Ȃ��ł��B���̂��߁ALEFT JOIN��INNER JOIN�Ŗ����쐬������������I�ł��B�j

17. FULL JOIN:

Patients�e�[�u����Insurance�e�[�u�����������A���҂��ی����������Ă��邩�ǂ����Ɋւ�炸�S�Ă̏����擾���Ă��������B

SELECT Patients.*, Insurance.* FROM Patients
FULL JOIN Insurance ON Patients.insurance_id=Insurance.insurance_id;

18. UNION:

Patients�e�[�u������1985�N��1990�N�ɐ��܂ꂽ���҂̖��O���擾���Ă��������B

SELECT * FROM patients WHERE birthday BETWEEN '1985/01/01' AND '1990/01/01';



19. NOT NULL:

NULL�łȂ��d�b�ԍ��������҂̏���Patients�e�[�u������擾���Ă��������B




20. UNIQUE:

�iUNIQUE�̓e�[�u���̐݌v/�\���Ɋւ��鐧��Ȃ̂ŁA����Ɋւ����̓I�Ȗ��͍쐬����̂�����ł��B�j

21. PRIMARY KEY:

�iPRIMARY KEY���e�[�u���̐݌v/�\���Ɋւ��鐧��Ȃ̂ŁA��̓I�Ȗ��͍쐬����̂�����ł��B�j

22. FOREIGN KEY:

Patients�e�[�u���ɂ���insurance_id�͂ǂ̃e�[�u�����Q�Ƃ��Ă��܂����H

Insurance;

23. CHECK:

�iCHECK������g�p���āAgender���M�܂���F�݂̂����͂����悤��Patients�e�[�u����ݒ肵�Ă��������B�j



24. DEFAULT:

�idel_flag��̃f�t�H���g�l�Ƃ���0��ݒ肵�Ă��������B�j



25. CREATE INDEX:

Patients�e�[�u����email��ɃC���f�b�N�X���쐬���Ă��������B

CREATE INDEX index_email ON patients (email)

26. DROP:

���O��test_table�̃e�[�u�����폜���Ă��������B

DROP TABLE test_table

27. ALTER:

Patients�e�[�u���ɐV������emergency_contact��ǉ����Ă��������B

ALTER TABLE patients ADD emergency_contact VARCHAR(50);

28. AVG():

FamilyMedicalHistories�e�[�u�����畽�ϐf�f�N����v�Z���Ă��������B

SELECT AVG(age_at_diagnosis) FROM FamilyMedicalHistories;

29. COUNT():

Allergies�e�[�u���ŃA�����M�[�̏�񂪓o�^����Ă��銳�҂̐����v�Z���Ă��������B

SELECT COUNT(allergy_id) FROM Allergies;

30. FIRST() & LAST():

�i����: FIRST() �� LAST() ��PostgreSQL�ɂ͑��݂��Ȃ��֐��ł��B����DBMS�ł͎g���邩������܂��񂪁A�����ł̓X�L�b�v���܂��B�j



31. MAX() & MIN():

FamilyMedicalHistories�e�[�u������ł��Ⴂ�f�f�N��ƍł������f�f�N����擾���Ă��������B

SELECT MAX(age_at_diagnosis) FROM FamilyMedicalHistories;

SELECT MIN(age_at_diagnosis) FROM FamilyMedicalHistories;


32. SUM():

�i��F����̏����Ɋ�Â��J�����̍��v���擾����ꍇ�ȂǂɎg�p���܂��B�����ł͋�̓I�Ȗ����쐬����̂�����̂ŁA�X�L�b�v���܂��B�j



33. GROUP BY:

Allergies�e�[�u�����g�p���āA�e����(substance)�ɑ΂���A�����M�[�����̐����J�E���g���Ă��������B

SELECT substance, COUNT(Allergies) AS reaction
FROM Allergies
GROUP BY substance;

34. HAVING:

Allergies�e�[�u�����g�p���āA3�l�ȏ�̊��҂������Ă���A�����M�[�������擾���Ă��������B



35. EXISTS:

Insurance�������Ă��銳�҂̏���Patients�e�[�u������擾���Ă��������B



36. LEN():

�i����: PostgreSQL�ł�LEN()�֐���LENGTH()�Ƃ��Ď�������Ă��܂��B�jPatients�e�[�u�����疼�O�̒�����5�����ȏ�̊��҂��擾���Ă��������B

37. ROUND():

FamilyMedicalHistories�e�[�u���̐f�f�N��̕��ς��������ʂŎl�̌ܓ����Ď擾���Ă��������B

SELECT ROUND(AVG(age_at_diagnosis), 2) FROM FamilyMedicalHistories;

38. NOW():

���݂̓��t�Ǝ������擾���Ă��������B

SELECT NOW() FROM Patients;


--------------------------------------------------------------------------------------------------------------------------------------------
*********************************************************************************************************************************************
--------------------------------------------------------------------------------------------------------------------------------------------

���1: Patients�e�[�u���̂��ׂĂ̊��҂ɑ΂��āA�ނ炪�����Ă���A�����M�[����(substance)�Ɣ���(reaction)���ꗗ�\�����Ă��������B�������A�A�����M�[�̏�񂪂Ȃ����҂����X�g�ɕ\�����Ă��������B

SELECT P.name, A.substance, A.reaction 
FROM Patients P 
LEFT JOIN Allergies A ON P.patient_id = A.patient_id;


���2: Patients�e�[�u����1995�N�ȍ~�ɐ��܂ꂽ���҂��A�ǂ̕ی��v���o�C�_�[�iprovider�j�ɉ������Ă���̂����ꗗ�\�����Ă��������B

SELECT P.name, I.provider 
FROM Patients P 
INNER JOIN Insurance I ON P.insurance_id = I.insurance_id 
WHERE P.birthday >= '1995-01-01';



���3: FamilyMedicalHistories�e�[�u���Łu���A�a�v�̈�×����������҂̖��O�Ƃ��̊֌W�҂̏����擾���Ă��������B

SELECT P.name, F.relationship, F.age_at_diagnosis 
FROM Patients P 
INNER JOIN FamilyMedicalHistories F ON P.patient_id = F.patient_id 
WHERE F.medical_condition = '���A�a';


���4: �ی����_���폜�idel_flag��1�j����Ă��銳�҂̖��O�ƃ��[���A�h���X���擾���Ă��������B

SELECT P.name, P.email 
FROM Patients P 
INNER JOIN Insurance I ON P.insurance_id = I.insurance_id 
WHERE I.del_flag = '1';


���5: �e�ی��v���o�C�_�[�iprovider�j�̉����Ґ����v�Z���Ă��������B���ʂ͉����Ґ����������ɕ��ׂĂ��������B

SELECT I.provider, COUNT(P.patient_id) AS number_of_patients 
FROM Insurance I
LEFT JOIN Patients P ON I.insurance_id = P.insurance_id 
GROUP BY I.provider 
ORDER BY number_of_patients DESC;



���6: �A�����M�[���������Ȃ����҂̖��O�Ɛ��N�������擾���Ă��������B

SELECT P.name, P.birthday 
FROM Patients P 
LEFT JOIN Allergies A ON P.patient_id = A.patient_id 
WHERE A.allergy_id IS NULL;



���7: Patients �e�[�u���� FamilyMedicalHistories �e�[�u�����g���āA���g�܂��͉Ƒ��ɐS�������̗��������銳�҂̖��O���擾���Ă��������B

SELECT DISTINCT P.name 
FROM Patients P 
LEFT JOIN FamilyMedicalHistories F ON P.patient_id = F.patient_id 
WHERE F.medical_condition LIKE '%�S��%';


���8: �_���폜���ꂽ���R�[�h�idel_flag��1�j�����O���A���ׂẴe�[�u���iPatients, Insurance, Allergies, FamilyMedicalHistories�j����f�[�^���擾���Ă��������B

#NAME?
SELECT * FROM Patients WHERE del_flag != '1';

#NAME?
SELECT * FROM Insurance WHERE del_flag != '1';

#NAME?
SELECT * FROM Allergies WHERE del_flag != '1';

#NAME?
SELECT * FROM FamilyMedicalHistories WHERE del_flag != '1';


���9: ���҂��������Ă���ی��̗L�������ivalid_to�j��2023�N12��31���ȑO�̊��҂̖��O�Ƃ��̕ی��̗L���������擾���Ă��������B

SELECT P.name, I.valid_to 
FROM Patients P 
JOIN Insurance I ON P.insurance_id = I.insurance_id 
WHERE I.valid_to <= '2023-12-31';


���10: �A�����M�[�̕����isubstance�j���ƂɁA�����ireaction�j�̈قȂ鐔���v�Z���Ă��������B


SELECT A.substance, COUNT(DISTINCT A.reaction) AS number_of_distinct_reactions 
FROM Allergies A 
GROUP BY A.substance;



���11: �j���igender��'M'�j�̒��ōł��N��̊��҂̖��O�Ɛ��N�������擾���Ă��������B

SELECT P.name, P.birthday 
FROM Patients P 
WHERE P.gender = 'M' 
ORDER BY P.birthday ASC 
LIMIT 1;


���12: ���ׂĂ̊��҂̒��ŁA�Ƒ��̈�×������5���ȏ゠�銳�҂̖��O�Ƃ��̉Ƒ��̈�×������̌������擾���Ă��������B

SELECT P.name, COUNT(F.history_id) AS number_of_family_histories 
FROM Patients P 
LEFT JOIN FamilyMedicalHistories F ON P.patient_id = F.patient_id 
GROUP BY P.name 
HAVING COUNT(F.history_id) >= 5;


���13: ���҂̏Z���iaddress�j���u�����v���܂ނ��ׂĂ̊��҂̖��O�ƃ��[���A�h���X���擾���āA���O�̃A���t�@�x�b�g���ɕ��ׂĂ��������B

SELECT P.name, P.email 
FROM Patients P 
WHERE P.address LIKE '%����%' 
ORDER BY P.name ASC;


���14: 2023�N1��1������2023�N12��31���܂ł̊��ԂɁA�ی��̗L���������؂�銳�҂̖��O�ƁA���̕ی��̗L�����������X�g�A�b�v���Ă��������B

SELECT P.name, I.valid_to 
FROM Patients P 
JOIN Insurance I ON P.insurance_id = I.insurance_id 
WHERE I.valid_to BETWEEN '2023-01-01' AND '2023-12-31';


���15: ���ׂĂ̊��҂̒��ŁA�Ƒ��̈�×����Ɂu���A�a�v���o�^����Ă��銳�҂̖��O���擾���Ă��������B

SELECT DISTINCT P.name 
FROM Patients P 
JOIN FamilyMedicalHistories F ON P.patient_id = F.patient_id 
WHERE F.medical_condition = '���A�a';


���16: �A�����M�[�����ireaction�j��3��ވȏ゠�銳�҂̖��O�ƁA���̊��҂̃A�����M�[�����̐����擾���Ă��������B

SELECT P.name, COUNT(DISTINCT A.reaction) AS number_of_allergies 
FROM Patients P 
JOIN Allergies A ON P.patient_id = A.patient_id 
GROUP BY P.name 
HAVING COUNT(DISTINCT A.reaction) >= 3;


���17: ���ׂĂ̊��҂̒��ŁA�_���폜����Ă��Ȃ��idel_flag��'0'�j���҂݂̂��擾���A���O�̃A���t�@�x�b�g���ɕ��בւ��Ă��������B

SELECT P.name 
FROM Patients P 
WHERE P.del_flag = '0' 
ORDER BY P.name ASC;




���18: 2�ȏ�̃A�����M�[�������Ă��銳�҂̖��O�ƁA���̃A�����M�[�̐����擾���Ă��������B


SELECT P.name, COUNT(A.allergy_id) AS number_of_allergies 
FROM Patients P 
JOIN Allergies A ON P.patient_id = A.patient_id 
GROUP BY P.name 
HAVING COUNT(A.allergy_id) >= 2;



