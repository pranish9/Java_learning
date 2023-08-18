package filehandling;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteFiles {
    Scanner sc = new Scanner(System.in);
    public void writeFiles(){
    File file = new File("D:/java/Firstcodevariable/src/filehandling/test");
    try {
    FileWriter fileWriter = new FileWriter(file);
//        fileWriter.write("This is just a test for file handling");
//        fileWriter.close();
        System.out.println("Enter Text to write on File");
        String text = sc.nextLine();
        fileWriter.write(text);
        fileWriter.close();
    } catch (IOException e){
        e.printStackTrace();
    }
}
}

