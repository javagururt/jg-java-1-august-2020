package com.javaguru.student_vladimirs_filipovs.lesson_3.level_6;

class Fruit {
    String whatFruit;
    String colour;
    double weight;

    public String getWhatFruit() {
        return whatFruit;
    }

    public void setWhatFruit(String whatFruit) {
        this.whatFruit = whatFruit;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class FruitDemo {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit();
        fruit1.setWhatFruit("Banana");
        fruit1.setColour("Yellow");
        fruit1.setWeight(0.21);

        System.out.println("Our fruit is " + fruit1.getWhatFruit());
        System.out.println("Fruit's colour is " + fruit1.getColour());
        System.out.println("Fruit's weight is " + fruit1.getWeight() + " kg");
    }
}

class House {
    String streetName;
    int houseNumber;
    int houseFloor;

    public House(String streetName, int houseNumber, int houseFloor) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.houseFloor = houseFloor;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public int getHouseFloor() {
        return houseFloor;
    }
}

class HouseDemo {
    public static void main(String[] args) {
        House house1 = new House("Maskachka", 666, 9);

        System.out.print("John live in ");
        System.out.print(house1.getStreetName() + " street ");
        System.out.print(house1.getHouseNumber() + ", ");
        System.out.print("on the " + house1.getHouseFloor() + " floor!");
    }
}