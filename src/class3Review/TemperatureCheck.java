package class3Review;

public class TemperatureCheck {
    public static void main(String[] args) {
       /* Your program should check if temperature is below 32 then it should print “Water will
        freeze with temperature ”, otherwise “Water will NOT freeze with temperature ”.*/
        int temp=64;
        if(temp<32){
            System.out.println("Water will freeze with temperature");
        }else{
            System.out.println("Water will not freeze with temperature");
        }
    }
}
