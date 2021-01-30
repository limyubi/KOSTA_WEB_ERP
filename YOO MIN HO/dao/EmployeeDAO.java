package dao;

import vo.Employee;

public interface EmployeeDAO {
	
	Employee selectEmployee(String id);
	
	void update(Employee e);
}
