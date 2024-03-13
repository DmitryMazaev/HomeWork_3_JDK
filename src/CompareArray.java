import java.util.ArrayList;
import java.util.Objects;

/*
2. Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
 если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных,
 но должны иметь одинаковую длину и содержать элементы одного типа попарно по индексам.
 */
public class CompareArray<T1, T2> {
    public static class Pen {

    }
    private ArrayList<T1> array1 = new ArrayList<>();
    private ArrayList<T2> array2 = new ArrayList<>();
    public  <T> boolean compareArrays(ArrayList<T1> array1, ArrayList<T2> array2){
        if(array1.size() != array1.size()) {
            System.out.println("Неправильно (разная длина)");
            return false;
        }
        else {
            for(int i = 0; i < array1.size(); i++) {
                if (!array1.get(i).getClass().getSimpleName().equals(array2.get(i).getClass().getSimpleName())) {
                    System.out.println("Неправильно (разные типы)");
                    return false;
                }
            }
            System.out.println("Массивы имеют одинаковую длину, типы элементов попарно равны");
            return true;
        }
    }
}

