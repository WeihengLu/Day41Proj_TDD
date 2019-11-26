package com.stevenlu.day41proj_tdd;

public class SetImpl implements Set {

    int[] mArray = new int[10];
    //    ArrayList mArray = new ArrayList<Integer>(10);
    int count = 0;

    public boolean isDupilcated(int value) {
        for (int i = 0; i < mArray.length; i++) {
            if (mArray[i] == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return true;

    }

    @Override
    public void add(int value) {
        if (!isDupilcated(value)) {
            mArray[count] = value;
            count++;
        }
    }

    @Override
    public void remove(int value) {

    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i < mArray.length; i++) {
            mArray[i] = value;
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public void clear() {

    }
}
