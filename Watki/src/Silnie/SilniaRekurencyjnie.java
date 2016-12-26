
package Silnie;

public class SilniaRekurencyjnie implements Runnablee {
    public int SilniaR(int i){
        if (i == 0){
            return 1;
        }
        else
            return i * SilniaR(i-1);
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
