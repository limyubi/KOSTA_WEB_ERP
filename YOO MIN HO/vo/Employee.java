package vo;

import java.util.Date;
import java.util.List;

public class Employee {
	/*
	EMP_ID		VARCHAR2(10 BYTE)	No		사원번호	PK
	DEPT_ID		VARCHAR2(10 BYTE)	No		부서번호	FK
	POSITION	VARCHAR2(20 BYTE)	No		직급
	HIRE_DATE	DATE				No		입사일자
	OFFICE_TEL	VARCHAR2(13 BYTE)	Yes		내선번호
	PASSWORD	VARCHAR2(20 BYTE)	No		비밀번호
	EMP_NAME	VARCHAR2(20 BYTE)	No		이름
	EMAIL		VARCHAR2(20 BYTE)	Yes		이메일
	BIRTH_DATE	DATE				No		생년월일
	H_PHONE		VARCHAR2(13 BYTE)	Yes		휴대전화번호
	EMP_STATUS	NUMBER(1,0)			No		사원구분
	ADDRESS		VARCHAR2(100 BYTE)	Yes		주소
	*/
	
	public String emp_id;
	//public String dept_id;
	public String position;
	public Date hire_date;
	public String office_tel;
	public String password;
	public String emp_name;
	public String email;
	public Date birth_date;
	public String h_phone;
	public int emp_status;
	public String address;
	
	public Department department_VO;
	public List<AnnualLeave> annual_leave_VO;
	public EmployeeSchedual employee_schedual_VO;
	public List<Salary> salary_VO;
	public List<Commute> commute_VO;
}
