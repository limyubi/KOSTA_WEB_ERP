package vo;

import java.util.Date;

public class BoardComment {
	/*
	CMT_NO		NUMBER(4,0)			No		댓글번호(시퀀스)	PK
	EMP_ID		VARCHAR2(10 BYTE)	No		사원번호			FK
	CMT_CONTENT	VARCHAR2(500 BYTE)	Yes		댓글내용			
	BOARD_NO	NUMBER(4,0)			No		게시글번호			FK
	CMT_DATE	DATE				No		댓글작성일자
	*/
	
	public int cmt_no;
	public String emp_id;
	public String cmt_content;
	public int board_no;
	public Date cmt_date;
}
