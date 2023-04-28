package class2;

public class StudentInformation {
    public static void main(String[] args) {
        /*Create a Java program and name it Variables
        In your program create different type of variables to store student’s information(name, last name, grade, city, state, phone number) and then print value of those variables in the format:
        My name is  and my  last name is __
        I am A/B student
        I live in city and state__
        And my phone number is …..

        3)Change student’s city, state, phone number and grade. And print those updated values:
        Example:
        My name is  and I moved to new city and new state. My new phone number is*/
        String name="Fatima";
        String lastName="Hayat";
        char grade='A';
        String city="Alexandria";
        String state="Virginia";
        String phoneNumber="123-345-6565";
        System.out.println("My name is "+name+" and my last name is "+lastName);
        System.out.println("I am grade "+grade+" Student");
        System.out.println("I live in city "+city+" and state "+state);
        System.out.println("My phone number is "+phoneNumber);
        city="Deerfield";
        state="Chicago";
        phoneNumber="123-989-6767";
        System.out.println("My name is "+name+" "+lastName+" and I moved to new city "+city+" and new state "+state+".");
        System.out.println("My new phone number is "+phoneNumber);


    }
}
