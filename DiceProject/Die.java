
package lab_4;

import java.util.Random;


public class Die {
    
    private int numSides;
    private int faceValue;
    
    public Die(){
        this.faceValue = 1;
        this.numSides = 6;
    }
    
    public Die( int sides){
        this.faceValue = 1;
        this.numSides = sides;
    }
    
    public int roll(){
        Random random = new Random();
        int randNumber = random.nextInt(this.numSides) + 1;
        this.faceValue = randNumber;
        
        return randNumber;
    }
    
    public int getNumSides(){
        
        return this.numSides;
        
    }
    
    public int getFaceValue(){
        
        return this.faceValue;
    }
    
    @Override
    public String toString(){
        
        String result = "d" + this.numSides + " = " + this.faceValue;
        
        return result;
        
    }
}
