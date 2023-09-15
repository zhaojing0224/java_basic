-- Project Name : HrSys
-- Date/Time    : 2023/09/15 16:30:22
-- Author       : user
-- RDBMS Type   : Oracle Database
-- Application  : A5:SQL Mk-2

/*
  BackupToTempTable, RestoreFromTempTable疑似命令が付加されています。
  これにより、drop table, create table 後もデータが残ります。
  この機能は一時的に $$TableName のような一時テーブルを作成します。
*/

-- 基本給与計算
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

-- 給与明細作成
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

-- 勤怠情報
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

-- 従業員情報
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

comment on table SalaryCalculation is '基本給与計算';
comment on column SalaryCalculation.Employee_Code is '従業員コード';
comment on column SalaryCalculation.yeas_mouth is '年月';
comment on column SalaryCalculation.Base_Salary is '基本給与';
comment on column SalaryCalculation.Position_Allowance is '役職手当';
comment on column SalaryCalculation.Qualification_Allowance is '資格手当';
comment on column SalaryCalculation.Housing_Allowance is '住宅手当';
comment on column SalaryCalculation.Family_Allowance is '家族手当';
comment on column SalaryCalculation.Commute_Allowance is '通勤手当';
comment on column SalaryCalculation.Expected_Monthly_Overtime_Allowance is '月想定残業手当';
comment on column SalaryCalculation."Late-Night_Allowance" is '深夜手当';
comment on column SalaryCalculation.Holiday_Allowance is '休日手当';
comment on column SalaryCalculation.Total_Payment_Amount is '支給額合計';
comment on column SalaryCalculation.Health_Insurance is '健康保険';
comment on column SalaryCalculation.Employment_Insurance is '雇用保険';
comment on column SalaryCalculation.Welfare_Pension is '厚生年金';
comment on column SalaryCalculation."Long-Term_Care_Insurance" is '介護保険';
comment on column SalaryCalculation.Total_Insurance_Premiums is '保険料合計';
comment on column SalaryCalculation.Withholding_IncomeTax is '源泉所得税';
comment on column SalaryCalculation.Resident_Tax is '住民税';
comment on column SalaryCalculation.Total_Deductions is '控除額合計';
comment on column SalaryCalculation.Total_Taxes is '税金合計';
comment on column SalaryCalculation.Total_deductible is '差引支給合計';
comment on column SalaryCalculation.Deletion_Flag is '削除フラグ';
comment on column SalaryCalculation.Creation_Date is '作成日付';
comment on column SalaryCalculation.Update_Date is '更新日付';

comment on table PayslipCreation is '給与明細作成';
comment on column PayslipCreation.Employee_Code is '従業員コード';
comment on column PayslipCreation.yeas_mouth is '年月';
comment on column PayslipCreation.Month_Attendance_Days is '当月出勤日数';
comment on column PayslipCreation.Actual_Attendance_Days is '実際出勤日数';
comment on column PayslipCreation.Monthly_Working_Hours is '当月勤務時間';
comment on column PayslipCreation.Actual_Working_Hours is '実際勤務時間';
comment on column PayslipCreation.Absent_ays is '欠勤日数';
comment on column PayslipCreation.Holiday_Work_Days is '休日出勤日数';
comment on column PayslipCreation.Holiday_Working_Hours is '休日労働時間';
comment on column PayslipCreation.Weekday_Overtime is '平日普通残業';
comment on column PayslipCreation.Late_Night_Overtime is '深夜残業';
comment on column PayslipCreation.Tardiness_and_Early_Departure is '遅刻早退';
comment on column PayslipCreation.Remaining_Paid_Leave_Days is '有給残日数';
comment on column PayslipCreation.Consumed_Paid_Leave_Days is '有給残消化日数';
comment on column PayslipCreation.Base_Salary is '基本給与';
comment on column PayslipCreation.Position_Allowance is '役職手当';
comment on column PayslipCreation.Qualification_Allowance is '資格手当';
comment on column PayslipCreation.Housing_Allowance is '住宅手当';
comment on column PayslipCreation.Family_Allowance is '家族手当';
comment on column PayslipCreation.Commute_Allowance is '通勤手当';
comment on column PayslipCreation.Expected_Monthly_Overtime_Allowance is '月想定残業手当';
comment on column PayslipCreation."Late-Night_Allowance" is '深夜手当';
comment on column PayslipCreation.Holiday_Allowance is '休日手当';
comment on column PayslipCreation.Total_Payment_Amount is '支給額合計';
comment on column PayslipCreation.Health_Insurance is '健康保険';
comment on column PayslipCreation.Employment_Insurance is '雇用保険';
comment on column PayslipCreation.Welfare_Pension is '厚生年金';
comment on column PayslipCreation."Long-Term_Care_Insurance" is '介護保険';
comment on column PayslipCreation.Total_Insurance_Premiums is '保険料合計';
comment on column PayslipCreation.Withholding_IncomeTax is '源泉所得税';
comment on column PayslipCreation.Resident_Tax is '住民税';
comment on column PayslipCreation.Total_Deductions is '控除額合計';
comment on column PayslipCreation.Total_Taxes is '税金合計';
comment on column PayslipCreation.Total_deductible is '差引支給合計';
comment on column PayslipCreation.Deletion_Flag is '削除フラグ';
comment on column PayslipCreation.Creation_Date is '作成日付';
comment on column PayslipCreation.Update_Date is '更新日付';

