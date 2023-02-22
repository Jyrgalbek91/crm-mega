package impl;

import model.Student;

import java.io.*;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.Scanner;

public class StudentDaoImpl implements StudentDao {

    private final String PATH_FILE = "C:\\java\\crm-mega\\lib\\Student.txt";
    private final File STUDENT_FILE = new File(PATH_FILE);

    public StudentDaoImpl() {
        boolean isCreated = false;
        if (!STUDENT_FILE.exists()) {
            try {
                isCreated = STUDENT_FILE.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (isCreated) {
            System.out.println("Новый файл создан");
        }
    }

    @Override
    public void save(Student student) {
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(PATH_FILE, true));
            out.print(student.getId() + " ");
            out.print(student.getName() + " ");
            out.print(student.getSurname() + " ");
            out.print(student.getEmail() + " ");
            out.print(student.getPhone() + " ");
            out.print(student.getDateCreated().toString().substring(0, 22));
            out.println();

            out.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Student[] findAll() {

        Student[] students = new Student[200];
        try {
            Scanner scanner = new Scanner(STUDENT_FILE);
            for (int i = 0; scanner.hasNextLine(); i++) {

                Student student = new Student();
                student.setId(scanner.nextLong());
                student.setName(scanner.next());
                student.setSurname(scanner.next());
                student.setEmail(scanner.next());
                student.setPhone(scanner.next());
                student.setDateCreated(LocalDateTime.parse(scanner.nextLine().substring(1)));

                students[i] = student;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        return students;
    }


}
