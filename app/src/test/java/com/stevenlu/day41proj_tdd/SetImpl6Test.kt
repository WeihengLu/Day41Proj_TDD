package com.stevenlu.day41proj_tdd

import org.junit.Test

import org.junit.Assert.*

class SetImpl6Test {

    var set: Set1 = SetImpl6()

    @Test
    fun isEmpty_noAction_returnTrue(){
        assertEquals(true, set.isEmpty())
    }

    @Test
    fun contains_noAction_returnFalse(){
        assertEquals(false, set.contains("Hi"))
    }

    @Test
    fun size_noAction_return0(){
        assertEquals(0, set.size())
    }

    @Test
    fun add_addOneValue_sizeReturn1(){
        set.add("Hi")
        assertEquals(1, set.size())
    }
}