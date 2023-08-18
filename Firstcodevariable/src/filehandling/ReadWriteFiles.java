package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFiles {
public void writeFiles(){
    File file = new File("D:/java/Firstcodevariable/src/filehandling/test");
    try {
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("This is just a test for file handling");
        fileWriter.close();
    } catch (IOException e){
        e.printStackTrace();
    }
}
}

