package com.javaguru.student_ivan_shulga.lesson_13.level_3_junior;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Task_21 {
}

class TestException extends Exception { }

class Main {
    public static void main(String[] args) {
        try {
            throw new TestException();
        } catch(TestException t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }
}

/*
Дано

class TestException extends Exception { }

class Main {
   public static void main(String args[]) {
      try {
         throw new TestException();
      } catch(TestException t) {
         System.out.println("Got the Test Exception");
      } finally {
         System.out.println("Inside finally block ");
      }
  }
}

Какой результат мы получим?
1. Got the Test Exception // получен этот результат
   Inside finally block

2. Got the Test Exception

3. Inside finally block

4. Compiler Error
 */