package studentManagementSystem.smsDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import studentManagementSystem.smsDemo.dataAccess.abstracts.StudentDao;
import studentManagementSystem.smsDemo.entities.concretes.Users;

@SpringBootApplication
public class SmsDemoApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SmsDemoApplication.class, args);
	}
	
	@Autowired
	private StudentDao studentDao;

	
	public void run(String... args) throws Exception {
		

	}

}
