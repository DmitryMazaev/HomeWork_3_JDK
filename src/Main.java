

public class Main {
    public static void main(String[] args){
        // Задание 1 (Calculator)
        double a = 10.254;
        int b = 15;
        System.out.println("Числа: " + a + ", " + b);
        System.out.println("Сумма: " + Calculator.sum(a, b));
        System.out.println("Произведение: " + Calculator.multiply(a, b));
        System.out.println("Частное: " + Calculator.divide(a, b));
        System.out.println("Частное: " + Calculator.subtract(a, b));


    }
}