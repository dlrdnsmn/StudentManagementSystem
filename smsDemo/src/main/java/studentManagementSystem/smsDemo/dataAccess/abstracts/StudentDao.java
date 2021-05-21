package studentManagementSystem.smsDemo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import studentManagementSystem.smsDemo.entities.concretes.Users;

public interface StudentDao extends JpaRepository<Users, Long>{

}
