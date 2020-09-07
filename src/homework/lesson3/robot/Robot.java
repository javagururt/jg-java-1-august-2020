package homework.lesson3.robot;
/*В классе робот (Robot) создайте конструктор без параметров:
  public Robot() {}
*/

class Robot {
    public Robot(){
    }
    public void sayHello( ) {
        System.out.println("Hello");}
        public void sayName()
        {
            System.out.println("My name is Robot");
    }
}
class RobotDemo {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.sayHello();
        robot.sayName();

        Robot robotDog = new Robot();
        robotDog.sayHello();
        robotDog.sayName();

        Robot robotCat = new Robot();
        robotCat.sayHello();
        robotCat.sayName();
        System.out.println("My name is RobotCat");
    }
}
