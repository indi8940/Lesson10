package Sorting;

public class generator {
    
    public static double rng;
    
    public generator(){
        
    }
    
    public static void generate(){
         for (int i = 0; i < 50000; i++) {
            rng = Math.floor(Math.random() * 50000 + 1);
        }
    }
}