/*
Исправьте код таким образом, что бы программа
выводила на консоль числа от 0 до 100:

class ForLoopDefinition8 {

    public static void main(String[] args) {
        for ( ; ; ) {
            System.out.println(i);
        }
    }

}

 */
package com.javaguru.student_sergey_kazyanin.lesson_5.level_3_junior;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ForLoopDefinition8 {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
