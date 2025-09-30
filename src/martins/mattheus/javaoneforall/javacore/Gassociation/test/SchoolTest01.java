package martins.mattheus.javaoneforall.javacore.Gassociation.test;

import martins.mattheus.javaoneforall.javacore.Gassociation.domain.Professor;
import martins.mattheus.javaoneforall.javacore.Gassociation.domain.School;

public class SchoolTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professors = {professor, professor2};
        School school = new School("Konoha", professors);

        school.print();
    }
}
