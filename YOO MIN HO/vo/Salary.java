package vo;

import java.util.Date;

public class Salary {
	/*
	EMP_ID				VARCHAR2(10 BYTE)	No	사원번호	PK FK
	SALARY_DATE			DATE				No	지급일자	PK
	AFTER_TAX_SALARY	NUMBER(8,0)			No	실지급액
	INCOME_TAX			NUMBER(8,0)			No	소득세
	HIRE_INSURANCE		NUMBER(8,0)			No	고용보험
	TOTAL_DEDUCTION		NUMBER(8,0)			No	공제총액
	EXTRA_PAY			NUMBER(8,0)			No	기타수당
	POSITION_PAY		NUMBER(8,0)			No	직급수당
	BEFORE_TAX_SALARY	NUMBER(8,0)			No	지급총액
	LOCAL_INCOME_TAX	NUMBER(8,0)			No	지방소득세
	HEALTH_INSURANCE	NUMBER(8,0)			No	건강보험
	NATIONAL_PENSION	NUMBER(8,0)			No	국민연금
	*/
	
	public String emp_id;
	public Date salary_date;
	public int after_tax_salary;
	public int income_tax;
	public int hire_insurance;
	public int total_deduction;
	public int extra_pay;
	public int position_pay;
	public int before_tax_salary;
	public int local_income_tax;
	public int health_insurance;
	public int national_pension;
}
