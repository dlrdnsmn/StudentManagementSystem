package studentManagementSystem.smsDemo.business.abstracts;

import java.util.List;

import studentManagementSystem.smsDemo.entities.concretes.Users;

public interface StudentService {
	
    List<Users> getAllStudents();
	
    Users saveStudent(Users user);
	
    Users getStudentById(Long id);
	
    Users updateStudent(Users user);
	
	void deleteStudentById(Long id);
}


