package com.stevenlu.day41proj_tdd;

public class SetImpl1 implements Set {

    int[] array = new int[10];
    int count = 0;

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        if (count <= 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean contains(int value) {
        if (isDuplicate(value)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isDuplicate(int value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(int value) {
        if (!isDuplicate(value)) {
            array[count] = value;
            count++;
        }
    }

    @Override
    public void remove(int value) {
        // find if the value exist in the array
        if (isDuplicate(value)) {
            count--;
        }

        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
            }
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
        count = 0;
    }
}
