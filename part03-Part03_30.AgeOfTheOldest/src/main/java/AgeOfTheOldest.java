
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int oldest = -1;

        while (!(input.equals(""))) {
            String[] inputs = input.split(",");
            int age = Integer.valueOf(inputs[1]);
            if (age > oldest) {
                oldest = age;
            }
            input = scanner.nextLine();
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
