package com.javaguru.student_ivan_shulga.lesson_9.level_4_junior;

class ShapeUtilDemo {

    public static void main(String[] args) {

        ShapeUtil shapeUtilDemo = new ShapeUtil();

        Shape circle = shapeUtilDemo.createRandomCircle();
        double circleArea = shapeUtilDemo.calculateArea(circle);
        double circlePerimeter = shapeUtilDemo.calculatePerimeter(circle);

        System.out.println("Радиус круга равен: " + shapeUtilDemo.createRandomCircle().getRadius());
        System.out.println("Площадь круга равна: " + circleArea);
        System.out.println("Периметр круга равен: " + circlePerimeter);

        System.out.println();

        Shape square = shapeUtilDemo.createRandomSquare();
        double squareArea = shapeUtilDemo.calculateArea(square);
        double squarePerimeter = shapeUtilDemo.calculatePerimeter(square);

        System.out.println("Сторона квадрата равна: " + shapeUtilDemo.createRandomSquare().getSideA());
        System.out.println("Площадь квадрата равна: " + squareArea);
        System.out.println("Периметр квадрата равен: " + squarePerimeter);

        System.out.println();

        Shape rectangle = shapeUtilDemo.createRandomRectangle();
        double rectangleArea = shapeUtilDemo.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtilDemo.calculatePerimeter(rectangle);

        System.out.println("Сторона А прямоугольника равна: " + shapeUtilDemo.createRandomRectangle().getSideA() + "; Сторона B прямоугольника равна: " + shapeUtilDemo.createRandomRectangle().getSideB());
        System.out.println("Площадь прямоугольника равна: " + rectangleArea);
        System.out.println("Периметр прямоугольника равен: " + rectanglePerimeter);

        System.out.println();

        Shape triangle = shapeUtilDemo.createRandomTriangle();
        double triangleArea = shapeUtilDemo.calculateArea(triangle);
        double trianglePerimeter = shapeUtilDemo.calculatePerimeter(triangle);

        System.out.println("Сторона А треугольника равна: " + shapeUtilDemo.createRandomTriangle().getSideA()
                + "; Сторона B треугольника равна: " + shapeUtilDemo.createRandomTriangle().getSideB()
                + "; Сторона C треугольника равна: " + shapeUtilDemo.createRandomTriangle().getSideC());
        System.out.println("Площадь треугольника равна: " + triangleArea);
        System.out.println("Периметр треугольника равен: " + trianglePerimeter);
        /* ^^^^^^^^^^
        Создайте ShapeUtilDemo класс и продемонстрируйте
        расчёт площади и переметра
        любой геометрической фигуры.
        */

        System.out.println();

        // пример рандомного создания фигуры и вычисления площади и периметра
        Shape randomFigure = shapeUtilDemo.randomShapeCreator();
        System.out.println("Рандомно создана фигура --->>> " + randomFigure.getTitle());
        double randomFiguresPerimeter = randomFigure.calculatePerimeter();
        System.out.println("Периметр рандомно созданной фигуры " + randomFigure.getTitle() + " = " + randomFiguresPerimeter);
        double randomFiguresArea = randomFigure.calculateArea();
        System.out.println("Площадь рандомно созданной фигуры " + randomFigure.getTitle() + " = " + randomFiguresArea);

        System.out.println();

        // пример создания массива из 4 фигур и вычисление их общей площади и периметра
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtilDemo.createRandomCircle();
        shapes[1] = shapeUtilDemo.createRandomSquare();
        shapes[2] = shapeUtilDemo.createRandomRectangle();
        shapes[3] = shapeUtilDemo.createRandomTriangle();

        System.out.println("Периметр всех четырёх фигур массива равен = " + shapeUtilDemo.calculatePerimeter(shapes));
        System.out.println("Площадь всех четырёх фигур массива равна = " + shapeUtilDemo.calculateArea(shapes));


    }

}
