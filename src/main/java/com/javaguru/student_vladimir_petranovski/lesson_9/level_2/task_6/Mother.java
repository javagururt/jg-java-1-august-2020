package com.javaguru.student_vladimir_petranovski.lesson_9.level_2.task_6;

import com.javaguru.teacher.codereview.CodeReview;

/*
Исправьте код программы:
class Mother {
}
class Father {
}
class Child extends Mother, Father {
}
PS: вносить изменения можно только в объявление класса Child.
Правильных решений у этой задачи два, выбирайте любое.
 */
@CodeReview(approved = true)
class Mother {
}

class Father {

}

class Child extends Mother { // class Child extends Father

}
