import java.io.*;

//task1:
//        args[0] = "D:\\IT\\IPR\\Java\\logs\\main.log.2014-11-17"
//        args[1] = "D:\\IT\\IPR\\Java\\logs\\main.log.2014-11-17-separated-"

public class Main {

    public static void main(String[] args) throws IOException {

        File fullLog = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(fullLog));
        int fullLogLines = 0;
        while (br.readLine() != null) fullLogLines++;

        int dividedLogLines = fullLogLines / 5;

        BufferedReader logReader = new BufferedReader(new FileReader(fullLog));

        for (int i = 1; i < 6; i++) {
            FileWriter writer = new FileWriter(args[1] + i);
            for (int j = 0; j < dividedLogLines; j++) {
                String dividedLog = logReader.readLine() + "\n";
                writer.write(dividedLog);
            }
            writer.close();
        }
        br.close();
    }
}