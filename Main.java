// бібліотека gson качається з гітхабу і додається до теки "external libraries" в ide.
// файл "file.txt" не був запушений з-за того, що він має бути різним для першої і другої програми. я не можу йти проти контракту

public class Main {
    public static void main(String[] args) {
        PhoneFileReader.readPhones();
        UserFileToJSON.userTXTToJSON();
        WordFrequency.wordFreqCalc();
    }
}