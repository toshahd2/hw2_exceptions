import java.util.Scanner;

public class task1 {
    /**
     Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
     и возвращает введенное значение.
     Ввод текста вместо числа не должно приводить к падению приложения,
     вместо этого, необходимо повторно запросить у пользователя ввод данных.
     */
    public static void main(String[] args) {
        boolean correct = false;

        while (!correct){
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите дробное число(разделитель - зяпятая):");
                float number = sc.nextFloat();
                correct = true;
                System.out.println("Вы ввели число " + number);
            } catch (RuntimeException e){
                System.out.println("Некорректный ввод, повторите попытку.");
            }
        }

    }
}
