package HelloWorld

public class HelloWorld {
    public static void main(String[] args) {
        javaPrimitiveTypes();

        javaArithmetic();

        javaIf();

        javaFor();
    }

    private static void javaPrimitiveTypes() {
        int a = 1;
        System.out.println(a);
        long l = 2L;
        System.out.println(l);
        float f = 1.2f;
        System.out.println(f);
        double d = 1.2;
        System.out.println(d);
        boolean b = true;
        System.out.println(b);
        char c = 'a';
        System.out.println(c);
        short s = 2;
        System.out.println(s);
        byte x = '0';
        System.out.println(x);
    }

    private static void javaArithmetic() {
        int a = 8, b = 5;
        int sum = a + b;
        System.out.println(sum);
        int substract = a - b;
        System.out.println(substract);
        int multi = a * b;
        System.out.println(multi);
        int div = a / b;
        System.out.println(div);
        int mod = a % b;
        System.out.println(mod);
    }

    private static void javaIf() {
        boolean statement = true;
        if (statement) {
            System.out.println("This statement is True.");
        } else {
            System.out.println("This statement is False.");
        }
    }

    private static void javaFor() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int length = array.length;
        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);
        }

        for (int a : array) {
            System.out.println(a);
        }
    }
}