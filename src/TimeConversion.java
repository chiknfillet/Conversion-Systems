public class TimeConversion {
    private static double toConvert;
    private static String inputUnit;
    private static String outputUnit;

    public static void setInput(double input) {
        TimeConversion.toConvert = input;
    }

    public static void setUnit(String input, String output) {
        TimeConversion.inputUnit = input;
        TimeConversion.outputUnit = output;
    }

    public static double result() {
        double seconds;

        // Convert input to seconds first
        switch (TimeConversion.inputUnit) {
            case "Seconds":
                seconds = TimeConversion.toConvert;
                break;
            case "Minutes":
                seconds = TimeConversion.toConvert * 60;
                break;
            case "Hours":
                seconds = TimeConversion.toConvert * 3600;
                break;
            case "Days":
                seconds = TimeConversion.toConvert * 86400;
                break;
            case "Weeks":
                seconds = TimeConversion.toConvert * 604800;
                break;
            case "Months":
                seconds = TimeConversion.toConvert * 2_629_746; // Assuming an average month length of 30.44 days
                break;
            case "Years":
                seconds = TimeConversion.toConvert * 31_556_952; // Assuming a year length of 365.25 days
                break;
            default:
                throw new IllegalArgumentException("Invalid input unit: " + TimeConversion.inputUnit);
        }

        // Convert from seconds to the desired output unit
        switch (TimeConversion.outputUnit) {
            case "Seconds":
                return seconds;
            case "Minutes":
                return seconds / 60;
            case "Hours":
                return seconds / 3600;
            case "Days":
                return seconds / 86400;
            case "Weeks":
                return seconds / 604800;
            case "Months":
                return seconds / 2_629_746; // Assuming an average month length of 30.44 days
            case "Years":
                return seconds / 31_556_952; // Assuming a year length of 365.25 days
            default:
                throw new IllegalArgumentException("Invalid output unit: " + TimeConversion.outputUnit);
        }
    }
}