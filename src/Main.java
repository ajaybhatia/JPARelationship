
import com.ajaybhatia.entity.Course;
import com.ajaybhatia.entity.Student;
import com.ajaybhatia.entity.controller.CourseJpaController;
import com.ajaybhatia.entity.controller.StudentJpaController;
import java.util.List;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajay
 */
public class Main {
    public static void main(String[] args) {
        CourseJpaController cController =
                new CourseJpaController(Persistence.createEntityManagerFactory("CoursePU"));
        StudentJpaController sController =
                new StudentJpaController(Persistence.createEntityManagerFactory("CoursePU"));
     
        // Courses
//        Course bca = new Course("BCA");
//        Course mba = new Course("MBA");
//        Course mca = new Course("MCA");
//        
//        cController.create(mca);
//        cController.create(mba);
//        cController.create(bca);
//        
//        // Students
//        Student john = new Student("John Doe", bca);
//        Student smith = new Student("Smith", bca);
//        Student jessie = new Student("Jessie Messy", mba);
//        Student kelvinKlinton = new Student("Kelvin Clinton", mca);
//        
//        sController.create(john);
//        sController.create(smith);
//        sController.create(jessie);
//        sController.create(kelvinKlinton);

//        List<Course> courses = cController.findCourseEntities();
//        
//        for (Course course : courses)
//            System.out.println(course.getName());
//        
//        List<Student> students = sController.findStudentEntities();
//        
//        for (Student student : students)
//            System.out.println(student.getName() + " is in " + student.getCourse().getName());
        
        Student student = sController.findStudent(4L);
        System.out.println(student.getName());
    }
}
