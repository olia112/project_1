import java.util.Random;
import java.util.Scanner;

/**
 * Created by Оля on 25.09.2014.
 */
public class Igra {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner (System.in);
        int number = rnd.nextInt(100);
            System.out.println("У вас 7 попыток");
                for (int i = 1; i < 8; i++){
                    System.out.println(i+ " попытка. Необходимо ввести число");
                    int guess = in.nextInt();
                    if (number == guess){
                        System.out.println("Поздравляем!!! Вы угадали!!!");
                        break;
                    } else {
                        System.out.println("Вы не угадали. Попробуйте ещё раз. У вас осталось "+ (7-i) +"попыток");
                    }
                    if (i == 7){
                        System.out.println("Было загадано число "+ number);
                    }
                }
    }
}
