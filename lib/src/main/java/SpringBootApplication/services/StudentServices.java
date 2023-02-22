package SpringBootApplication.services;

import java.util.List;

import SpringBootApplication.entities.Students;

public interface StudentServices {
	
	public List<Students> getStudents();
	public Students getStudent(int studId);
	public Students addStudent(Students stud);
	public Students updateStudent(Students stud);
	public void deleteStudent(int studId);
}
