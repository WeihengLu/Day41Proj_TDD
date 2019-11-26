package com.stevenlu.day41proj_tdd

interface Set1 {

    fun isEmpty(): Boolean

    fun add(value: String)

    fun remove(value: String)

    operator fun contains(value: String): Boolean

    fun size(): Int

    fun clear()

}
