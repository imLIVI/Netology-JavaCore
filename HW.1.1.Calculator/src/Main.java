public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        /* Необходима проверка на b == 0, так как может возникнуть ошибка деления на 0*/
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);
    }
}
