// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		if (args.length != 1) {
            System.out.println("Args usage: <range>");
            return;
        }

        int range;
        try {
            range = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage());
            return;
        }

        int a = (int) (Math.random() * range);
        int b = (int) (Math.random() * range);
        int c = (int) (Math.random() * range);

        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int mid = a + b + c - min - max;

        System.out.printf("%d %d %d \n%d %d %d%n", a, b, c, min, mid, max);
	}
}
