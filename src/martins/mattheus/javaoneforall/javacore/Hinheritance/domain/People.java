package martins.mattheus.javaoneforall.javacore.Hinheritance.domain;

public class People {
    protected String name;
    protected String cpf;
    protected Address address;

    static {
        System.out.println("Dentro do bloco Static people");
    }
    {
        System.out.println("Dentro do bloco 1 people");
    }
    {
        System.out.println("Dentro do bloco 2 people");
    }

    public People(String name) {
        System.out.println("Dentro do Construtor people");
        this.name = name;
    }

    public People(String name, String cpf) {
        this(name);
        this.cpf = cpf;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.cpf);
        System.out.println(this.address.getStreet() + " " + this.address.getZipCode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
