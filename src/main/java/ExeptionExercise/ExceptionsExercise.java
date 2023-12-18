package ExeptionExercise;

import java.io.*;

public class ExceptionsExercise {

    public static void readFile(String filePath) throws IOException {
        FileInputStream fullFilePath = new FileInputStream(filePath);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fullFilePath));


        String fileText = null;

        while ((fileText = bufferedReader.readLine()) != null){
            System.out.println(fileText);
        }

        bufferedReader.close();
        fullFilePath.close();
    }
}
