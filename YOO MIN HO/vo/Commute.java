package vo;

import java.sql.Timestamp;

public class Commute {
	/*
	EMP_ID		VARCHAR2(10 BYTE)	No		사원번호		PK, FK
	START_TIME	TIMESTAMP(4)		No		출근시간		PK
	END_TIME	TIMESTAMP(4)		Yes		퇴근시간
	*/
	
	public String emp_id;
	public Timestamp start_time;
	public Timestamp end_time;
}
