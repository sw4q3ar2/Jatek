
package jatek;

import java.util.Random;


public class Karakter {
    private int eletero, ugyesseg, szerencse;
    
    public Karakter(){
        
       Random rand = new Random();
   
       this.eletero = rand.nextInt(14,24)+12;
       this.ugyesseg = rand.nextInt(1,6)+6;
       this.szerencse = rand.nextInt(1,6)+6;
        
    }
}
