public class DataTypeDemo {
    public static void main(String[] args) {

        byte byteValue = 100;
        short shortValue = 32000;
        int intValue = 100;
        long longValue = 100000L;
        float floatValue = 25.5f;
        double doubleValue = 123.456;
        char charValue = 'A';
        boolean booleanValue = true;

        System.out.println("Values of Different Data Types");
        System.out.println("--------------------------------");
        System.out.println("Byte value      : " + byteValue);
        System.out.println("Short value     : " + shortValue);
        System.out.println("Integer value   : " + intValue);
        System.out.println("Long value      : " + longValue);
        System.out.println("Float value     : " + floatValue);
        System.out.println("Double value    : " + doubleValue);
        System.out.println("Character       : " + charValue);
        System.out.println("Boolean         : " + booleanValue);

        System.out.println("\nMemory Size of Data Types");
        System.out.println("--------------------------");
        System.out.println("byte    : 1 byte");
        System.out.println("short   : 2 bytes");
        System.out.println("int     : 4 bytes");
        System.out.println("long    : 8 bytes");
        System.out.println("float   : 4 bytes");
        System.out.println("double  : 8 bytes");
        System.out.println("char    : 2 bytes");
        System.out.println("boolean : JVM dependent (typically 1 byte)");
    }
}
