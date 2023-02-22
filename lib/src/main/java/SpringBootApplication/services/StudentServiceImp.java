package SpringBootApplication.services;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringBootApplication.dao.StudentDao;
import SpringBootApplication.entities.Students;

@Service
public class StudentServiceImp implements StudentServices {
	
	@Autowired
	private StudentDao studDao;
	
	//List<Students> list;
	
	public StudentServiceImp()
	{
//		list = new ArrayList<>();
//		Students s1 = new Students();
//		s1.setRoll_no(1);
//		s1.setName("Basav");
//		s1.setAge(21);
//		
//		Students s2 = new Students();
//		s2.setRoll_no(2);
//		s2.setName("Aryan");
//		s2.setAge(21);
//		
//		list.add(s1);
//		list.add(s2);
		
		
	}

	@Override
	public List<Students> getStudents() {
		// TODO Auto-generated method stub
		return studDao.findAll();
	}

	@Override
	public Students getStudent(int studId) {
		// TODO Auto-generated method stub
//		for(Students s : list)
//		{
//			if(s.getRoll_no() == studId)
//				return s;
//		}
//		return null;
		Optional<Students> st = studDao.findById(studId);
		
		Students stud = st.get();
		return stud;
	}

	@Override
	public Students addStudent(Students stud) {
		// TODO Auto-generated method stub
		//list.add(stud);
		studDao.save(stud);
		return stud;
	}

	@Override
	public Students updateStudent(Students stud) {
		// TODO Auto-generated method stub
//		list = list.stream().map(x -> {
//			if(x.getRoll_no() == studId)
//			{
//				x.setName(stud.getName());
//				x.setAge(stud.getAge());
//				x.setRoll_no(stud.getRoll_no());
//			}
//			return x;
//		}).collect(Collectors.toList());
		studDao.save(stud);
		return stud;
	}

	@Override
	public void deleteStudent(int studId) {
		// TODO Auto-generated method stub
		//list = list.stream().filter(s -> s.getRoll_no()!= studId).collect(Collectors.toList());
		
		studDao.deleteById(studId);
	}

}
