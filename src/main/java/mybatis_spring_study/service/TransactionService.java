package mybatis_spring_study.service;

import mybatis_spring_study.dto.Department;
import mybatis_spring_study.dto.Employee;

public interface TransactionService {
	/*public void registerTransaction(Department department, Employee employee);
	public void unRegisterTransaction(Department department, Employee employee);*/
	
	public void trRegister(Department department, Employee employee);
	public void trUnRegister(Department department, Employee employee);
}
