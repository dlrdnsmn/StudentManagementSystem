package studentManagementSystem.smsDemo.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import studentManagementSystem.smsDemo.business.abstracts.StudentService;
import studentManagementSystem.smsDemo.dataAccess.abstracts.StudentDao;
import studentManagementSystem.smsDemo.entities.concretes.Users;

@Service
public class StudentManager implements StudentService{
	
	private StudentDao studentDao;
	

	//const
	public StudentManager(StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}

	@Override
	public List<Users> getAllStudents() {
		// TODO Auto-generated method stub
		return studentDao.findAll();
	}

	@Override
	public Users saveStudent(Users user) {
		// TODO Auto-generated method stub
		
		return studentDao.save(user);
	}

	@Override
	public Users getStudentById(Long id) {
		// TODO Auto-generated method stub
		return  studentDao.findById(id).get();
	}

	@Override
	public Users updateStudent(Users user) {
		// TODO Auto-generated method stub
		//		 String sql="update students set first_name='"+user.getFirstName()+"', last_name="+user.getLastName()+",email='"+user.getEmail()+"' where id="+user.getId()+"";    
		return studentDao.save(user);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentDao.deleteById(id);	
	}

}
