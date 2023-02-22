package SpringBootApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SpringBootApplication.entities.Students;
import SpringBootApplication.services.StudentServices;

@RestController
@RequestMapping("/api")
public class MyController {
	
	@Autowired
	private StudentServices studServ;
	
	@GetMapping("/home")
	public String home()
	{
		return "Welcome Home";
	}
	
	@GetMapping("/students")
	public List<Students> getStudents()
	{
		return this.studServ.getStudents();	
	}
	
	@GetMapping("/students/{studId}")
	public Students getSetudent(@PathVariable String studId)
	{
		return this.studServ.getStudent(Integer.parseInt(studId));
	}
	
	@PostMapping(path="/students",consumes="application/json")
	public Students addStudent(@RequestBody Students stud)
	{
		return this.studServ.addStudent(stud);
	}
	
	@PutMapping(path="/students",consumes="application/json")
	public Students updateStudent(@RequestBody Students stud)
	{
		this.studServ.updateStudent(stud);
		return stud;
	}
	
	@DeleteMapping("/students/{studId}")
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable String studId)
	{
		try
		{
			this.studServ.deleteStudent(Integer.parseInt(studId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); 
		}
	}

}
