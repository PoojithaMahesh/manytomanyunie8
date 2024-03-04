package manytomanyunie8.cont;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomanyunie8.dao.CourseDao;
import manytomanyunie8.dto.Course;
import manytomanyunie8.dto.Student;

public class StudentCourseCont {
public static void main(String[] args) {
//	Course course1=new Course();
//	course1.setId(1);
//	course1.setName("Java");
//	course1.setFees(5000);
//	
//	
//	Course course2=new Course();
//	course2.setId(2);
//	course2.setName("AdvanceJava");
//	course2.setFees(5000);
//	
//	Course course3=new Course();
//	course3.setId(3);
//	course3.setName("SQL");
//	course3.setFees(5000);
//	
//	
//	Student student1=new Student();
//	student1.setId(1);
//	student1.setName("Ajitha");
//	student1.setAddress("mumbai");
//	
//	
//	List<Course> coursesofajith=new ArrayList<Course>();
//	coursesofajith.add(course1);
//	coursesofajith.add(course2);
//	coursesofajith.add(course3);
//	
//	student1.setCourses(coursesofajith);
//	
//	Student student2=new Student();
//	student2.setId(2);
//	student2.setName("siri");
//	student2.setAddress("mumbai");
//	
//	student2.setCourses(coursesofajith);
//	
//	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
//	EntityManager entityManager=entityManagerFactory.createEntityManager();
//	EntityTransaction entityTransaction=entityManager.getTransaction();
//	entityTransaction.begin();
//	
//	entityManager.persist(course1);
//	entityManager.persist(course2);
//	entityManager.persist(course3);
//	entityManager.persist(student1);
//	entityManager.persist(student2);
//	
//	entityTransaction.commit();
	
	
	CourseDao courseDao=new CourseDao();
	courseDao.deleteCourse(1);
	
	
	
	
	
	
	
	
}
}
