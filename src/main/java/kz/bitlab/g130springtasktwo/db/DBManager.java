package kz.bitlab.g130springtasktwo.db;

import kz.bitlab.g130springtasktwo.entity.Student;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class DBManager {

    @Getter
    private static final List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1L, "Sanzhar", "S", 80, "B"));
        students.add(new Student(2L, "Kuat", "Abylay", 40, "D"));
        students.add(new Student(3L, "Kazy", "M", 50, "D"));
        students.add(new Student(4L, "Alisher", "A", 75, "B"));
    }

}
