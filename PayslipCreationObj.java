/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrsys.obj;

/**
 *
 * @author user
 */
public class PayslipCreationObj {

    // 従業員コード
    private String employeeCode;

    // 年月
    private String yearMonth;

    // 名前
    private String name;

    //当月出勤日数
    private String monthAttendanceDays;

    //実際出勤日数
    private String actualAttendanceDays;

    //当月勤務時間
    private String monthlyWorkingHours;

    //実際勤務時間
    private String actualWorkingHours;

    //欠勤日数
    private String absentAys;

    //休日出勤日数
    private String holidayWorkDays;

    //休日労働時間
    private String holidayWorkingHours;

    //平日普通残業
    private String weekdayOvertime;

    //深夜残業
    private String lateNightOvertime;

    //遅刻早退
    private String tardinessAndEarlyDeparture;

    //有給残日数
    private String remainingPaidLeaveDays;

    //有給残消化日数
    private String consumedPaidLeaveDays;

    //基本給与
    private Double baseSalary;

    //役職手当
    private Double positionAllowance;

    //資格手当
    private Double qualificationAllowance;

    //住宅手当
    private Double housingAllowance;

    //家族手当
    private Double familyAllowance;

    //通勤手当
    private Double commuteAllowance;

    //月想定残業手当
    private Double expectedMonthlyOvertimeAllowance;

    //深夜手当
    private Double lateNightAllowance;

    //休日手当
    private Double holidayAllowance;

    //支給額合計
    private Double totalPaymentAmount;

    //健康保険
    private Double healthInsurance;

    //雇用保険
    private Double employmentInsurance;

    //厚生年金
    private Double welfarePension;

    //介護保険
    private Double longTermCareInsurance;

    //保険料合計
    private Double totalInsurancePremiums;

    //源泉所得税
    private Double withholdingIncomeTax;

    //住民税
    private Double residentTax;

    //控除額合計
    private Double totalDeductions;

    //税金合計
    private Double totalTaxes;

    //差引支給合計
    private Double totalDeductible;

    // 検索
    private String Search;

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMonthAttendanceDays() {
        return monthAttendanceDays;
    }

    public void setMonthAttendanceDays(String monthAttendanceDays) {
        this.monthAttendanceDays = monthAttendanceDays;
    }

    public String getActualAttendanceDays() {
        return actualAttendanceDays;
    }

    public void setActualAttendanceDays(String actualAttendanceDays) {
        this.actualAttendanceDays = actualAttendanceDays;
    }

    public String getMonthlyWorkingHours() {
        return monthlyWorkingHours;
    }

    public void setMonthlyWorkingHours(String monthlyWorkingHours) {
        this.monthlyWorkingHours = monthlyWorkingHours;
    }

    public String getActualWorkingHours() {
        return actualWorkingHours;
    }

    public void setActualWorkingHours(String actualWorkingHours) {
        this.actualWorkingHours = actualWorkingHours;
    }

    public String getAbsentAys() {
        return absentAys;
    }

    public void setAbsentAys(String absentAys) {
        this.absentAys = absentAys;
    }

    public String getHolidayWorkDays() {
        return holidayWorkDays;
    }

    public void setHolidayWorkDays(String holidayWorkDays) {
        this.holidayWorkDays = holidayWorkDays;
    }

    public String getHolidayWorkingHours() {
        return holidayWorkingHours;
    }

    public void setHolidayWorkingHours(String holidayWorkingHours) {
        this.holidayWorkingHours = holidayWorkingHours;
    }

    public String getWeekdayOvertime() {
        return weekdayOvertime;
    }

    public void setWeekdayOvertime(String weekdayOvertime) {
        this.weekdayOvertime = weekdayOvertime;
    }

    public String getLateNightOvertime() {
        return lateNightOvertime;
    }

    public void setLateNightOvertime(String lateNightOvertime) {
        this.lateNightOvertime = lateNightOvertime;
    }

    public String getTardinessAndEarlyDeparture() {
        return tardinessAndEarlyDeparture;
    }

    public void setTardinessAndEarlyDeparture(String tardinessAndEarlyDeparture) {
        this.tardinessAndEarlyDeparture = tardinessAndEarlyDeparture;
    }

    public String getRemainingPaidLeaveDays() {
        return remainingPaidLeaveDays;
    }

