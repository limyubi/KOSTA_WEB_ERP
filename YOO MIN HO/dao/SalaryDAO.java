package dao;

import java.util.Date;
import java.util.List;

import vo.Salary;

public interface SalaryDAO {
	
	int getPageNum();
	
	List<Salary> selectByDate(Date start_date, Date end_date);
}
