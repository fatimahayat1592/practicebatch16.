package class5;

public class E6LogicalOperator {
    public static void main(String[] args) {
        //System.out.println(true||true||false);
        int age=17;
        if(age<18||age>60){
            System.out.println("you will get discount");
        }
        char gender='F';
        if(gender=='F'||age>60){
            System.out.println("Discount");
        }
        String name="Safyan";
        if(!name.equals("Karan")){
            System.out.println("Will get discount");
        }


    }
}

