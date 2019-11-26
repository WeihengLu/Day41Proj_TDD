package com.stevenlu.day41proj_tdd;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetImpl3Test {
    Set set = new SetImpl3();

    @Test
    public void noAction_isEmptyShouldReturnTrue(){
        assertEquals(true, set.isEmpty());
    }

    @Test
    public void input8_containsShouldRetrunFalse(){
        assertEquals(false, set.contains(8));
    }

    @Test
    public void noAction_sizeShouldReturn0(){
        assertEquals(0, set.size());
    }

    @Test
    public void addOneValue_isEmptyShouldReturnFalse(){
        set.add(4);

        assertEquals(false, set.isEmpty());
    }

    @Test
    public void addOneValye_containsShouldRetrunTrue(){
        set.add(4);

        assertEquals(true, set.contains(4));
    }

    @Test
    public void addOneValue_sizeShouldReturn1(){
        set.add(4);

        assertEquals(1, set.size());
    }

    @Test
    public void addTwoSameValue_sizeShouldReturn1(){
        set.add(4);
        set.add(4);

        assertEquals(1, set.size());
    }

    @Test
    public void addOneValue_containsShouldReturnTrue(){
        set.add(4);

        assertEquals(true, set.contains(4));
    }

    @Test
    public void addTwoSameValue_check5_containShouldReturnTrue(){
        set.add(4);
        set.add(5);

        assertEquals(true, set.contains(5));
    }

    @Test
    public void addOneValue_RemoveThisValue_isEmptyShouldReturnTrue(){
        set.add(4);
        set.remove(4);

        assertEquals(true, set.isEmpty());
    }

    @Test
    public void addOneValue_RemoveThisValue_containShouldReturnFalse(){
        set.add(4);
        set.remove(4);

        assertEquals(false, set.contains(4));
    }

    @Test
    public void addOneValue_RemoveTwiceThisValue_sizeShouldReturn0(){
        set.add(4);
        set.remove(4);
        set.remove(4);

        assertEquals(0, set.size());
    }

    @Test
    public void addOneValue_RemoveOtherValue_sizeShouldReturn1(){
        set.add(4);
        set.remove(5);

        assertEquals(1, set.size());
    }

    @Test
    public void addOneValue_RemoveThatValue_ThenAddSameValue_sizeShouldReturn1(){
        set.add(4);
        set.remove(4);
        set.add(4);

        assertEquals(1, set.size());
    }

    @Test
    public void addOneValue_RemoveThatValue_ThenAddSameValue_containsShouldReturnTrue(){
        set.add(4);
        set.remove(4);
        set.add(4);

        assertEquals(true, set.contains(4));
    }

    @Test
    public void addThreeValue_Remove4_ThenAdd5_sizeShouldReturn3(){
        set.add(2);
        set.add(3);
        set.add(4);
        set.remove(4);
        set.add(5);

        assertEquals(3, set.size());
    }

    @Test
    public void addThreeValue_Remove4_ThenAdd5_containsShouldReturnFalse(){
        set.add(2);
        set.add(3);
        set.add(4);
        set.remove(3);
        set.add(5);

        assertEquals(true, set.contains(5));
    }

    @Test
    public void addThreeValue_Remove4_ThenAdd5_containsShouldReturnTrue(){
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.remove(2);
        set.add(6);

        assertEquals(true, set.contains(4));
    }

    @Test
    public void addOneValue_thenClearSet_sizeShouldReturn0(){
        set.add(4);
        set.clear();

        assertEquals(0 , set.size());
    }

    @Test
    public void addOneValue_thenClearSet_isEmptyShouldReturnTrue(){
        set.add(4);
        set.clear();

        assertEquals(true , set.isEmpty());
    }

}