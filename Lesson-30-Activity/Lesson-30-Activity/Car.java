class Car {
    String brand;
    String color;
    String model;
    int year;
    double value;

    Car(String brand, String color, String model, int year, double value) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.year = year;
        this.value = value;

    }

    void bonus() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Value: " + this.value);
        System.out.println();
    }

    void honk() {
        System.out.println("RAHHHH");
    }

}