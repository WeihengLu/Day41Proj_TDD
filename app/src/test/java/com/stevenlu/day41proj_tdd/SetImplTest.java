package com.stevenlu.day41proj_tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SetImplTest {

    private SetImpl set = new SetImpl();

    @Test
    public void add_addOneValue_returnFalse() {
        set.add(1);

        assertNotEquals(false, set.contains(1));
    }

    @Test
    public void add_addOneValue_returnTrue() {
        set.add(4);

        assertEquals(true, set.contains(4));
    }

    @Test
    public void add_addDuplicatedValue_returnTure() {
        set.add(4);
        set.add(4);

        assertEquals(1, set.size());
    }

    @Test
    public void size_addOneValue_returnFalse(){

        assertNotEquals(true,set.contains(1));
    }

    @Test
    public void contains_emptyArray_returnFalse() {

        assertNotEquals(false, set.isEmpty());
    }

    @Test
    public void isEmpty_addOneValue_returnTrue() {
        assertNotEquals(true, set.contains(1));
    }

    @Test
    public void isEmpty_addOneValue_returnFalse() {
        assertEquals(false, set.contains(1));
    }

    @Test
    public void isDuplicated_addOneValue_returnFalse() {
        set.add(3);

        assertNotEquals(false, set.contains(3));
    }

    @Test
    public void isDuplicated_addOneValue_returnTrue() {
        set.add(3);

        assertEquals(true, set.contains(3));
    }
}