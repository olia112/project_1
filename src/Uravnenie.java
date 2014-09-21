/**
 * Created by Оля on 21.09.2014.
 */
public class Uravnenie {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;
        double d = b * b - 4 * a * c;
        double x, x1, x2 = 0;
        if (d < 0) {
            System.out.println("Вещественных корней нет");
        } else if (d > 0) {
            x1 = (Math.sqrt(d) - b) / (2 * a);
            x2 = (-Math.sqrt(d) - b) / (2 * a);
            System.out.println("Ответ: x1= "+x1);
            System.out.println("Ответ: x2= "+x2);
        } else {
            x = (Math.sqrt(d) - b) / (2 * a);
            System.out.println("Ответ: x= "+x);
        }
    }
}
