package martins.mattheus.javaoneforall.javacore.Gassociation.domain;

public class Professor {
    private String name;
    private String researchField;
    private Seminar[] seminars;

    public Professor(String name) {
        this.name = name;
    }

    public Professor(String name, String researchField) {
        this(name);
        this.researchField = researchField;
    }

    public Professor(String name, String researchField, Seminar[] seminars) {
        this(name, researchField);
        this.seminars = seminars;
    }

    public void print() {
        System.out.println();
        System.out.println("Professor -> Nome: " + this.name + " - Especialidade: " + this.researchField);
        if (seminars == null) {
            System.out.println("Não possui seminários");
            return;
        }

        for (Seminar seminar : seminars) {
            System.out.println();
            System.out.println("Título do Seminário: " + seminar.getTitle());
            System.out.println("Local: " + seminar.getPlace().getAddress());
            if (seminar.getStudents() == null || seminar.getStudents().length == 0) {
                System.out.println("Não possui Alunos");
                continue;
            }
            System.out.println("\nAlunos");
            for (Student student: seminar.getStudents()) {
                System.out.println("Nome: " + student.getName() + " - Idade: " + student.getAge());
            }
        }
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
