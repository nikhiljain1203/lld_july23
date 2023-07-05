package StreamDemo;

public class Car {
        int speed;
        int price;
        String brand;
        public Car(int speed, int price, String brand){
            this.speed = speed;
            this.price = price;
            this.brand = brand;
        }

        @Override
        public String toString() {
            return "[Speed=" + this.speed + ", Price=" + this.price + ", Name=" + this.brand + "]\n";
        }
}
