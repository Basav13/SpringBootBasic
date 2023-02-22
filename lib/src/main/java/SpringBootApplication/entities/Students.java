package SpringBootApplication.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {

	@Id
	private int roll_no;
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public Students(int roll_no, String name , int age)
	{
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
	}
	public Students()
	{
		super();
	}
	
	
}
