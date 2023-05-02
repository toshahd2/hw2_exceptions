import java.util.Scanner;

public class task4 {
    /**
     * Разработайте программу, которая выбросит Exception,
     * когда пользователь вводит пустую строку.
     * Пользователю должно показаться сообщение,
     * что пустые строки вводить нельзя.
     */
    public static void main(String[] args) {
        boolean correct = false;

        while (!correct){
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите что-нибудь:");
                String input = sc.nextLine();
                if(input.length()==0){
                    throw new RuntimeException("Пустая строка");
                }
                correct = true;
                System.out.println("Вот, что вы понаписали '" + input + "'");
            } catch (RuntimeException e){
                System.out.println("Вы ввели пустую строку, повторите попытку.");
            }
        }

    }
}
