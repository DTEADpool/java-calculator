import java.lang.Math;

class SciCal {
  String shape = "Rectangle";
  String screen = "VFD";
  String color = "Black";
  String charging = "Solar";
  int battery = 50;
  int buttons = 50;

  void javaLog(int val) {
    System.out.println("\nLog of " + val + " = " + Math.log(val));
  }

  void javaTrig(int deg) {
    double radians = Math.toRadians(deg);
    double sinVal = Math.sin(radians);
    double cosVal = Math.cos(radians);
    double tanVal = Math.tan(radians);

    System.out.println("\nSin of " + deg + " = " + sinVal);
    System.out.println("Cos of " + deg + " = " + cosVal);
    System.out.println("Tan of " + deg + " = " + tanVal);
  }

  static int fact(int n) {
    if (n == 0 || n < 0)
      return 1;
    else 
      return (n * fact(n - 1));
  }

  void javaP_C(int n, int r) {
    int D = n - r;
    double p = fact(n) / fact(D);
    System.out.println("\nPermutation of " + n + " and " + r + " = " + p);

    double c = fact(n) / (r * fact(D));
    System.out.println("Combination of " + n + " and " + r + " = " + c);
  }

  void javaExp(int n, double d) {
    int N = (int) Math.exp(n);
    double D = Math.exp(d);

    System.out.println("\nExponent of " + n + " = " + N);
    System.out.println("Exponent of " + d + " = " + D);
  }  

  void javaArith(int a, int b) {
    int add = a + b;
    int sub = a - b;
    int mul = a * b;
    int div = a / b;

    System.out.println("\nAddition of " + a + " and " + b + " = " + add);
    System.out.println("Subtraction of " + a + " and " + b + " = " + sub);
    System.out.println("Multiplication of " + a + " and " + b + " = " + mul);
    System.out.println("Division of " + a + " and " + b + " = " + div);
  }
  
  void showSpec() {
    System.out.println("Shape : " + shape + "\nScreen : " + screen + "\nColor : " + color + "\nCharging : " + charging + "\nBattery percentage : " + battery + "\nNo. of buttons : " + buttons);
  }
}

public class calculator extends SciCal{
  public static void main(String... args) {

    SciCal varAttribute = new SciCal();
    varAttribute.showSpec();

    System.out.println("\nA calculator can perform some operations which are listed below : ");

    SciCal jLog = new SciCal();
    jLog.javaLog(-3);

    SciCal jTrig = new SciCal();
    jTrig.javaTrig(30);

    SciCal jP_C = new SciCal();
    jP_C.javaP_C(5, 1);

    // SciCal jFact = new SciCal();
    System.out.println("\nFactorial of " + 10 + " = " + fact(10)); 

    SciCal jExp = new SciCal();
    jExp.javaExp(2, 4.5);

    SciCal jArith = new SciCal();
    jArith.javaArith(20, 10);
  }
}