    public void setRemainingPaidLeaveDays(String remainingPaidLeaveDays) {
        this.remainingPaidLeaveDays = remainingPaidLeaveDays;
    }

    public String getConsumedPaidLeaveDays() {
        return consumedPaidLeaveDays;
    }

    public void setConsumedPaidLeaveDays(String consumedPaidLeaveDays) {
        this.consumedPaidLeaveDays = consumedPaidLeaveDays;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Double getPositionAllowance() {
        return positionAllowance;
    }

    public void setPositionAllowance(Double positionAllowance) {
        this.positionAllowance = positionAllowance;
    }

    public Double getQualificationAllowance() {
        return qualificationAllowance;
    }

    public void setQualificationAllowance(Double qualificationAllowance) {
        this.qualificationAllowance = qualificationAllowance;
    }

    public Double getHousingAllowance() {
        return housingAllowance;
    }

    public void setHousingAllowance(Double housingAllowance) {
        this.housingAllowance = housingAllowance;
    }

    public Double getFamilyAllowance() {
        return familyAllowance;
    }

    public void setFamilyAllowance(Double familyAllowance) {
        this.familyAllowance = familyAllowance;
    }

    public Double getCommuteAllowance() {
        return commuteAllowance;
    }

    public void setCommuteAllowance(Double commuteAllowance) {
        this.commuteAllowance = commuteAllowance;
    }

    public Double getExpectedMonthlyOvertimeAllowance() {
        return expectedMonthlyOvertimeAllowance;
    }

    public void setExpectedMonthlyOvertimeAllowance(Double expectedMonthlyOvertimeAllowance) {
        this.expectedMonthlyOvertimeAllowance = expectedMonthlyOvertimeAllowance;
    }

    public Double getLateNightAllowance() {
        return lateNightAllowance;
    }

    public void setLateNightAllowance(Double lateNightAllowance) {
        this.lateNightAllowance = lateNightAllowance;
    }

    public Double getHolidayAllowance() {
        return holidayAllowance;
    }

    public void setHolidayAllowance(Double holidayAllowance) {
        this.holidayAllowance = holidayAllowance;
    }

    public Double getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(Double totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public Double getHealthInsurance() {
        return healthInsurance;
    }

    public void setHealthInsurance(Double healthInsurance) {
        this.healthInsurance = healthInsurance;
    }

    public Double getEmploymentInsurance() {
        return employmentInsurance;
    }

    public void setEmploymentInsurance(Double employmentInsurance) {
        this.employmentInsurance = employmentInsurance;
    }

    public Double getWelfarePension() {
        return welfarePension;
    }

    public void setWelfarePension(Double welfarePension) {
        this.welfarePension = welfarePension;
    }

    public Double getLongTermCareInsurance() {
        return longTermCareInsurance;
    }

    public void setLongTermCareInsurance(Double longTermCareInsurance) {
        this.longTermCareInsurance = longTermCareInsurance;
    }

    public Double getTotalInsurancePremiums() {
        return totalInsurancePremiums;
    }

    public void setTotalInsurancePremiums(Double totalInsurancePremiums) {
        this.totalInsurancePremiums = totalInsurancePremiums;
    }

    public Double getWithholdingIncomeTax() {
        return withholdingIncomeTax;
    }

    public void setWithholdingIncomeTax(Double withholdingIncomeTax) {
        this.withholdingIncomeTax = withholdingIncomeTax;
    }

    public Double getResidentTax() {
        return residentTax;
    }

    public void setResidentTax(Double residentTax) {
        this.residentTax = residentTax;
    }

    public Double getTotalDeductions() {
        return totalDeductions;
    }

    public void setTotalDeductions(Double totalDeductions) {
        this.totalDeductions = totalDeductions;
    }

    public Double getTotalTaxes() {
        return totalTaxes;
    }

    public void setTotalTaxes(Double totalTaxes) {
        this.totalTaxes = totalTaxes;
    }

    public Double getTotalDeductible() {
        return totalDeductible;
    }

    public void setTotalDeductible(Double totalDeductible) {
        this.totalDeductible = totalDeductible;
    }

    public String getSearch() {
        return Search;
    }

    public void setSearch(String Search) {
        this.Search = Search;
    }
}
