public class FactorialCalculator {
    public static int getFactorial(int f) {
        if (f < 0) {
            throw new IllegalArgumentException("Нельзя вычислить факториал отрицательного числа");
        }
        if (f == 0) {
            return 1;
        } else {
            return f * getFactorial(f - 1);
        }
    }
    public static void main(String[] args) {
        int f = 5;
        System.out.println("Факториал " + f + " = " + getFactorial(f));
    }
}
