package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {

        University universityCHDTU = new University("CHDTU");
        universityCHDTU.addStudents(new Student("Alex", 42));
        universityCHDTU.addStudents(new Student("Bob", 50));

        Student Alice = new Student("Alice", 76);
        Student Jack = new Student("Jack", 10);
        Jack.setKnowledgeLevel(90);
        Student John = new Student("John");
        John.setKnowledgeLevel(1000);                // checking for min/max (will show warning message)
        universityCHDTU.addStudents(Alice, Jack, John, new Student("Den"));
        System.out.println("");
        System.out.println(universityCHDTU.getName() + "'s list: ");
        universityCHDTU.showAllStudentsInfo();

        Internship interlink = new Internship("Interlink");
        interlink.inviteNewStudents(universityCHDTU.getStudents());
        System.out.println("");
        System.out.println("Internship students list: ");
        interlink.addStudents(new Student("Grand"));
        interlink.showAllStudentsInfo();

    }
}
