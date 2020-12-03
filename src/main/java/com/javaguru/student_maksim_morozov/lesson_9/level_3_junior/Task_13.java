package com.javaguru.student_maksim_morozov.lesson_9.level_3_junior;


abstract class Task_13 {
    abstract static class Sports {
        abstract void voice();

    }

    static class basketball extends Task_13.Sports {

        void voice() {
            System.out.println("NBA");
        }

    }

    static class football extends Task_13.Sports {

        void voice() {
            System.out.println("Champion league");
        }

    }

    static class Volleyball extends Task_13.Sports {

        void voice() {
            System.out.println("Baltic league");
        }

    }


    static class SportsDemo {

        public static void main(String[] args) {

            basketball newbasketball = new basketball();
            football newfootball = new football();
            Volleyball newVolleyball = new Volleyball();

            newfootball.voice();
            newbasketball.voice();
            newVolleyball.voice();
        }
    }
}

