package vo;

import java.util.Date;

public class EmployeeSchedual {
	/*
	EMP_SCHEDULE_NO	NUMBER(6,0)			No	개인일정번호(시퀀스)	PK
	EMP_ID			VARCHAR2(10 BYTE)	No	사원번호			FK
	EMP_TITLE		VARCHAR2(100 BYTE)	No	개인일정제목
	EMP_TASK_STATUS	NUMBER(1,0)			No	개인일정구분
	EMP_TASK_START	DATE				No	시작시간
	EMP_TASK_END	DATE				No	종료시간
	EMP_CONTENT		VARCHAR2(2000 BYTE)	Yes	개인일정내용
	*/
	
	public int emp_schedule_no;
	public String emp_id;
	public String emp_title;
	public int emp_task_status;
	public Date emp_task_start;
	public Date emp_task_end;
	public String emp_content;
}
