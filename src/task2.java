import java.util.Scanner;

public class task2 {
    /**
     * Если необходимо, исправьте данный код
     * (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
     */
    public static void main(String[] args) {
        try {
            int[] intArray = {2,4,6,8,10,12,14,16,18,20};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
