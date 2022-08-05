import com.company.Car;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {


       try(Car car = new Car()){
           System.out.println(car);
           car.drive();
       }catch (IOException e){
           System.out.println(e.getMessage());
       }
    }
}