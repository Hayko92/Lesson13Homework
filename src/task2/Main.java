package task2;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        List<String> lines = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String s = bf.readLine();
            if(!s.matches("[A-Za-z0-9]\\.")) throw new MyOwnException("Wrong input");
            lines.add(s);
        }
         File file = new File("myFile.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        for (String line : lines) {
            fileWriter.append(line + "\n");
        }
        fileWriter.flush();
        fileWriter.close();


    }
}
