public class Main {
    public static void main(String[] args) {
    byte i = 10;
    short j = 100;
    int k = 1000;
    float f = 500;
    long l = 10000;
    double d = 100000;

    char letter ='a';
    boolean b = true;

    int number;
    float fval = 32.35f;
    number = (int)fval;

    int number2;
    double dval = 32.35;
    number2 = (int)dval;


    System.out.println("=====Primitive Data Type !=====");
    System.out.println("1.Numeric Data Type");
    System.out.println("byte i = " + i + " ");
    System.out.println("short j = " + j + " ");
    System.out.println("int k = " + k + " ");
    System.out.println("float f = " + f + " ");
    System.out.println("double d = " + d + " ");
    System.out.println("long l = " + l + " ");

    System.out.println("2.Non-Numeric Data Type");
    System.out.println("char letter = " + l + " ");
    System.out.println("boolean b = " + b + " ");

    System.out.println("3.Type Conversation (int<-float)");
    System.out.println("(int)fval = " + number);
    System.out.println("double dval = " + number2);
    }
}