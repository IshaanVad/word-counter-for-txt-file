public class SpacesCounter {
    public static int countSpaces(String file) { //No ENTERS
        int wordCounter = 1;
        for (int i = 0; i < file.length(); i++) {
            if (file.charAt(i) == ' ') {
                wordCounter++;
            }
        }
        return wordCounter;
    }
}
