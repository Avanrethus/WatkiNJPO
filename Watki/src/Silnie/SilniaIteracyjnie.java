package Silnie;

public class SilniaIteracyjnie implements Runnablee {
    public int SilniaI(int i){
        int silnia = 1;
        for(int j = 1; j<= i; j++)
            silnia = silnia *j;
        return silnia;
    }

    @Override
    public void run() {
        
    }
}
