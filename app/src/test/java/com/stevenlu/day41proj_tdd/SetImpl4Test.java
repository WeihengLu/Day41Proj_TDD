package com.stevenlu.day41proj_tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class SetImpl4Test {

    Set set = new SetImpl4();

    @Test
    public void noAction_sizeShouldReturn0(){
        assertEquals(0, set.size());
    }

    @Test
    public void noAction_isEmptyShouldReturnTrue(){
        assertEquals(true,set.isEmpty());
    }

    @Test
    public void noAction_containsShouldReturnFalse(){
        assertEquals(false,set.contains(8));
    }

    @Test
    public void addOneValue_sizeShouldReturn1(){
        set.add(8);
        assertEquals(1,set.size());
    }

    @Test
    public void addTwoValue_sizeShouldReturn2(){
        set.add(8);
        set.add(9);
        assertEquals(2,set.size());
    }

    @Test
    public void addTwoSameValue_sizeShouldReturn1(){
        set.add(8);
        set.add(8);
        assertEquals(1,set.size());
    }

    @Test
    public void addOneValue_isEmptyShouldReturnFalse(){
        set.add(8);
        assertEquals(false,set.isEmpty());
    }

    @Test
    public void add8Value_containsShouldReturnTrue(){
        set.add(8);
        assertEquals(true,set.contains(8));
    }

    @Test
    public void addOneValue_RemoveIt_sizeShouldReturn0(){
        set.add(8);
        set.remove(8);
        assertEquals(0,set.size());
    }

    @Test
    public void addOneValue_RemoveIt_isEmptyShouldReturnTrue(){
        set.add(8);
        set.remove(8);
        assertEquals(true,set.isEmpty());
    }

    @Test
    public void addOneValue_RemoveIt_containsShouldReturnFalse(){
        set.add(8);
        set.remove(8);
        assertEquals(false,set.contains(8));
    }

    @Test
    public void removeOneValue_sizeShouldReturn0(){
        set.remove(8);
        assertEquals(0,set.size());
    }

    @Test
    public void add10Value_removeOne_addOneValue_sizeShouldReturn10(){
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.remove(5);
        set.add(11);
        assertEquals(10,set.size());
    }

    @Test
    public void add10Value_removeOne_addOneValue_contains5ShouldReturnFalse(){
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.remove(5);
        set.add(11);
        assertEquals(false,set.contains(5));
    }

    @Test
    public void add10Value_removeOne_addOneValue_contains10ShouldReturnTrue(){
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.remove(5);
        set.add(11);
        assertEquals(true,set.contains(10));
    }

    @Test
    public void add4Value_removeOne_addOneValue_contains4ShouldReturnTrue(){
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.remove(2);
        set.add(5);
        assertEquals(true,set.contains(1));
    }

    @Test
    public void add4Value_contains1ShouldReturnTrue(){
        set.add(1);
        set.add(2);
        set.add(4);
        assertEquals(true,set.contains(1));
    }

    @Test
    public void add4Value_removeOne_addOneValue_sizeShouldReturn4(){
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.remove(2);
        set.add(5);
        assertEquals(4,set.size());
    }

    @Test
    public void add4Value_removeOne_addOneValue_contains3ShouldReturnTrue(){
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.remove(2);
        set.add(5);
        assertEquals(true,set.contains(3));
    }

    @Test
    public void addTwoValues_applyClear_sizeShouldReturn0(){
        set.add(8);
        set.clear();

        assertEquals(0, set.size());
    }

}