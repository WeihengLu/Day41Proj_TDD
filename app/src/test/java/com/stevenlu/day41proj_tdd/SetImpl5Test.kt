package com.stevenlu.day41proj_tdd

import org.junit.Assert.assertEquals
import org.junit.Test

class SetImpl5Test {

    var set: Set1 = SetImpl5()

    @Test
    fun size_noAction_return0() {
        assertEquals(0, set.size())
    }

    @Test
    fun isEmpty_noAction_returnTrue() {
        assertEquals(true, set.isEmpty())
    }

    @Test
    fun contains_noAction_returnFalse() {
        assertEquals(false, set.contains("Hi"))
    }

    @Test
    fun add_addOneValue_sizeReturn1() {
        set.add("Hi")
        assertEquals(1, set.size())
    }

    @Test
    fun add_addOneValue_containsReturnTrue() {
        set.add("Hi")
        assertEquals(true, set.contains("Hi"))
    }

    @Test
    fun add_addOneValue_isEmptyReturnFalse() {
        set.add("Hi")
        assertEquals(false, set.isEmpty())
    }

    @Test
    fun add_addTwoDiffValue_sizeReturn2() {
        set.add("Hi")
        set.add("World")
        assertEquals(2, set.size())
    }

    @Test
    fun add_addTwoSameValue_sizeReturn1() {
        set.add("Hi")
        set.add("Hi")
        assertEquals(1, set.size())
    }

    @Test
    fun remove_addOneValue_removeOneValue_sizeReturn0(){
        set.add("Hi")
        set.remove("Hi")
        assertEquals(0, set.size())
    }

    @Test
    fun remove_removeOneValue_sizeReturn0(){
        set.remove("Hi")
        assertEquals(0, set.size())
    }

    @Test
    fun clear_addOneValue_clear_sizeReturn0(){
        set.add("Hi")
        set.clear()
        assertEquals(0, set.size())
    }


}