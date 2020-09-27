package com.javaguru.student_nikolajs_sersnovs.lesson_4.level_5_middle;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "для того, чтобы в условии указать 'И' необходимо использовать '&&'")
class LightColorDetector {


    public String detect(int wavelength) {

        if (wavelength >= 380 && wavelength <= 449) {
            return "Violet";
        }
        if (wavelength >= 450 && wavelength <= 494) {
            return "Blue";
        }
        if (wavelength >= 495 && wavelength <= 569) {
            return "Green";
        }
        if (wavelength >= 570 && wavelength <= 589) {
            return "Yellow";
        }
        if (wavelength >= 590 && wavelength <= 619) {
            return "Orange";
        }
        if (wavelength >= 620 && wavelength <= 750) {
            return "Red";
        } else {
            return "Invisible Light";

        }

    }
}











