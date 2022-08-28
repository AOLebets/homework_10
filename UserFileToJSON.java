import java.io.*;
import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class UserFileToJSON {
    public static void userTXTToJSON() {

        File file = new File("test.json");

        try(FileReader fileReader = new FileReader("./homework_10/src/file.txt")) {

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            ArrayList jsonArray = new ArrayList();

            BufferedReader br = new BufferedReader( (Reader) fileReader);
            br.readLine();

            while (br.ready()) {
                String line = br.readLine();
                    String splitLine[] = line.split("\\s");

                    Map<String, Object> splittedLines = new HashMap<>();

                    splittedLines.put("name", splitLine[0]);
                    splittedLines.put("age", Integer.parseInt(splitLine[1]));

                    jsonArray.add(splittedLines);
                }
            String separator = FileSystems.getDefault().getSeparator();

            Writer writer = new FileWriter("."+ separator + "homework_10"+ separator + "src"+ separator + "user.json");
            gson.toJson(jsonArray, writer);
            writer.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
