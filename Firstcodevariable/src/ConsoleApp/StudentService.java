package ConsoleApp;

import java.util.List;

public interface StudentService {
    public void addStudent(Student s);
    public void deleteStudent(int index);
    List<Student> getAllStudent();
}
