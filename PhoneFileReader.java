import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneFileReader {
    public static void readPhones() {
        try(FileReader fileReader = new FileReader("./homework_10/src/file.txt")) {

            Pattern p1 = Pattern.compile("\\(\\d\\d\\d\\)\\s\\d\\d\\d\\-\\d\\d\\d\\d");
            Pattern p2 = Pattern.compile("\\d\\d\\d\\-\\d\\d\\d\\-\\d\\d\\d\\d");

            BufferedReader br = new BufferedReader( (Reader) fileReader);
            while (br.ready()) {
                String line = br.readLine();
                Matcher m1 = p1.matcher(line);
                Matcher m2 = p2.matcher(line);
                if (m1.matches() || m2.matches()) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
