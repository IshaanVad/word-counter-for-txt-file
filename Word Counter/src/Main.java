import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.InputMismatchException;

public class Main {

    private static final String filePath = "/Users/Ishaan/Downloads/Word Counter/testWordCount.txt"; //... words in file

    public static void main(String[] args) {
        try {
            String stringFile = Files.readString(Paths.get(filePath));
            int amountOfWords = SpacesCounter.countSpaces(stringFile);
            System.out.printf("Amount of Words: %d", amountOfWords);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

}
