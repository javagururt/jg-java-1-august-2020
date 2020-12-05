package com.javaguru.student_vladimirs_filipovs.lesson_15.level_2;

class QuadraticEq {
//    public void calc(double a, double b, double c) {
//        double discriminant = b * b - 4 * a * c;
//        if (discriminant > 0) {
//            double x1, x2;
//            x1 = (-b - Math.sqrt(D)) / (2 * a);
//            x2 = (-b + Math.sqrt(D)) / (2 * a);
//            System.out.println("x1 = " + x1 + ", x2 = " + x2);
//        } else if (discriminant == 0) {
//            double x;
//            x = -b / (2 * a);
//            System.out.println("x = " + x);
//        } else {
//            System.out.println("Equation has no roots");
//        }
//    }

    public String calc(double a, double b, double c) {
        if (calculateDiscriminant(a, b, c) > 0) {
            return calculateXIfDiscriminantMoreZero(a, b, c);
        } else if (calculateDiscriminant(a, b, c) == 0) {
            return calculateXIfDiscriminantEqualsZero(a, b);
        } else {
            return ifDiscriminantLessZero();
        }
    }

    private double calculateDiscriminant(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    private String calculateXIfDiscriminantMoreZero(double a, double b, double c) {
        double x1 = (-b - Math.sqrt(calculateDiscriminant(a, b, c))) / (2 * a);
        double x2 = (-b + Math.sqrt(calculateDiscriminant(a, b, c))) / (2 * a);
        return "x1 = " + x1 + ", x2 = " + x2;
    }

    private String calculateXIfDiscriminantEqualsZero(double a, double b) {
        double x = -b / (2 * a);
        return "x = " + x;
    }

    private String ifDiscriminantLessZero() {
        return "Equation has no roots";
    }
}