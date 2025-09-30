package martins.mattheus.javaoneforall.javacore.Gassociation.test;

import martins.mattheus.javaoneforall.javacore.Gassociation.domain.Place;
import martins.mattheus.javaoneforall.javacore.Gassociation.domain.Professor;
import martins.mattheus.javaoneforall.javacore.Gassociation.domain.Seminar;
import martins.mattheus.javaoneforall.javacore.Gassociation.domain.Student;

public class AssociationTest01 {
    public static void main(String[] args) {
        Place place = new Place("Konoha");
        Student student1 = new Student("Naruto", 18);
        Student student2 = new Student("Gaara", 18);
        Student student3 = new Student("Sasuke", 18);
        Student[] students = {student1, student2};
        Seminar seminar = new Seminar("Se tornar Kage", place, students);
        Seminar[] seminars = {seminar};
        Professor professor = new Professor("Kakashi", "Hokage", seminars);

        professor.print();


    }
}
