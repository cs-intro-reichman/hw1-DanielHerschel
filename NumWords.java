// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String[] args) {
	    if (args.length != 1) {
	        System.out.println("Args usage: <number>");
	        return;
	    }

        int number;
        try {
            number = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage());
            return;
        }

        int ones = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = number / 100;

        System.out.printf("%d hundreds, %d tens, and %d ones.%n", hundreds, tens, ones);
	}
}
