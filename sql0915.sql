-- Project Name : HrSys
-- Date/Time    : 2023/09/15 16:30:22
-- Author       : user
-- RDBMS Type   : Oracle Database
-- Application  : A5:SQL Mk-2

/*
  BackupToTempTable, RestoreFromTempTable�^�����߂��t������Ă��܂��B
  ����ɂ��Adrop table, create table ����f�[�^���c��܂��B
  ���̋@�\�͈ꎞ�I�� $$TableName �̂悤�Ȉꎞ�e�[�u�����쐬���܂��B
*/

-- ��{���^�v�Z
--* RestoreFromTempTable
create table SalaryCalculation (
  Employee_Code VARCHAR(5) not null
  , yeas_mouth VARCHAR(8) not null
  , Base_Salary FLOAT not null
  , Position_Allowance FLOAT
  , Qualification_Allowance FLOAT
  , Housing_Allowance FLOAT
  , Family_Allowance FLOAT
  , Commute_Allowance FLOAT
  , Expected_Monthly_Overtime_Allowance FLOAT
  , "Late-Night_Allowance" FLOAT
  , Holiday_Allowance FLOAT
  , Total_Payment_Amount FLOAT not null
  , Health_Insurance FLOAT not null
  , Employment_Insurance FLOAT not null
  , Welfare_Pension FLOAT not null
  , "Long-Term_Care_Insurance" FLOAT
  , Total_Insurance_Premiums FLOAT not null
  , Withholding_IncomeTax FLOAT
  , Resident_Tax FLOAT
  , Total_Deductions FLOAT not null
  , Total_Taxes FLOAT not null
  , Total_deductible FLOAT not null
  , Deletion_Flag VARCHAR(1) default 0 not null
  , Creation_Date TIMESTAMP not null
  , Update_Date TIMESTAMP not null
  , constraint SalaryCalculation_PKC primary key (Employee_Code,yeas_mouth)
) ;

-- ���^���׍쐬
--* RestoreFromTempTable
create table PayslipCreation (
  Employee_Code VARCHAR(5) not null
  , yeas_mouth VARCHAR(8) not null
  , Month_Attendance_Days INT not null
  , Actual_Attendance_Days INT
  , Monthly_Working_Hours FLOAT not null
  , Actual_Working_Hours FLOAT
  , Absent_ays INT
  , Holiday_Work_Days INT
  , Holiday_Working_Hours FLOAT
  , Weekday_Overtime FLOAT
  , Late_Night_Overtime FLOAT
  , Tardiness_and_Early_Departure FLOAT
  , Remaining_Paid_Leave_Days INT
  , Consumed_Paid_Leave_Days INT
  , Base_Salary FLOAT not null
  , Position_Allowance FLOAT
  , Qualification_Allowance FLOAT
  , Housing_Allowance FLOAT
  , Family_Allowance FLOAT
  , Commute_Allowance FLOAT
  , Expected_Monthly_Overtime_Allowance FLOAT
  , "Late-Night_Allowance" FLOAT
  , Holiday_Allowance FLOAT
  , Total_Payment_Amount FLOAT not null
  , Health_Insurance FLOAT not null
  , Employment_Insurance FLOAT not null
  , Welfare_Pension FLOAT not null
  , "Long-Term_Care_Insurance" FLOAT
  , Total_Insurance_Premiums FLOAT not null
  , Withholding_IncomeTax FLOAT not null
  , Resident_Tax FLOAT
  , Total_Deductions FLOAT not null
  , Total_Taxes FLOAT not null
  , Total_deductible FLOAT not null
  , Deletion_Flag VARCHAR(1) default 0 not null
  , Creation_Date TIMESTAMP not null
  , Update_Date TIMESTAMP not null
  , constraint PayslipCreation_PKC primary key (Employee_Code,yeas_mouth)
) ;

-- �Αӏ��
--* RestoreFromTempTable
create table Attendance (
  Employee_Code VARCHAR(5) not null
  , name VARCHAR(255) not null
  , year_month VARCHAR(8) not null
  , Month_Attendance_Days INT
  , Actual_Attendance_Days INT
  , Monthly_Working_Hours FLOAT
  , Actual_Working_Hours FLOAT
  , Absent_ays INT
  , Holiday_Work_Days INT
  , Holiday_Working_Hours FLOAT
  , Weekday_Overtime FLOAT
  , Late_Night_Overtime FLOAT
  , Tardiness_and_Early_Departure FLOAT
  , Remaining_Paid_Leave_Days INT
  , Consumed_Paid_Leave_Days INT
  , Remarks VARCHAR(255)
  , Deletion_Flag VARCHAR(1) default 0 not null
  , Creation_Date TIMESTAMP not null
  , Update_Date TIMESTAMP not null
  , constraint Attendance_PKC primary key (Employee_Code,year_month)
) ;

-- �]�ƈ����
--* RestoreFromTempTable
create table EmployeeInfo (
  Employee_Code VARCHAR(5) not null
  , Name VARCHAR(255) not null
  , Katakana VARCHAR(255) not null
  , Gender VARCHAR(1) default 0 not null
  , Birth DATE not null
  , Phone_Number VARCHAR(20) not null
  , Email VARCHAR(255) not null
  , Date_of_Joining DATE not null
  , Date_of_Resignation DATE
  , Postal_Code VARCHAR(8)
  , Address VARCHAR(255) not null
  , Nationality VARCHAR(255) not null
  , Contract_Type VARCHAR(255) not null
  , Salary_Type VARCHAR(50) not null
  , Job_Title VARCHAR(50)
  , Health_Insurance_Number VARCHAR(15) not null
  , Labor_Insurance_Number VARCHAR(15) not null
  , Residence_Card_Number VARCHAR(12)
  , Period_of_Stay DATE
  , Residence_Status VARCHAR(50)
  , Deletion_Flag VARCHAR(1) default 0 not null
  , Creation_Date TIMESTAMP not null
  , Update_Date TIMESTAMP not null
  , constraint EmployeeInfo_PKC primary key (Employee_Code)
) ;

