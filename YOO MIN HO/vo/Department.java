package vo;

import java.util.List;

public class Department {
	/*
	DEPT_ID		VARCHAR2(10 BYTE)	No	부서번호	PK
	DEPT_NAME	VARCHAR2(20 BYTE)	No	부서이름
	*/
	
	public String dept_id;
	public String dept_name;
	
	public List<DepartmentSchedual> dept_schedual_VO;
}
