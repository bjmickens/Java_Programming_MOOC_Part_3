
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = { 5, 1, 3, 4, 2 };
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

/*
 * TMC solution ... I like the way they created another method
 * 
 * public static void printArrayInStars(int[] array) {
 * for (int stars : array) {
 * printStars(stars);
 * System.out.println();
 * }
 * }
 * 
 * public static void printStars(int howMany) {
 * while (howMany > 0) {
 * System.out.print("*");
 * howMany = howMany - 1;
 * }
 * }
 */