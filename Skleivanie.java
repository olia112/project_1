/**
 * Created by Оля on 25.09.2014.
 */
public class Skleivanie {
    public static void main(String[] args) {
        int[] a = {3, 4, 5};
        int[] b = {2, 7};
        int[] r = new int[a.length + b.length];
        int i1=0;
        for (int i=0; i<a.length; i++) {
            r[i1]=a[i];
            System.out.print(r[i1] + " ");
            i1++;
        }
        for (int i=0; i<b.length; i++) {
            r[i1]=b[i];
            System.out.print(r[i1] + " ");
            i1++;
        }
    }
}
