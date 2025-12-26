package martins.mattheus.javaoneforall.javacore.Xserialization.test;

import martins.mattheus.javaoneforall.javacore.Xserialization.domain.Seminar;
import martins.mattheus.javaoneforall.javacore.Xserialization.domain.Student;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Student student = new Student(1L, "João", "12345678");
        Seminar seminar = new Seminar("Maratona Java");
        student.setSeminar(seminar);
        serialize(student);
        deserialize();
    }

    private static void serialize(Student student) {
        Path path = Paths.get("folder/student.ser");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))) {
            objectOutputStream.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserialize() {
        Path path = Paths.get("folder/student.ser");
        try (ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(path))) {
            Student student = (Student) objectInputStream.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
