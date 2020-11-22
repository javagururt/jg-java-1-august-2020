package com.javaguru.student_igors_jurkovs.lesson_10.level_7_senior.super_task_2;

public interface MyList<T> {

    boolean addObject(T object);
    boolean removeObject(T object);
    void increaseArray();
    void decreaseArray();
    T findObject(T object);
    void sortArray();
}
