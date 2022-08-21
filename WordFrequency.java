import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class WordFrequency {
    public static void wordFreqCalc() {
        HashMap<String, Integer> wordies = new HashMap<>();

        try(FileReader fileReader = new FileReader("./homework_10/src/words.txt")) {

            BufferedReader br = new BufferedReader( (Reader) fileReader);

            while (br.ready()) {
                String line = br.readLine();
                String splitLine[] = line.split("\\s");

                for (int i = 0; i < splitLine.length; i++) {
                    if (wordies.containsKey(splitLine[i])) {
                        wordies.put(splitLine[i], wordies.get(splitLine[i])+1);
                    } else {
                        wordies.put(splitLine[i], 1);
                    }
                }
            }

            System.out.println(Arrays.asList(wordies));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
