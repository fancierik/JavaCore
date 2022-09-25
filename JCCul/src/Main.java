public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        try {
            int c = calc.devide.apply(a, b); // результат работы int b равен нулю.(делить на ноль нельзя
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Hа ноль делить нельзя!");
        }
    }
}
// отсутствует проверка деления на ноль,
// можно реализовать ее тернарным оператором,
// либо прописать лямбда-выражение с выводом сообщения о недопустимости
// деления на ноль