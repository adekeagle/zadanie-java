import java.util.Arrays;

/*
    Napisz program, w którym dla przykładowej tablicy liczb całkowitych
    obliczysz sumę tych elementów, które znajdują się pod parzystym indeksem
 */

public class App {
    public static void main(String[] args) {
        int[] NumberTable = { 2, 5, 3, 4, 1, 10 };
        System.out.println(sumOfEvenElements(NumberTable));
    }

    private static int sumOfEvenElements(int[] tab) {
        if (tab == null || tab.length == 0)
            throw new IllegalArgumentException("Array is null or empty");
        
        return Arrays
                .stream(tab)
                .filter(i -> i % 2 == 0)
                .sum();
    }
}
