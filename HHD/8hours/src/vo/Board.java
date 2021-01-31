package vo;

import java.util.Date;

public class Board extends Employee {
//	BOARD_NO	NUMBER(3,0)
//	BOARD_TITLE	VARCHAR2(100 BYTE)
//	BOARD_CONTENT	VARCHAR2(500 BYTE)
//	EMP_ID	VARCHAR2(10 BYTE)
//	BOARD_DATE	DATE
	
	public int BOARD_NO;
	public String BOARD_TITLE;
	public String BOARD_CONTENT;
//	public String EMP_ID;//Inherit from Employee
	public Date BOARD_DATE;

}
