package com.stevenlu.day41proj_tdd;

public class SetImpl4 implements Set {

    int count = 0;
    int[] set = new int[10];

    @Override
    public boolean isEmpty() {

        if (count == 0) {
            return true;
        }
        return false;

    }

    @Override
    public void add(int value) {

        for (int i = 0; i < set.length; i++) {
            if (set[i] == value) {
                return;
            }

            set[count] = value;
            count++;
            return;
        }


    }

    //

    @Override
    public void remove(int value) {
        for (int i = 0; i < set.length; i++) {
            if (set[i] == value) {
                set[i] = 0;
                count--;
                for (int k = i; k < set.length - 1; k++) {
                    set[k] = set[k + 1];
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
