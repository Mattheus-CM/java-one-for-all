package martins.mattheus.javaoneforall.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileFolder = new File("folder");
        fileFolder.mkdir();

        File file = new File(fileFolder, "newFile.txt");
        file.createNewFile();

        File fileRenamed = new File(fileFolder, "file_renamed.txt");
        file.renameTo(fileRenamed);

        File folderRenamed = new File("folder2");
        fileFolder.renameTo(folderRenamed);
    }
}
