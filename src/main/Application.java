package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {

        University universityCHDTU = new University("CHDTU");
        universityCHDTU.addStudent(new Student("Alex", 12));
        universityCHDTU.addStudent(new Student("Den", 14));
        universityCHDTU.addStudent(new Student("Bob", 50));
        Student Alice = new Student("Alice", 76);
        Student Jack = new Student("Jack", 10);
        Jack.setKnowledgeLevel(80);
        universityCHDTU.addStudent(Alice);
        universityCHDTU.addStudent(Jack);
        System.out.println(universityCHDTU.getName() + "'s list: ");
        universityCHDTU.showAllStudentsInfo();

        Internship interlink = new Internship("Interlink");
        interlink.inviteNewStudents(universityCHDTU.getStudents());
        System.out.println("Internship students list: ");
        interlink.showAllStudentsInfo();

        interlink.setMinKnowledgeLevel(10);
        interlink.inviteNewStudents(universityCHDTU.getStudents());
        System.out.println("Internship students list 2: ");
        interlink.showAllStudentsInfo();

    }
}
