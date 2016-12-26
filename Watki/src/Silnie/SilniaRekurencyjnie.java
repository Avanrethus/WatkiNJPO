
package Silnie;

public class SilniaRekurencyjnie {
    public int SilniaR(int i){
        if (i == 0){
            return 1;
        }
        else
            return i * SilniaR(i-1);
    }
}
