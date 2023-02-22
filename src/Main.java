import dao.ManagerDao;
import dao.impl.ManagerDaoImpl;
import impl.StudentDao;
import impl.StudentDaoImpl;
import model.Manager;
import model.Student;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       /* Course course = new Course();
        course.setId(1);
        course.setName("Java");
        course.setPrice(15000);

        CourseFormat bootcamp = new CourseFormat();
        bootcamp.setId(1);
        bootcamp.setOnline(true);
        bootcamp.setFormat("Bootcamp");
        bootcamp.setLessonCountPerWeek(5);
        bootcamp.setDurationInWeek(18);
        bootcamp.setLessonDuration(3);

        course.setCourseFormat(bootcamp);

        System.out.println(course);

        */

        StudentDao studentDao = new StudentDaoImpl();
        Student student = new Student();
        student.setId(2);
        student.setName("Sher");
        student.setSurname("Avazov");
        student.setEmail("avazovS@gmail.com");
        student.setPhone("966555666611");


   //     studentDao.save(student);
      Student[] students = studentDao.findAll();
       System.out.println(Arrays.toString(students));
    }
}