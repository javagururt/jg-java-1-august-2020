package com.javaguru.student_sergey_kazyanin.lesson_3.level_6.Task24;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class AddressBookDemo {
    public static void main(String[] args) {
        AddressBook guest = new AddressBook("Sergey", "Kazyanin", "+375298888888");
        guest.sendMessage();
        guest.PhoneNumberInfo();

    }
}
