package martins.mattheus.javaoneforall.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando Dados do banco...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo Dados do banco...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Fazendo checkagem de permissões no banco...");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize databaseloader");
    }
}
