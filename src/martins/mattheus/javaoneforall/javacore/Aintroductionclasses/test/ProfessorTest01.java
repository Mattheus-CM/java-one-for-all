package martins.mattheus.javaoneforall.javacore.Aintroductionclasses.test;

import martins.mattheus.javaoneforall.javacore.Aintroductionclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Jiraya";
        professor.age = 40;
        professor.gender = 'M';

        System.out.println("Nome: " + professor.name + "\nIdade: " + professor.age + "\nSexo: " + professor.gender);
    }
}
