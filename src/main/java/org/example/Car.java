package org.example;

class Car {
    private String wheels;
    private String engine;
    private String color;

    // Car constructor is private to enforce the use of Builder
    private Car() {
    }

    public String getWheels() {
        return wheels;
    }

    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels='" + wheels + '\'' +
                ", engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    // Step 2: Define the Builder inner class
    static class Builder {
        private Car car;

        public Builder() {
            car = new Car();
        }

        public Builder setWheels(String wheels) {
            car.wheels = wheels;
            return this;
        }

        public Builder setEngine(String engine) {
            car.engine = engine;
            return this;
        }

        public Builder setColor(String color) {
            car.color = color;
            return this;
        }

        public Car build() {
            return car;
        }
    }
}
