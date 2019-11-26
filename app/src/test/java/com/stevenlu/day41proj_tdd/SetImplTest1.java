package com.stevenlu.day41proj_tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class SetImplTest1 {

    Set set = new SetImpl();

    @Test
    public void emptySet_sizeShouldBe0() {
        assertEquals(0, set.size());
    }

    @Test
    public void add3ElementsToSet_sizeShouldBe3() {
        set.add(1);
        set.add(3);
        set.add(9);

        assertEquals(3, set.size());
    }

    @Test
    public void add3ElementsToSet_sizeShouldNotBe2() {
        set.add(1);
        set.add(3);
        set.add(9);

        assertNotEquals(2, set.size());
    }

    @Test
    public void add3ElementsToSet_containsShouldContain1() {
        set.add(1);
        set.add(3);
        set.add(9);

        assertEquals(true, set.contains(1));
    }

    @Test
    public void add3ElementsToSet_containsShouldContain3() {
        set.add(1);
        set.add(3);
        set.add(9);

        assertEquals(true, set.contains(3));
    }

    @Test
    public void add3ElementsToSet_containsShouldContain9() {
        set.add(1);
        set.add(3);
        set.add(9);

        assertEquals(true, set.contains(9));
    }

    @Test
    public void noDuplicationInSet_sizeShouldBe3() {
        set.add(1);
        set.add(3);
        set.add(9);
        set.add(3);

        assertEquals(3, set.size());
    }

    @Test
    public void noDuplicationInSet_sizeShouldNotBe4() {
        set.add(1);
        set.add(3);
        set.add(9);
        set.add(3);

        assertNotEquals(4, set.size());
    }

    @Test
    public void removeFirstElement_setShouldNotContain1() {
        set.add(1);
        set.add(2);
        set.add(3);
        set.remove(1);

        assertEquals(false, set.contains(1));
    }

    @Test
    public void removeFirstElement_setShouldContain2() {
        set.add(1);
        set.add(2);
        set.add(3);
        set.remove(1);

        assertEquals(true, set.contains(2));
    }

    @Test
    public void removeFirstElement_setShouldContain3() {
        set.add(1);
        set.add(2);
        set.add(3);
        set.remove(1);

        assertEquals(true, set.contains(3));
    }

    @Test
    public void removeFirstElement_sizeShouldBe2() {
        set.add(1);
        set.add(2);
        set.add(3);
        set.remove(1);

        assertEquals(2, set.size());
    }

    @Test
    public void removeSecondElement_setShouldNotContain2() {
        set.add(1);
        set.add(2);
        set.add(3);
        set.remove(2);

        assertEquals(false, set.contains(2));
    }

    @Test
    public void removeSecondElement_sizeShouldBe2() {
        set.add(1);
        set.add(2);
        set.add(3);
        set.remove(2);

        assertEquals(2, set.size());
    }

    @Test
    public void remove3FromSet_sizeShouldBe2() {
        set.add(1);
        set.add(2);
        set.add(3);
        set.remove(3);

        assertEquals(2, set.size());
    }

    @Test
    public void remove3FromSet_setShouldNotContain3() {
        set.add(1);
        set.add(2);
        set.add(3);
        set.remove(3);

        assertEquals(false, set.contains(3));
    }

    @Test
    public void afterClear_sizeShouldBe0() {
        set.add(1);
        set.clear();

        assertEquals(0, set.size());
    }

    @Test
    public void afterClear_containShouldReturnFalse() {
        set.add(1);
        set.clear();

        assertEquals(false, set.contains(1));
    }

    @Test
    public void afterClear_setShouldBeEmpty() {
        set.add(1);
        set.clear();

        assertEquals(true, set.isEmpty());
    }

    @Test
    public void emptySet_afterRemove_sizeShouldBe0() {
        set.remove(1);

        assertEquals(0, set.size());
    }



}