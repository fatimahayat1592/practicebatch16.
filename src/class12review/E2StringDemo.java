package class12review;

public class E2StringDemo {
    public static void main(String[] args) {
        String userName="admin";
        String password="pass@12";
        if(userName.length()<8 && password.length()<8){
            System.out.println("Signup successful");
        }else{
            System.out.println("username and password can not be more than 8 characters");
        }
    }
}
