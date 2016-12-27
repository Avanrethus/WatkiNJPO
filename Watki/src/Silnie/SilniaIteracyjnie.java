package Silnie;

import java.math.BigInteger;

public class SilniaIteracyjnie extends Thread {
    public String czas;
    public BigInteger SilniaI(BigInteger i){
        BigInteger silnia = BigInteger.ONE;
        long start = System.currentTimeMillis();
        for (int j=0; j<=1; j++){
            while (i.compareTo(BigInteger.ONE)>0) {
                silnia = silnia.multiply(i);
                i = i.subtract(BigInteger.ONE);
            }
        }
        long stop = System.currentTimeMillis();
        String czasliczenia = ""+(stop-start)+" ms";
        setCzas(czasliczenia);
        return silnia;
    }

    public void setCzas(String czas) {
        this.czas = czas;
    }

    public String getCzas() {
        return czas;
    }
    

    @Override
    public void run() {
        
    }
}
