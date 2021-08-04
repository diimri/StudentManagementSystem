package p;

import java.util.List;

//import p1.Student;
public interface StudentDAO {

    List<Student> getAllEmp();
    void insertEmp(Student emp);
    void deleteEmp(Student emp);
    
}
