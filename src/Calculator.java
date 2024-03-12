/*
1. Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа,
над которыми должна быть произведена операция. Методы должны возвращать результат своей работы.
 */

public class Calculator {
    public static <T extends Number> double sum(T t1, T t2){
        double sum;
        sum = t1.doubleValue() + t2.doubleValue();
        return sum;
    }
    public static <T extends Number> double multiply(T t1, T t2){
        double multiply;
        multiply = t1.doubleValue() * t2.doubleValue();
        return multiply;
    }
    public static <T extends Number> double divide(T t1, T t2) {
        double divide;
        divide = t1.doubleValue() / t2.doubleValue();
        return divide;
    }
    public static <T extends Number> double subtract(T t1, T t2){
        double subtract;
        subtract = t1.doubleValue() + t2.doubleValue();
        return subtract;
    }
}

