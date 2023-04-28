package class9;

public class E7Arrays {
    public static void main(String[] args) {
        boolean [] flags={true,false,true,false,true,false};
        int counter=0;
        for (int i = 0; i < flags.length; i++) {
            if(!flags[i]){
                counter++;
            }
        }
        System.out.println(counter);

    }
}