comment on table Attendance is '勤怠情報';
comment on column Attendance.Employee_Code is '従業員コード';
comment on column Attendance.name is '名前';
comment on column Attendance.year_month is '年月';
comment on column Attendance.Month_Attendance_Days is '当月出勤日数';
comment on column Attendance.Actual_Attendance_Days is '実際出勤日数';
comment on column Attendance.Monthly_Working_Hours is '当月勤務時間';
comment on column Attendance.Actual_Working_Hours is '実際勤務時間';
comment on column Attendance.Absent_ays is '欠勤日数';
comment on column Attendance.Holiday_Work_Days is '休日出勤日数';
comment on column Attendance.Holiday_Working_Hours is '休日労働時間';
comment on column Attendance.Weekday_Overtime is '平日普通残業';
comment on column Attendance.Late_Night_Overtime is '深夜残業';
comment on column Attendance.Tardiness_and_Early_Departure is '遅刻早退';
comment on column Attendance.Remaining_Paid_Leave_Days is '有給残日数';
comment on column Attendance.Consumed_Paid_Leave_Days is '有給残消化日数';
comment on column Attendance.Remarks is '備考';
comment on column Attendance.Deletion_Flag is '削除フラグ';
comment on column Attendance.Creation_Date is '作成日付';
comment on column Attendance.Update_Date is '更新日付';

comment on table EmployeeInfo is '従業員情報';
comment on column EmployeeInfo.Employee_Code is '従業員コード';
comment on column EmployeeInfo.Name is '名前';
comment on column EmployeeInfo.Katakana is 'カタカナ';
comment on column EmployeeInfo.Gender is '性別';
comment on column EmployeeInfo.Birth is '生年月日';
comment on column EmployeeInfo.Phone_Number is '電話番号';
comment on column EmployeeInfo.Email is 'メールアドレス';
comment on column EmployeeInfo.Date_of_Joining is '入社日';
comment on column EmployeeInfo.Date_of_Resignation is '退職日';
comment on column EmployeeInfo.Postal_Code is '郵便番号';
comment on column EmployeeInfo.Address is '住所';
comment on column EmployeeInfo.Nationality is '国籍';
comment on column EmployeeInfo.Contract_Type is '契約形態';
comment on column EmployeeInfo.Salary_Type is '給与形態';
comment on column EmployeeInfo.Job_Title is '職種';
comment on column EmployeeInfo.Health_Insurance_Number is '健康保険番号';
comment on column EmployeeInfo.Labor_Insurance_Number is '労働保険番号';
comment on column EmployeeInfo.Residence_Card_Number is '在留カード番号';
comment on column EmployeeInfo.Period_of_Stay is '在留期間';
comment on column EmployeeInfo.Residence_Status is '在留資格';
comment on column EmployeeInfo.Deletion_Flag is '削除フラグ';
comment on column EmployeeInfo.Creation_Date is '作成日付';
comment on column EmployeeInfo.Update_Date is '更新日付';

