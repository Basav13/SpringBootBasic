package SpringBootApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringBootApplication.entities.Students;


public interface StudentDao extends JpaRepository<Students,Integer>{
	

}