comment on table SalaryCalculation is '��{���^�v�Z';
comment on column SalaryCalculation.Employee_Code is '�]�ƈ��R�[�h';
comment on column SalaryCalculation.yeas_mouth is '�N��';
comment on column SalaryCalculation.Base_Salary is '��{���^';
comment on column SalaryCalculation.Position_Allowance is '��E�蓖';
comment on column SalaryCalculation.Qualification_Allowance is '���i�蓖';
comment on column SalaryCalculation.Housing_Allowance is '�Z��蓖';
comment on column SalaryCalculation.Family_Allowance is '�Ƒ��蓖';
comment on column SalaryCalculation.Commute_Allowance is '�ʋΎ蓖';
comment on column SalaryCalculation.Expected_Monthly_Overtime_Allowance is '���z��c�Ǝ蓖';
comment on column SalaryCalculation."Late-Night_Allowance" is '�[��蓖';
comment on column SalaryCalculation.Holiday_Allowance is '�x���蓖';
comment on column SalaryCalculation.Total_Payment_Amount is '�x���z���v';
comment on column SalaryCalculation.Health_Insurance is '���N�ی�';
comment on column SalaryCalculation.Employment_Insurance is '�ٗp�ی�';
comment on column SalaryCalculation.Welfare_Pension is '�����N��';
comment on column SalaryCalculation."Long-Term_Care_Insurance" is '���ی�';
comment on column SalaryCalculation.Total_Insurance_Premiums is '�ی������v';
comment on column SalaryCalculation.Withholding_IncomeTax is '���򏊓���';
comment on column SalaryCalculation.Resident_Tax is '�Z����';
comment on column SalaryCalculation.Total_Deductions is '�T���z���v';
comment on column SalaryCalculation.Total_Taxes is '�ŋ����v';
comment on column SalaryCalculation.Total_deductible is '�����x�����v';
comment on column SalaryCalculation.Deletion_Flag is '�폜�t���O';
comment on column SalaryCalculation.Creation_Date is '�쐬���t';
comment on column SalaryCalculation.Update_Date is '�X�V���t';

