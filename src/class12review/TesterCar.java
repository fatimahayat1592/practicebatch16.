package class12review;

public class TesterCar {
    public static void main(String[] args) {
        Cars car=new Cars();
        car.make="Toyota";
        car.model="Camery";
        car.color="Golden";
        car.mileage=1200;
        car.startCar();
        car.turn();
        car.stopCar();
        Cars car1=new Cars();
        car1.make="Tesla";
        car1.model="s";
        car1.mileage=1290;
        car1.color="White";
        car1.startCar();
        car1.turn();
        car1.stopCar();
    }
}
