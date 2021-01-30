package vo;

import java.util.Date;

public class Board {
	/*
	BOARD_NO		NUMBER(3,0)			No      게시글번호(시퀀스)	PK
	BOARD_TITLE		VARCHAR2(100 BYTE)	No		글제목
	BOARD_CONTENT	VARCHAR2(500 BYTE)	Yes		글내용
	EMP_ID			VARCHAR2(10 BYTE)	No		사원번호			FK
	BOARD_DATE		DATE				No		작성일자
	*/
	
	public int board_no;
	public String board_title;
	public String board_content;
	public String emp_id;
	public Date board_date;
}
