public class VolumeConversion {
    private static double toConvert;
    private static String inputUnit;
    private static String outputUnit;

    public static void setInput(double input) {
        VolumeConversion.toConvert = input;
    }

    public static void setUnit(String input, String output) {
        VolumeConversion.inputUnit = input;
        VolumeConversion.outputUnit = output;
    }

    public static double result() {
        double ml;

        // Convert input to milliliters first
        switch (VolumeConversion.inputUnit) {
            case "Milliliters":
                ml = VolumeConversion.toConvert;
                break;
            case "Liters":
                ml = VolumeConversion.toConvert * 1000;
                break;
            case "Cubic Meters":
                ml = VolumeConversion.toConvert * 1_000_000;
                break;
            case "Cubic Centimeters":
                ml = VolumeConversion.toConvert; // 1 cm³ = 1 ml
                break;
            case "Gallons":
                ml = VolumeConversion.toConvert * 3785.41;
                break;
            default:
                throw new IllegalArgumentException("Invalid input unit: " + VolumeConversion.inputUnit);
        }

        // Convert from milliliters to the desired output unit
        switch (VolumeConversion.outputUnit) {
            case "Milliliters":
                return ml;
            case "Liters":
                return ml / 1000;
            case "Cubic Meters":
                return ml / 1_000_000;
            case "Cubic Centimeters":
                return ml; // 1 ml = 1 cm³
            case "Gallons":
                return ml / 3785.41;
            default:
                throw new IllegalArgumentException("Invalid output unit: " + VolumeConversion.outputUnit);
        }
    }

}