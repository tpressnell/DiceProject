package lab_4;

import java.util.ArrayList;
import java.util.Random;

public class Lab_4 {

    public static void main(String[] args) {
        
        
        ArrayList<Integer> choices = new ArrayList<>();
        choices.add(4);
        choices.add(6);
        choices.add(8);
        choices.add(10);
        choices.add(12);
        choices.add(20);
        choices.add(100);
        Random x = new Random();
        
        ArrayList<Die> dice = new ArrayList<>();
        
        
        
        for (int i = 0; i < 5; ++i){
           
            int value = x.nextInt(choices.size());
            
            int newNum = choices.get(value);
            
            dice.add(new Die(newNum));
            
        }
        
        for ( int i = 0; i < 5; ++i){
            
            Die d = dice.get(i);
            d.roll();
            System.out.println(d.toString());
        }
            
            

    }
    
}
