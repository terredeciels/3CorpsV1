package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        String filename = "3corpsXYZ.txt";
        String pathname = "C:\\Users\\gille\\IdeaProjects\\3 Corps V1\\";
        File toFile = new File(pathname+filename);

        if (toFile.createNewFile()) System.out.println("Fichier: " + toFile.getName());
        else System.out.println("Le fichier existe");

        FileWriter myWriter = new FileWriter(filename);
        myWriter.write("Files in Java might be tricky, but it is fun enough!");

        myWriter.close();

        System.out.println("Succes");

    }
}
