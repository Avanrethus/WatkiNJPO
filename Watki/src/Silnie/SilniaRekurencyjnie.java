
package Silnie;

import java.math.BigInteger;

public class SilniaRekurencyjnie extends Thread {
    public String czas;
    public BigInteger SilniaR(BigInteger i){
        BigInteger silnia = BigInteger.ONE;
        long start1 = System.currentTimeMillis();
        for (int j = 0; j<=1; j++){
            if (i.equals(BigInteger.ONE)){
                silnia = BigInteger.ONE;
            }
            else
                silnia = i.multiply(SilniaR(i.subtract(BigInteger.ONE)));
        }
        long stop1 = System.currentTimeMillis();
        String czasliczenia = ""+ (stop1-start1)+" ms";
        setCzas(czasliczenia);
        return silnia;
    }
    public String getCzas(){
        return czas;
    }

    public void setCzas(String czas) {
        this.czas = czas;
    }
    
    @Override
    public void run() {
        
    }
}
