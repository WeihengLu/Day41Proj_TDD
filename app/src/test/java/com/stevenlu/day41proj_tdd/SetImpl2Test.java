package com.stevenlu.day41proj_tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetImpl2Test {

    Set set = new SetImpl2();

    @Test
    public void emptySet_sizeShouldReturn0() {
        assertEquals(0, set.size());
    }

    @Test
    public void emptySet_isEmptyShouldReturnTrue() {
        assertEquals(true, set.isEmpty());
    }

    @Test
    public void emptySet_containsShouldReturnFalse() {
        assertEquals(false, set.contains(232));
    }

    @Test
    public void addOneValue_sizeShouldBe1() {
        set.add(8);
        assertEquals(1, set.size());
    }

    @Test
    public void addOneValue_isEmptyShouldReturnFalse() {
        set.add(8);
        assertEquals(false, set.isEmpty());
    }

    @Test
    public void addOneValue_containsShouldReturnTrue() {
        set.add(8);
        assertEquals(true, set.contains(8));
    }

    @Test
    public void addTwoValue_sizeShouldBe1() {
        set.add(8);
        set.add(8);
        assertEquals(1, set.size());
    }

    @Test
    public void addTwoDifferentValue_sizeShouldBe2() {
        set.add(8);
        set.add(9);
        assertEquals(2, set.size());
    }

    @Test
    public void addTwoValue_containsShouldReturnTrue() {
        set.add(8);
        set.add(8);
        assertEquals(true, set.contains(8));
    }

    @Test
    public void addOneValue_RemoveSameValue_sizeShouldBe0() {
        set.add(8);
        set.remove(8);
        assertEquals(0, set.size());
    }

    @Test
    public void removeValueNotExist_isEmptyShouldRerurnTrue() {
        set.remove(8);
        assertEquals(true, set.isEmpty());
    }

    @Test
    public void removeValueTwice_containsShouldRerurnFalse() {
        set.add(8);
        set.remove(8);
        set.remove(8);
        assertEquals(false, set.contains(8));
    }

    @Test
    public void clearAllAdd_isEmptyShouldReturnTrue() {
        set.add(8);
        set.clear();

        assertEquals(true, set.isEmpty());
    }

    @Test
    public void addThreeValue_removeMiddleValue_sizeShouldBeTwo() {
        set.add(2);
        set.add(3);
        set.add(4);
        set.remove(3);

        assertEquals(2, set.size());
    }

    @Test
    public void addThreeValue_removeMiddleValue_containsShouldReturFalse() {
        set.add(2);
        set.add(3);
        set.add(4);
        set.remove(3);

        assertEquals(false, set.contains(3));
    }

    @Test
    public void addThreeValue_removeMiddleValue_addValue_contains4() {
        set.add(2);
        set.add(3);
        set.add(4);
        set.remove(3);
        set.add(5);

        assertEquals(true, set.contains(4));
    }
}