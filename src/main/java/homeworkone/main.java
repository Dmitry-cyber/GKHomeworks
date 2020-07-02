package homeworkone;

public class main {
    
    public static void main(String[] args) {
        int a = 8;
        short b = 16;
        int c = 32;
        long d = 64;
        float f = 0.32f;
        double g = 444.54;
        boolean tf = true;

        char ch = 'š';

        String str = "Hello";
        double h = (c / d);
        System.out.println("h=" + h);

        h = (b + (c / d));
        System.out.println("h=" + h);

        h = a * (b + (c / d));
        System.out.println("h=" + h);

        System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d);
        System.out.println("f=" + f + " g=" + g + " tf=" + tf + " str=" + str + " char=" + ch);
        System.out.println("a+b=" + (a + b) + " f+c=" + (f + c) + " c=" + c + " d=" + d);
        System.out.println("h=" + h);
    }

    public static float methodA(byte a, int b, float c, short d) {
        float res = a * (b + (c / d));
        return res;
    }

    public static boolean methodB(int a, float b) {
        if (a + b < 10 || a + b > 20) {
            return false;
        }
        return true;
    }

    public static void methodC(int a) {
        if (a < 0) {
            System.out.println("Число отрицательное.");
        } else {
            System.out.println("Число положительное.");
        }
    }

    public static void methodE(String s) {
        System.out.println("Привет, " + s);
    }

    public static void methodF(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год высокосный");
        } else {
            System.out.println("Год не высокосный");
        }
    }
}
