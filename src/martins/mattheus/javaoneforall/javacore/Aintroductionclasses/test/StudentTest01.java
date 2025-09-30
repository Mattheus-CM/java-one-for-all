package martins.mattheus.javaoneforall.javacore.Aintroductionclasses.test;

import martins.mattheus.javaoneforall.javacore.Aintroductionclasses.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Mattheus";
        student.age = 23;
        student.gender = 'M';

        System.out.println("Nome: "+ student.name);
        System.out.println("Idade: "+ student.age);
        System.out.println("Sexo: "+ student.gender);
    }
}
