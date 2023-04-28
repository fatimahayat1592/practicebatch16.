package class12review;

public class E10StringDemo {
    public static void main(String[] args) {
        String userName="Fatima";
        String password="pass@123";
        String confirmPassword="pass@123";
        if(userName.isEmpty() && password.isEmpty()){
            System.out.println("Can not be empty");
        }else if(password.length()<8){
            System.out.println("password is short");
        }else if(password.contains(userName)){
            System.out.println("password can not contain username");
        }else if(password.equals("confirmPassword")){
            System.out.println("Password do not match");
        }else{
            System.out.println("Your account has been created");
        }

    }
}
