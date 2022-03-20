package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public WriteToFile(String pathname, String filename) throws IOException {
        File toFile = new File(pathname+filename);

        if (toFile.createNewFile()) System.out.println("Fichier: " + toFile.getName());
        else System.out.println("Le fichier existe");

        FileWriter writter = new FileWriter(filename);
        writter.write("une ligne");

        writter.close();

        System.out.println("Succes");
    }

}
