package martins.mattheus.javaoneforall.javacore.Npolymorphism.service;

import martins.mattheus.javaoneforall.javacore.Npolymorphism.repository.Repository;

public class FileRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Salvando em um arquivo!");
    }
}
