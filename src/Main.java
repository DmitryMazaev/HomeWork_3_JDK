import java.util.ArrayList;

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
        System.out.println("=====================================");

        // Задание 2 (compareArrays())
        ArrayList<Object> str1 = new ArrayList<>();
        ArrayList<Object> str2 = new ArrayList<>();
        CompareArray.Pen pen1 = new CompareArray.Pen();
        CompareArray.Pen pen2 = new CompareArray.Pen();
        String el1 = "1";
        int el2 = 2;
        int el3 = 3;
        String el4 = "4";
        double el5 = 7;
        double el6 = 1893;

        str1.add(el1);
        str1.add(el3);
        str1.add(el5);
        str1.add(pen1);

        str2.add(el4);
        str2.add(el2);
        str2.add(el6);
        str2.add(pen2);

        CompareArray <Object, Object> compareArray = new CompareArray<>();
        System.out.println(compareArray.compareArrays(str1, str2));
        System.out.println("=====================================");

        // Задание 3 (Pair)
        Pair<String, Double> pair = new Pair<>("Первый", 2.22);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair.toString());

    }
}