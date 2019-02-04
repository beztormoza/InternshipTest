package institution.interlink;

import institution.University;
import person.Student;

import java.util.List;
import java.util.stream.Collectors;

public class Internship extends University {

    private int minKnowledgeLevel = 50;

    public Internship(String name) {
        super(name);
    }

    public void inviteNewStudents(List<Student> students) {
        studentsList = filterStudents(students);
    }

    private List<Student> filterStudents(List<Student> students) {
        return students.stream()
                .filter(student -> student.getStudentKnowledgeLevel() > minKnowledgeLevel).collect(Collectors.toList());
    }

    //setters
    public void setMinKnowledgeLevel(int level) {
        if (level >= 0 && level <= 100)
            minKnowledgeLevel = level;
        else
            System.out.println("min 0 | max 100");
    }

}
