/**
 * Created by Оля on 05.10.2014.
 */
public class Skleivanie_s_metodom {
    public static void main(String[] args) {
        int[] a = {1, 3, 4};
        int[] b = {7, 6};
        int[] r = new int[a.length + b.length];
        r =concat(a,b);
    }
   public static int[] concat(int[] a, int[] b) {
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
       return r;
   }
}
