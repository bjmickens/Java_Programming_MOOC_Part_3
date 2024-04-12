
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> birthYear = new ArrayList<>();
        double average = 0.0;

        String input = scanner.nextLine();

        while (!(input.equals(""))) {
            String[] inputs = input.split(",");
            names.add(inputs[0]);
            birthYear.add(Integer.valueOf(inputs[1]));

            input = scanner.nextLine();
        }

        String longestName = names.get(0);
        for (String name : names) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        System.out.println("Longest name: " + longestName);

        int sum = 0;
        for (int years : birthYear) {
            sum += years;
        }

        average = 1.0 * sum / birthYear.size();
        System.out.println("Average of the birth years: " + average);

        /*
         * String longestName = "";
         * int nameLength = 0;
         * int sum = 0;
         * double average = 0.0;
         * int count = 0;
         * 
         * String input = scanner.nextLine();
         * 
         * while (!(input.equals(""))) {
         * String[] inputs = input.split(",");
         * count++;
         * sum += Integer.valueOf(inputs[1]);
         * nameLength = inputs[0].length();
         * if (nameLength > longestName.length()) {
         * longestName = inputs[0];
         * }
         * input = scanner.nextLine();
         * }
         * average = 1.0 * sum / count;
         * System.out.println("Longest name: " + longestName);
         * System.out.println("Average of the birth years: " + average);
         */

    }
}
