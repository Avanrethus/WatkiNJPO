
package Silnie;


import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SilniaRekurencyjnie extends Thread {
    public int liczba;
    boolean runner;

    SilniaRekurencyjnie(int i) {
        liczba = i;
    }
    public BigInteger SilniaR(int i)throws InterruptedException{
        if (runner == false) return BigInteger.ZERO;
        sleep(10);
        if (i == 0) return BigInteger.ONE;
        return SilniaR(i-1).multiply(new BigInteger(new Integer(i).toString()));
    }
    
    
    @Override
    public void run() {
        runner = true;
        try{
            System.out.println(SilniaR(liczba));
        }
        catch(InterruptedException ex){
            Logger.getLogger(SilniaRekurencyjnie.class.getName()).log(Level.SEVERE,null,ex);
    }
        interrupt();
    }
    @Override
    public void interrupt(){
        runner = false;
        Silnie.jTextField3.setText((System.currentTimeMillis()-Silnie.before)+" ms");
    }
}
