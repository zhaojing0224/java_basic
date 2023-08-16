CREATE TABLE patient_info

(
patient_id int,
name varchar(255),
sex varchar(8),
age int,
height decimal,
weigtht decimal,
birthday timestamp,
tel varchar(16),
mail varchar(255),
address varchar(255),
blood_type varchar, 
PRIMARY KEY (patient_id)
);

DROP TABLE patient_info;
