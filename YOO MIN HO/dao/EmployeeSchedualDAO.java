package dao;

import vo.EmployeeSchedual;

public interface EmployeeSchedualDAO {
	
	void insertSchedual(EmployeeSchedual es);
	
	EmployeeSchedual selectSchedual(int no);
	
	void updateSchedual(EmployeeSchedual es);
	
	void deleteSchedual(int no);
}
