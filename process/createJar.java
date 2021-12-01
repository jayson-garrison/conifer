/**
 * Author: Jayson C. Garrison
 * Inception: 11/30/21
 * Description: process to make the jar file
 * Project: conifer
 */
package process;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class createJar {

    private String name;
    
    private File userFile; 

    private File userRoot;

    public createJar(String fileName, File file, File root) {
        name = fileName;
        userFile = file;
        userRoot = root;
    } // end constructor

    public void execute() {
        try {
            manifest();
            command();
        } catch (IOException e) {
            System.out.println("IOException in command issue: unresolved");
        } // end try catch
    } // end execute

    public void manifest() {
        // create and write manifest.txt
        try {
            // write to file 
            FileWriter writeIt = new FileWriter( "mani.txt" );
            PrintWriter out = new PrintWriter( writeIt );
            out.println("Main-Class: " + userFile.getName().substring(0, userFile.getName().indexOf(".")));
            // close
            out.close();

            // move file to output directory
            File manifest = new File("mani.txt");
            System.out.print("Debug: Does manifest exist? -");
            System.out.println(manifest.exists()); 
            // System.out.println(manifest.getAbsolutePath());
            // System.out.println(manifest.getPath()); // exists

            // move manifest.txt
            if (manifest.renameTo(new File("output/manifest.txt"))) {
                manifest.delete();
                System.out.println("manifest.txt moved to output/");
            }
            else {
                System.out.println("Failure to move manifest.txt to output; unresolved");
            }

            

        } catch (IOException e) {
            System.out.println("Error creating manifest.txt: unresolved");
        }
    } // end manifest

    public void command() throws IOException{
        //Process process = Runtime.getRuntime().exec("nano test.txt");
    } // end command
} // end createJar
