package com.javaguru.student_igors_jurkovs.lesson_10.level_7_senior.super_task_2;

class ArrayAsList implements  MyList {

    private Object[] myArray;

    public ArrayAsList() {
        myArray = new Object[0];
    }

    public int getMyArrayLength() {
        return myArray.length;
    }

    public Object[] getMyArray() {
        return myArray;
    }

    @Override
    public boolean addObject(Object object) {
        boolean isObjectAdded = false;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == null) {
                myArray[i] = object;
                isObjectAdded = true;
                break;
            }
        }
        if (!isObjectAdded) {
            increaseArray();
            isObjectAdded = addObject(object);
        }
        return isObjectAdded;
    }

    @Override
    public boolean removeObject(Object object) {
        for (int i = 0; i < myArray.length; i++) {
            if (object.equals(myArray[i])) {
                myArray[i] = null;
                autoDecreaseLength();
                return true;
            }
        }
        return false;
    }

    @Override
    public Object findObject(Object object) {
        for (Object ob : myArray) {
            if (ob.equals(object)) {
                return ob;
            }
        }
        return null;
    }

    @Override
    public void increaseArray() {
        if (myArray.length == 0) {
            myArray = new Object[myArray.length + 1];
        } else {
            Object[] tempArray = myArray;
            myArray = new Object[tempArray.length * 2];
            if (tempArray.length > 0) System.arraycopy(tempArray, 0, myArray, 0, tempArray.length);
        }
    }

    @Override
    public void decreaseArray() {
        if (myArray.length == 1) {
            myArray = new Object[0];
        } else {
            Object[] tempArray = myArray;
            myArray = new Object[tempArray.length / 2];
            System.arraycopy(tempArray, 0, myArray, 0, myArray.length);
        }
    }

    private void autoDecreaseLength() {
        int counter = 0;
        for (Object ob : myArray) {
            if (ob == null) {
                counter++;
            }
            if (counter == myArray.length / 2) {
                sortArray();
                decreaseArray();
                break;
            }
        }
    }

    @Override
    public void sortArray() {
        for (int i = 0; i <= myArray.length / 2; i++) {
            if (myArray[i] == null) {
                for (int j = myArray.length - 1; j >= myArray.length / 2; j--) {
                    if (myArray[j] != null) {
                        myArray[i] = myArray[j];
                        myArray[j] = null;
                        break;
                    }
                }
            }
        }
    }
}
