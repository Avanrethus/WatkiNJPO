package Silnie;

import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SilniaIteracyjnie extends Thread {
    public int liczba;
    public boolean runner;
    public BigInteger SilniaI(int i) throws InterruptedException{
        BigInteger silnia = BigInteger.ONE;
        for (int j=1; j<=i; j++){
            if (runner == false) return BigInteger.ZERO;
            sleep(10);
            silnia = silnia.multiply(new BigInteger(Integer.toString(i)));
            }
        return silnia;
    }
    
    public SilniaIteracyjnie (int i){
        liczba = i;
    }

    @Override
    public void run() {
        runner = true;
        try{
            System.out.println(SilniaI(liczba));
        }
        catch(InterruptedException ex){
            Logger.getLogger(SilniaIteracyjnie.class.getName()).log(Level.SEVERE,null,ex);
        }
        interrupt();
    }
    @Override
    public void interrupt(){
        runner = false;
        Silnie.jTextField4.setText((System.currentTimeMillis()-Silnie.before)+" ms");
    }
}
