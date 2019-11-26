package com.stevenlu.day41proj_tdd

import java.util.*

class SetImpl6 : Set1 {

    //int[] array = new int[10]
    var list = listOf<String>()

    override fun isEmpty(): Boolean {
        return true
    }

    override fun add(value: String) {

    }

    override fun remove(value: String) {

    }

    override fun contains(value: String): Boolean {
        return false
    }

    override fun size(): Int {
        return list.size
    }

    override fun clear() {

    }
}