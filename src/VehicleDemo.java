class Vehicle {
    int passengers; // количество пассажиров
    int wheels; //количество колёс
    int maxspeed; // максимальная скорость
    int burnup; // расходход топлива
} // Vehicle class


public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle();
        car1.passengers = 2; // Два пассажира
        car1.wheels = 6; // Шесть колёс
        car1.maxspeed = 130; // max.скорость 130 км/ч
        car1.burnup = 30; // расход топлива 30 литров на 100 км

        // расчёт пути,проходимого за полчаса
        //при движении с максимальной скоростью
        double distance = car1.maxspeed * 0.5;

        System.out.print("За полчаса car1 может проехать");
        System.out.print(distance + "км");

        car1 = null;
    } // main(String[])
} //VehicleDemo class
