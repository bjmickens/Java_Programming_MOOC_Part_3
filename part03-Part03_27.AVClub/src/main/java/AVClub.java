
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!(input.equals(""))) {
            String[] words = input.split(" ");

            for (String eachWord : words) {
                if (eachWord.contains("av")) {
                    System.out.println(eachWord);
                }
            }
            input = scanner.nextLine();
        }
    }
}
