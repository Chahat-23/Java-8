interface calculator {
//    void switchOn();
//void sum(int input);
    int substract(int i1, int i2);
}

public class CalculatorImpl{
    //() -> {}; - syntax of lambda exp.
    public static void main(String[] args) {
//        calculator calc =() -> {
//            System.out.println("Lambda expression");
//        };
//        calc.switchOn();

//        calculator calc1 = (input) -> System.out.println(input);
//        calc1.sum(5);

        calculator calc2 = (i1, i2) -> {
            if(i2>i1) {
                return i2-i1;
            }
            else {
                throw new ArithmeticException();
            }
        };
        System.out.println(calc2.substract(2, 3));
        System.out.println(calc2.substract(4, 3));

    }
}
