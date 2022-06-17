package Scripts;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Textify {
    public static void main(String[] args){
        // Collect input
        System.out.println("Enter a Word:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        // Write to file
        try{
            BufferedWriter textWriter = new BufferedWriter(new FileWriter("TextFiles\\output.txt"));
            BufferedWriter batchWriter = new BufferedWriter(new FileWriter("TextFiles\\output.bat"));
            textWriter.write(input.toUpperCase() + "\n");
            batchWriter.write("@echo off\ncolor 0a\ntitle My Name\necho "+input.toUpperCase()+"\n");
            for (int i = 1; i < 11; i++){
                String line = Characters.generateChar(' '+input, i);
                textWriter.write(line + "\n");
                batchWriter.write("echo " + line + "\n");
            }
            batchWriter.write("pause >Nul");
            textWriter.close();
            batchWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
