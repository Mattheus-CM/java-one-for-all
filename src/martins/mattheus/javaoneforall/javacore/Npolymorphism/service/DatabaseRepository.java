package martins.mattheus.javaoneforall.javacore.Npolymorphism.service;

import martins.mattheus.javaoneforall.javacore.Npolymorphism.repository.Repository;

public class DatabaseRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Salvando em um Banco de Dados!");
    }
}
