// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
        // Exit if the user hasn't provided enough command-line arguments.
        if (args.length != 4) {
            System.out.println("Args usage: <name1> <name2> <name3> <bill>");
            return;
        }

        String name1 = args[0], name2 = args[1], name3 = args[2];
        int bill;
        try {
            bill = Integer.parseInt(args[3]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid bill amount: " + args[3]);
            return;
        }

        double paymentPerDiner = Math.ceil((double) bill / 3);

        System.out.printf("Dear %s, %s, and %s: pay %.1f Shekels each.",
                name3, name2, name1, paymentPerDiner);
	}
}
