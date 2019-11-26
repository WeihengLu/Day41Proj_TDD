package com.stevenlu.day41proj_tdd;

public class SetImpl2 implements Set {

    private int count = 0;
    private int[] set = new int[10];

    @Override
    public boolean isEmpty() {
        if (count != 0) {
            return false;
        }
        return true;
    }

    private int isDuplicate(int value) {

        for (int i = 0; i < set.length; i++) {
            if (set[i] == value) return i;
        }
        return -1;
    }

    @Override
    public void add(int value) {
        if (isDuplicate(value) == -1) {
            set[count] = value;
            count++;
        }
    }

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

    //  2 4 5
    //  2


    @Override
    public boolean contains(int value) {
      if(isDuplicate(value) == -1){
          return false;
      }
        return true;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void clear() {
        count = 0;
        /*for (int i = 0; i < set.length; i++) {
            set[i] = -1;
        }*/
        set = new int[10];
    }
}
