package martins.mattheus.javaoneforall.javacore.Xserialization.domain;

import java.io.*;

public class Student implements Serializable {
    private static final long serialVersionUID = 2860882953976732807L;
    private Long id;
    private String name;
    private transient String password;
    private static final String SCHOOL_NAME = "DevDojo";
    private transient Seminar seminar;

    public Student(Long id, String name, String password) {
        System.out.println("Inside Constructor");
        this.id = id;
        this.name = name;
        this.password = password;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        try {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeUTF(seminar.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        try {
            objectInputStream.defaultReadObject();
            String seminarName = objectInputStream.readUTF();
            seminar = new Seminar(seminarName);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", SCHOOL_NAME='" + SCHOOL_NAME + '\'' +
                ", Seminar='" + seminar + '\'' +
                '}';
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
