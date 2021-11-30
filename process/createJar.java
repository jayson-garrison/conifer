package process;

import java.io.File;
import java.io.IOException;

public class createJar {

    private String name;
    
    private File userFile; 

    public createJar(String fileName, File file) {
        name = fileName;
        userFile = file;
    }

    public void execute() {
        try {
            command();
        } catch (IOException e) {
            System.out.println("IOException in command issue: unresolved");
        }
    }

    public void manifest(File file) {
        // create and write manifest.txt
        
    }

    public void command() throws IOException{
        Process process = Runtime.getRuntime().exec("nano test.txt");
    }


    
}
