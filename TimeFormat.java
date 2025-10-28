// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Args usage: <hh:mm>");
            return;
        }

        int hours, minutes;
        try {
            // In Java, the command-line arguments args[0], args[1], ... are represented
            // each by a string. In this program, the single "hh:mm" input is represented
            // by the single command-line string argument args[0].
            //
            // The following statement handles the hours part of the input.
            // It concatenates the empty string "" with the leftmost hour-digit.
            // It then concatenates the resulting string with the rightmost hour-digit,
            // and then uses parseInt to cast the resulting string as an int.
            hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
            // Does the same with the minutes part of the input.
            minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
            // Replace this comment with the rest of your code
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage());
            return;
        }

        String timeSuffix = "AM";
        if (hours > 12) {
            hours -= 12;
            timeSuffix = "PM";
        } else if (hours == 12) {
            timeSuffix = "PM";
        }

        System.out.printf("%02d:%02d %s%n", hours, minutes, timeSuffix);
	}
}