comment on table PayslipCreation is '���^���׍쐬';
comment on column PayslipCreation.Employee_Code is '�]�ƈ��R�[�h';
comment on column PayslipCreation.yeas_mouth is '�N��';
comment on column PayslipCreation.Month_Attendance_Days is '�����o�Γ���';
comment on column PayslipCreation.Actual_Attendance_Days is '���ۏo�Γ���';
comment on column PayslipCreation.Monthly_Working_Hours is '�����Ζ�����';
comment on column PayslipCreation.Actual_Working_Hours is '���ۋΖ�����';
comment on column PayslipCreation.Absent_ays is '���Γ���';
comment on column PayslipCreation.Holiday_Work_Days is '�x���o�Γ���';
comment on column PayslipCreation.Holiday_Working_Hours is '�x���J������';
comment on column PayslipCreation.Weekday_Overtime is '�������ʎc��';
comment on column PayslipCreation.Late_Night_Overtime is '�[��c��';
comment on column PayslipCreation.Tardiness_and_Early_Departure is '�x������';
comment on column PayslipCreation.Remaining_Paid_Leave_Days is '�L���c����';
comment on column PayslipCreation.Consumed_Paid_Leave_Days is '�L���c��������';
comment on column PayslipCreation.Base_Salary is '��{���^';
comment on column PayslipCreation.Position_Allowance is '��E�蓖';
comment on column PayslipCreation.Qualification_Allowance is '���i�蓖';
comment on column PayslipCreation.Housing_Allowance is '�Z��蓖';
comment on column PayslipCreation.Family_Allowance is '�Ƒ��蓖';
comment on column PayslipCreation.Commute_Allowance is '�ʋΎ蓖';
comment on column PayslipCreation.Expected_Monthly_Overtime_Allowance is '���z��c�Ǝ蓖';
comment on column PayslipCreation."Late-Night_Allowance" is '�[��蓖';
comment on column PayslipCreation.Holiday_Allowance is '�x���蓖';
comment on column PayslipCreation.Total_Payment_Amount is '�x���z���v';
comment on column PayslipCreation.Health_Insurance is '���N�ی�';
comment on column PayslipCreation.Employment_Insurance is '�ٗp�ی�';
comment on column PayslipCreation.Welfare_Pension is '�����N��';
comment on column PayslipCreation."Long-Term_Care_Insurance" is '���ی�';
comment on column PayslipCreation.Total_Insurance_Premiums is '�ی������v';
comment on column PayslipCreation.Withholding_IncomeTax is '���򏊓���';
comment on column PayslipCreation.Resident_Tax is '�Z����';
comment on column PayslipCreation.Total_Deductions is '�T���z���v';
comment on column PayslipCreation.Total_Taxes is '�ŋ����v';
comment on column PayslipCreation.Total_deductible is '�����x�����v';
comment on column PayslipCreation.Deletion_Flag is '�폜�t���O';
comment on column PayslipCreation.Creation_Date is '�쐬���t';
comment on column PayslipCreation.Update_Date is '�X�V���t';

comment on table Attendance is '�Αӏ��';
comment on column Attendance.Employee_Code is '�]�ƈ��R�[�h';
comment on column Attendance.name is '���O';
comment on column Attendance.year_month is '�N��';
comment on column Attendance.Month_Attendance_Days is '�����o�Γ���';
comment on column Attendance.Actual_Attendance_Days is '���ۏo�Γ���';
comment on column Attendance.Monthly_Working_Hours is '�����Ζ�����';
comment on column Attendance.Actual_Working_Hours is '���ۋΖ�����';
comment on column Attendance.Absent_ays is '���Γ���';
comment on column Attendance.Holiday_Work_Days is '�x���o�Γ���';
comment on column Attendance.Holiday_Working_Hours is '�x���J������';
comment on column Attendance.Weekday_Overtime is '�������ʎc��';
comment on column Attendance.Late_Night_Overtime is '�[��c��';
comment on column Attendance.Tardiness_and_Early_Departure is '�x������';
comment on column Attendance.Remaining_Paid_Leave_Days is '�L���c����';
comment on column Attendance.Consumed_Paid_Leave_Days is '�L���c��������';
comment on column Attendance.Remarks is '���l';
comment on column Attendance.Deletion_Flag is '�폜�t���O';
comment on column Attendance.Creation_Date is '�쐬���t';
comment on column Attendance.Update_Date is '�X�V���t';

comment on table EmployeeInfo is '�]�ƈ����';
comment on column EmployeeInfo.Employee_Code is '�]�ƈ��R�[�h';
comment on column EmployeeInfo.Name is '���O';
comment on column EmployeeInfo.Katakana is '�J�^�J�i';
comment on column EmployeeInfo.Gender is '����';
comment on column EmployeeInfo.Birth is '���N����';
comment on column EmployeeInfo.Phone_Number is '�d�b�ԍ�';
comment on column EmployeeInfo.Email is '���[���A�h���X';
comment on column EmployeeInfo.Date_of_Joining is '���Г�';
comment on column EmployeeInfo.Date_of_Resignation is '�ސE��';
comment on column EmployeeInfo.Postal_Code is '�X�֔ԍ�';
comment on column EmployeeInfo.Address is '�Z��';
comment on column EmployeeInfo.Nationality is '����';
comment on column EmployeeInfo.Contract_Type is '�_��`��';
comment on column EmployeeInfo.Salary_Type is '���^�`��';
comment on column EmployeeInfo.Job_Title is '�E��';
comment on column EmployeeInfo.Health_Insurance_Number is '���N�ی��ԍ�';
comment on column EmployeeInfo.Labor_Insurance_Number is '�J���ی��ԍ�';
comment on column EmployeeInfo.Residence_Card_Number is '�ݗ��J�[�h�ԍ�';
comment on column EmployeeInfo.Period_of_Stay is '�ݗ�����';
comment on column EmployeeInfo.Residence_Status is '�ݗ����i';
comment on column EmployeeInfo.Deletion_Flag is '�폜�t���O';
comment on column EmployeeInfo.Creation_Date is '�쐬���t';
comment on column EmployeeInfo.Update_Date is '�X�V���t';

