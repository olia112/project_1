/**
 * Created by Оля on 25.09.2014.
 */
public class Imena {
    public static void main(String[] args) {
        String[] names = {"Иван", "Петр"};
        String[] greetings = {"Привет, ", "Привет, "};
        for (int i = 0; i < names.length; i++){
            greetings[i] = greetings[i] + names[i];
            System.out.println(greetings[i]);
        }
    }
}
