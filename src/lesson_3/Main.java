package lesson_3;

public class Main {
    public static void main(String[] args) {
        Celica celica = new Celica();
        workInTaxi(celica);
        Toyota toyota = new Toyota();
        workInTaxi(toyota);
    }
    static void workInTaxi(Car car){
        car.workInTaxi();
    }
}
interface Car {
    void workInTaxi();
}

class Toyota implements Car {
    @Override
    public void workInTaxi() {
        getPassangers();
    }
    void getPassangers() {
        System.out.println("get passangers");
    }
}

class Celica extends Toyota {
    @Override
    public void workInTaxi() {
        getPasanger();
    }
    void getPasanger(){
        System.out.println("get one passanger");
    }
}
