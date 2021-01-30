package dao;

import vo.DepartmentSchedual;

public interface DepartmentSchedualDAO {
	void insertSchedual(DepartmentSchedual ds);
	
	DepartmentSchedual selectSchedual(int no);
	
	void updateSchedual(DepartmentSchedual ds);
	
	void deleteSchedual(int no);
}
