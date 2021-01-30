package dao;

import vo.Employee;

public interface LogInDAO {
	
	/**
	 * 입력받은 id, pwd와 일치하는 저장소의 사원을 반환한다
	 * @param id
	 * @param pwd
	 * @return
	 */
	Employee selectByIdPwd(String id, String pwd);
}
