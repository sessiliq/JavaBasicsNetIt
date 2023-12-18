package ExeptionExercise;

import java.io.BufferedReader;
import java.io.FileInputStream;

public class ExeptionsExercise {

    public static void readFile(String filePath){
        FileInputStream input = new FileInputStream(filePath);
        BufferedReader in = new BufferedReader(new FileInputStream(filePath));

        String fileText = null;

        while ((fileText = in.readLine() != null)){
            System.out.println(fileText);
        }

        input.close();
        in.close();
    }
}
