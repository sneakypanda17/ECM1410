package Workshops.week02.VariablesTest;

public class VariablesTest {
    public static void main(String[] args) {
        float area = 20.3F;
        float radius = 0.0F;
        char a = '\u5468', b = '\\';
        int nCount = 30*21;
        int nHours = 022;
        double ratio = 7.0 / 5.0;

        System.out.println(area);
        System.out.println(radius); // Make sure to initialize radius before printing.
        System.out.println(a);
        System.out.println(b);
        System.out.println(nCount);
        System.out.println(Integer.toString(nHours)); // Convert nHours to a string in decimal.
        System.out.println(ratio);

        double d = 29.0;
        System.out.println(d);
        d *= 0.01;
        System.out.println(d);
        d /= 0.01;
        System.out.println(d);

    }
}
