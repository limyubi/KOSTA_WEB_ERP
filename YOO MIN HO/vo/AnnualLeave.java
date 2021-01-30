package vo;

public class AnnualLeave {
	/*
	 EMP_ID		VARCHAR2(10 BYTE)	No    	사원번호           	PK
	 APPLY_YEAR	VARCHAR2(4 BYTE)	No		휴가적용연도      PK
	 MAX_DAY	NUMBER(2,0)			No		연차최대일수	
	 USED_DAY	NUMBER(2,0)			No		연차사용일수
	*/
	
	public String emp_id;
	public String apply_year;
	public int max_day;
	public int used_day;
}
