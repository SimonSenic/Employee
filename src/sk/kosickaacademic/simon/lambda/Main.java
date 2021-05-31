package sk.kosickaacademic.simon.lambda;

public class Main{
    public static void main(String[] args) {
        Calc calc = ((a, b) -> a+b);
        System.out.println(calc.operation(2, 5));
        calc = (a, b) -> { return a>b?a:b; };
        System.out.println(calc.operation(100, 20));
        print(35, 12, calc);

        Tax sk = (value) -> { return Math.round(value*1.2*100)/100.0; };
        Tax cz = (value) -> { return Math.round(value*1.21*100)/100.0; };
        printEurWithTax(25.6, sk);
        printEurWithTax(25.6, cz);
    }

    private static void print(int a, int b, Calc calc){
        System.out.println(calc.operation(a, b));
    }

    private static void printEurWithTax(double value, Tax tax){
        System.out.println(value +" -> " +tax.calculate(value));
    }

    interface Calc{
        int operation(int a, int b);
    }

    interface Tax{
        double calculate(double value);
    }
}
