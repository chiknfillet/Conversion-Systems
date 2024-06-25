public class NumberConversion {
    private static String toConvert;
    private static String inputBase;
    private static String outputBase;

    public static void setInput(String input) {
        NumberConversion.toConvert = input;
    }

    public static void setBase(String input, String output) {
        NumberConversion.inputBase = input;
        NumberConversion.outputBase = output;
    }

    public static String result() {
        int decimalValue;

        // Convert input to decimal first
        switch (NumberConversion.inputBase) {
            case "Binary":
                decimalValue = Integer.parseInt(NumberConversion.toConvert, 2);
                break;
            case "Decimal":
                decimalValue = Integer.parseInt(NumberConversion.toConvert, 10);
                break;
            case "Hexadecimal":
                decimalValue = Integer.parseInt(NumberConversion.toConvert, 16);
                break;
            case "Octal":
                decimalValue = Integer.parseInt(NumberConversion.toConvert, 8);
                break;
            default:
                throw new IllegalArgumentException("Invalid input base: " + NumberConversion.inputBase);
        }

        // Convert from decimal to the output base
        switch (NumberConversion.outputBase) {
            case "Binary":
                return Integer.toBinaryString(decimalValue);
            case "Decimal":
                return Integer.toString(decimalValue);
            case "Hexadecimal":
                return Integer.toHexString(decimalValue).toUpperCase();
            case "Octal":
                return Integer.toOctalString(decimalValue);
            default:
                throw new IllegalArgumentException("Invalid output base: " + NumberConversion.outputBase);
        }
    }

    public static void main(String[] args) {
        // Example usage:
        setInput("1010");
        setBase("binary", "decimal");
        System.out.println(result()); // Should print 10

        setInput("A");
        setBase("hexadecimal", "binary");
        System.out.println(result()); // Should print 1010

        setInput("12");
        setBase("octal", "hexadecimal");
        System.out.println(result()); // Should print A

        setInput("10");
        setBase("decimal", "binary");
        System.out.println(result()); // Should print 1010
    }
}