package file;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        final String filename = "3corpsXYZ.txt";
        final String pathname = "C:\\Users\\gille\\IdeaProjects\\3 Corps V1\\";
        new WriteToFile(pathname,filename);

    }
}
