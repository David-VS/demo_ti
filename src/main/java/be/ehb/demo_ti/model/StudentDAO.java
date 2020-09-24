package be.ehb.demo_ti.model;

import java.util.ArrayList;

//singleton
public class StudentDAO {

    public static StudentDAO instance = new StudentDAO();
    private static ArrayList<Student> studList;

    private StudentDAO() {
        if(studList == null){
            studList = new ArrayList<>();
            studList.add(new Student("Joske", "Vermeulen", 1));
        }
    }

    public static ArrayList<Student> getStudList() {
        return studList;
    }
}
