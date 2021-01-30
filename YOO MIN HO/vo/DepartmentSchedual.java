package vo;

import java.util.Date;

public class DepartmentSchedual {
	/*
	DEPT_SCHEDULE_NO	NUMBER(6,0)			No	부서일정번호(시퀀스)	PK
	EMP_ID				VARCHAR2(20 BYTE)	No	사원번호			FK
	DEPT_ID				VARCHAR2(20 BYTE)	No	부서번호			FK
	DEPT_TITLE			VARCHAR2(100 BYTE)	No	부서일정제목
	DEPT_TASK_START		DATE				No	시작시간
	DEPT_TASK_END		DATE				No	종료시간
	DEPT_CONTENT		VARCHAR2(2000 BYTE)	Yes	부서일정내용
	*/
	
	public int dept_schedule_no;
	public String emp_id;
	public String dept_id;
	public String dept_title;
	public Date dept_task_start;
	public Date dept_task_end;
	public String dept_content;
	
}
