//Create a class Multiplier that has a:
//Constructor public Multiplier(int number).
//Method public int multiply(int number) which returns the value number passed to it multiplied by the number provided to the constructor

public class Multiplier {
    
    private int value;
    
    public Multiplier(int number){
        this.value = number;
    }
    
    public int multiply(int number){
        
        return this.value * number;
    }
    
}
