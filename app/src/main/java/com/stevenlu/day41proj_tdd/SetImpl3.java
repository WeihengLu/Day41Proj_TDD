package com.stevenlu.day41proj_tdd;

public class SetImpl3 implements Set {

    int count = 0;

    int[] set = new int[5];

    @Override
    public boolean isEmpty() {
        if (count != 0) {
            return false;
        }
        return true;

    }

    @Override
    public void add(int value) {
        for (int i = 0; i < set.length; i++) {
            if (set[i] == value) {
                return;
            }
        }
        set[count] = value;
        count++;
    }

    // 1 3 4 ?

    @Override
    public void remove(int value) {

        for (int i = 0; i < set.length; i++) {
            if (set[i] == value) {
                set[i] = -1;
                count--;
                for (int j = i; j < set.length - 1; j++) {
                    set[j] = set[j + 1];
                }
            }
        }
    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i < set.length; i++) {
            if (set[i] == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void clear() {
        count = 0;
    }
}
