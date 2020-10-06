package com.javaguru.student_roman_tasilov.lesson_4.level_5;
/*
Функциональные требования:
Программа должна определять цвет в зависимости
от длины волны в соответствии со следующими правилами:

380 ... 449 - Фиолетовый ("Violet")
450 ... 494 - Синий ("Blue")
495 ... 569 - Зеленый ("Green")
570 ... 589 - Желтый ("Yellow")
590 ... 619 - Оранжевый ("Orange")
620 ... 750 - Красный ("Red")
Вне диапазонов - невидимый спектр ("Invisible Light")


 */
public class LightColorDetector {
    public String detect(int waveLenght) {
        if (waveLenght >= 380 & waveLenght <= 449) {
            return "Violet"; }
        if (waveLenght >= 450 & waveLenght <= 494) {
            return "Blue"; }
        if (waveLenght >= 495 & waveLenght <= 569) {
            return "Green"; }
        if (waveLenght >= 570 & waveLenght <= 589) {
            return "Yellow"; }
        if (waveLenght >= 590 & waveLenght <= 619) {
            return "Orange"; }
        if (waveLenght >= 620 & waveLenght <= 750) {
            return "Red"; }
        else {
            return "Invisible Light"; }
    }
}
