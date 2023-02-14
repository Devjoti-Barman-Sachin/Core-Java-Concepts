public class TypeCasting {
    public static void main(String args[])
    {
        byte b = 127; // -127 to 128 8 bit
        short s = 32767; // -32768 to 32767 16 bit
        int i = 2147483647; //-2147483648 to 2147483647 32 bit
        long l = 9223372036854775807l; //-9223372036854775808 to 9223372036854775807 64bit
        float f = 3.14167f; //±1.4E-45 to ±3.4028235E+38 32 bit
        double d = 1.79769313486231571; //±4.9E-324 to ±1.7976931348623157E+308 64 bit
        char c = 'a'; // \u0000 to \uFFFF 16 bit
        String str = "xyz";
        boolean bln = true; // true or false 1 bit

        //After type casting

        int i1 = (int)f;
        float f1 = (float)d;
        String str1 = Double.toString(d);
        String str2 = Float.toString(f1);

        System.out.println(i1);
        System.out.println(f1);
        System.out.println(str1);
        System.out.println(str2);


    }
}
