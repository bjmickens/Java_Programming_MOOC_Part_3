
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = -1;
        String nameOfOldest = "";

        String input = scanner.nextLine();

        while (!(input.equals(""))) {
            String[] inputs = input.split(",");
            int age = Integer.valueOf(inputs[1]);
            if (age > oldestAge) {
                oldestAge = age;
                nameOfOldest = inputs[0];
            }

            input = scanner.nextLine();
        }

        System.out.println("Name of the oldest: " + nameOfOldest);
    }
}
