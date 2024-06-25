public class TemperatureConversion {
    private static Float toConvert;
    private static String inputUnit;
    private static String outputUnit;

    public static void setInput(Float input) {
        TemperatureConversion.toConvert = input;
    }

    public static void setUnit(String input, String output) {
        TemperatureConversion.inputUnit = input;
        TemperatureConversion.outputUnit = output;
    }

    public static Float result() {
        if (TemperatureConversion.inputUnit.equals(TemperatureConversion.outputUnit)) {
            return TemperatureConversion.toConvert; // No conversion needed if units are the same
        }

        switch (TemperatureConversion.inputUnit) {
            case "Celsius":
                switch (TemperatureConversion.outputUnit) {
                    case "Fahrenheit":
                        return (TemperatureConversion.toConvert * 9 / 5) + 32;
                    case "Kelvin":
                        return TemperatureConversion.toConvert + 273.15f;
                }
                break;

            case "Fahrenheit":
                switch (TemperatureConversion.outputUnit) {
                    case "Celsius":
                        return (TemperatureConversion.toConvert - 32) * 5 / 9;
                    case "Kelvin":
                        return (TemperatureConversion.toConvert - 32) * 5 / 9 + 273.15f;
                }
                break;

            case "Kelvin":
                switch (TemperatureConversion.outputUnit) {
                    case "Celsius":
                        return TemperatureConversion.toConvert - 273.15f;
                    case "Fahrenheit":
                        return (TemperatureConversion.toConvert - 273.15f) * 9 / 5 + 32;
                }
                break;

            default:
                // Handle cases where inputUnit or outputUnit is not recognized
                throw new IllegalArgumentException("Invalid unit: " + TemperatureConversion.inputUnit + " or " + TemperatureConversion.outputUnit);
        }
        return null; // Default return value if no valid conversion is found
    }
}
