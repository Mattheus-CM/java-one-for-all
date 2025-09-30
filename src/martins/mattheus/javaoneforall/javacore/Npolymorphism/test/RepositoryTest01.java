package martins.mattheus.javaoneforall.javacore.Npolymorphism.test;

import martins.mattheus.javaoneforall.javacore.Npolymorphism.repository.Repository;
import martins.mattheus.javaoneforall.javacore.Npolymorphism.service.DatabaseRepository;
import martins.mattheus.javaoneforall.javacore.Npolymorphism.service.FileRepository;

public class RepositoryTest01 {
    public static void main(String[] args) {
        Repository repository = new FileRepository();
        repository.save();
    }
}
