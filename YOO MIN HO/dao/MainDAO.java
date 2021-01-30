package dao;

import java.util.List;

import vo.Commute;
import vo.Department;
import vo.DepartmentSchedual;
import vo.Employee;
import vo.EmployeeSchedual;

public interface MainDAO {
	
	void insertCommute(Commute c);
	
	Employee selectById(String id);
	
	Commute selectStartTime(String id);
	
	Commute selectEndTime(String id);
	
	List<EmployeeSchedual> selectEmployeeSchedual(Employee e);
	
	List<DepartmentSchedual> selectDepartmentSchedual(Department d);
	
	void updateCommute(Commute c);
}
