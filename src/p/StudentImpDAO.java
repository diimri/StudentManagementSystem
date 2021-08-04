package p;

import java.util.ArrayList;
import java.util.List;

//import p1.Student;
//import p1.StudentDAO;
public class StudentImpDAO implements StudentDAO {

    //list is working as a database
	private List<Student> emps=new ArrayList<>();
   // LoginDemo v=new LoginDemo();

    public List<Student> getAllEmp() {
        return emps;
    }

    @Override
    public void insertEmp(Student emp) {
        emps.add(emp);
    }

    @Override
    public void deleteEmp(Student emp) {
        emps.remove(emp);
    }
}
