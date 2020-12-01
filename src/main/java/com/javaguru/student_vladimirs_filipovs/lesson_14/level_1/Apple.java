package com.javaguru.student_vladimirs_filipovs.lesson_14.level_1;

class Apple {
    private String colour;
    private int weight;

    public Apple(String colour, int weight) {
        this.colour = colour;
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "colour='" + colour + '\'' +
                ", weight=" + weight +
                '}';
    }
}
