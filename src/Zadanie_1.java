/**
 * Created by Оля on 25.09.2014.
 */
public class Zadanie_1 {
    public static void main(String[] args) {
        for (int i = 1; i<=100; i++){
            if ((i % 5 == 0) && (i % 7 == 0)){
                System.out.println ("Ответ: ABBA");
            } else if (i % 5 == 0){
                System.out.println("Ответ: A");
            } else if (i % 7 == 0){
                System.out.println("Ответ: B");
            } else {
                System.out.println("Ответ: "+i);
            }
        }
    }
}
