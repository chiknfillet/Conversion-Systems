
public class Conversion {
    private static Float toConvert;
    private static String inputUnit;
    private static String outputUnit;

    public static void setInput(Float input) {
        Conversion.toConvert = input;
    }

    public static void setUnit(String input, String output) {
        Conversion.inputUnit = input;
        Conversion.outputUnit = output;
    }

    public static Float result() {
        if (Conversion.inputUnit.equals(Conversion.outputUnit)) {
            return Conversion.toConvert; // No conversion needed if units are the same
        }

        switch (Conversion.inputUnit) {
            case "Inches":
                switch (Conversion.outputUnit) {
                    case "Feet":
                        Conversion.toConvert /= 12;
                        break;
                    case "Yard":
                        Conversion.toConvert /= 36;
                        break;
                    case "Miles":
                        Conversion.toConvert /= 63360;
                        break;
                    case "Millimeters":
                        Conversion.toConvert *= 25.4f;
                        break;
                    case "Centimeters":
                        Conversion.toConvert *= 2.54f;
                        break;
                    case "Meters":
                        Conversion.toConvert *= 0.0254f;
                        break;
                    case "Kilometers":
                        Conversion.toConvert *= 0.0000254f;
                        break;
                }
                break;

            case "Feet":
                switch (Conversion.outputUnit) {
                    case "Inches":
                        Conversion.toConvert *= 12;
                        break;
                    case "Yard":
                        Conversion.toConvert /= 3;
                        break;
                    case "Miles":
                        Conversion.toConvert /= 5280;
                        break;
                    case "Millimeters":
                        Conversion.toConvert *= 304.8f;
                        break;
                    case "Centimeters":
                        Conversion.toConvert *= 30.48f;
                        break;
                    case "Meters":
                        Conversion.toConvert *= 0.3048f;
                        break;
                    case "Kilometers":
                        Conversion.toConvert *= 0.0003048f;
                        break;
                }
                break;

            case "Yard":
                switch (Conversion.outputUnit) {
                    case "Inches":
                        Conversion.toConvert *= 36;
                        break;
                    case "Feet":
                        Conversion.toConvert *= 3;
                        break;
                    case "Miles":
                        Conversion.toConvert /= 1760;
                        break;
                    case "Millimeters":
                        Conversion.toConvert *= 914.4f;
                        break;
                    case "Centimeters":
                        Conversion.toConvert *= 91.44f;
                        break;
                    case "Meters":
                        Conversion.toConvert *= 0.9144f;
                        break;
                    case "Kilometers":
                        Conversion.toConvert *= 0.0009144f;
                        break;
                }
                break;

            case "Miles":
                switch (Conversion.outputUnit) {
                    case "Inches":
                        Conversion.toConvert *= 63360;
                        break;
                    case "Feet":
                        Conversion.toConvert *= 5280;
                        break;
                    case "Yard":
                        Conversion.toConvert *= 1760;
                        break;
                    case "Millimeters":
                        Conversion.toConvert *= 1_609_344f;
                        break;
                    case "Centimeters":
                        Conversion.toConvert *= 160_934.4f;
                        break;
                    case "Meters":
                        Conversion.toConvert *= 1609.344f;
                        break;
                    case "Kilometers":
                        Conversion.toConvert *= 1.609344f;
                        break;
                }
                break;

            case "Millimeters":
                switch (Conversion.outputUnit) {
                    case "Inches":
                        Conversion.toConvert /= 25.4f;
                        break;
                    case "Feet":
                        Conversion.toConvert /= 304.8f;
                        break;
                    case "Yard":
                        Conversion.toConvert /= 914.4f;
                        break;
                    case "Miles":
                        Conversion.toConvert /= 1_609_344f;
                        break;
                    case "Centimeters":
                        Conversion.toConvert /= 10;
                        break;
                    case "Meters":
                        Conversion.toConvert /= 1000;
                        break;
                    case "Kilometers":
                        Conversion.toConvert /= 1_000_000;
                        break;
                }
                break;

            case "Centimeters":
                switch (Conversion.outputUnit) {
                    case "Inches":
                        Conversion.toConvert /= 2.54f;
                        break;
                    case "Feet":
                        Conversion.toConvert /= 30.48f;
                        break;
                    case "Yard":
                        Conversion.toConvert /= 91.44f;
                        break;
                    case "Miles":
                        Conversion.toConvert /= 160_934.4f;
                        break;
                    case "Millimeters":
                        Conversion.toConvert *= 10;
                        break;
                    case "Meters":
                        Conversion.toConvert /= 100;
                        break;
                    case "Kilometers":
                        Conversion.toConvert /= 100_000;
                        break;
                }
                break;

            case "Meters":
                switch (Conversion.outputUnit) {
                    case "Inches":
                        Conversion.toConvert /= 0.0254f;
                        break;
                    case "Feet":
                        Conversion.toConvert /= 0.3048f;
                        break;
                    case "Yard":
                        Conversion.toConvert /= 0.9144f;
                        break;
                    case "Miles":
                        Conversion.toConvert /= 1609.344f;
                        break;
                    case "Millimeters":
                        Conversion.toConvert *= 1000;
                        break;
                    case "Centimeters":
                        Conversion.toConvert *= 100;
                        break;
                    case "Kilometers":
                        Conversion.toConvert /= 1000;
                        break;
                }
                break;

            case "Kilometers":
                switch (Conversion.outputUnit) {
                    case "Inches":
                        Conversion.toConvert /= 0.0000254f;
                        break;
                    case "Feet":
                        Conversion.toConvert /= 0.0003048f;
                        break;
                    case "Yard":
                        Conversion.toConvert /= 0.0009144f;
                        break;
                    case "Miles":
                        Conversion.toConvert /= 1.609344f;
                        break;
                    case "Millimeters":
                        Conversion.toConvert *= 1_000_000;
                        break;
                    case "Centimeters":
                        Conversion.toConvert *= 100_000;
                        break;
                    case "Meters":
                        Conversion.toConvert *= 1000;
                        break;
                }
                break;

            default:
                // Handle cases where inputUnit or outputUnit is not recognized
                throw new IllegalArgumentException("Invalid unit: " + Conversion.inputUnit + " or " + Conversion.outputUnit);
        }
        return Conversion.toConvert;
    }
}
