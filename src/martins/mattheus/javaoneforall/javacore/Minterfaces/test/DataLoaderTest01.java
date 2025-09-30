package martins.mattheus.javaoneforall.javacore.Minterfaces.test;

import martins.mattheus.javaoneforall.javacore.Minterfaces.domain.DataLoader;
import martins.mattheus.javaoneforall.javacore.Minterfaces.domain.DatabaseLoader;
import martins.mattheus.javaoneforall.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();
        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
