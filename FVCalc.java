// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Exit if the user hasn't provided enough command-line arguments.
        if (args.length != 3) {
            System.out.println("Args usage: <currentAmount> <annualInterestRate> <yearSpan>");
            return;
        }

        int currentAmount, annualInterestRate, yearSpan;
        try {
            currentAmount = Integer.parseInt(args[0]);
            annualInterestRate = Integer.parseInt(args[1]);
            yearSpan = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage());
            return;
        }

        double annualInterestRatePercentage = annualInterestRate / 100.0;
        // Interest rate formula:
        double futureValue = currentAmount * Math.pow(1 + annualInterestRatePercentage, yearSpan);

        System.out.printf("After %d years, $%d saved at %.1f%% will yield $%d.%n",
                yearSpan, currentAmount, (double) annualInterestRate, (int) futureValue);
	}
}