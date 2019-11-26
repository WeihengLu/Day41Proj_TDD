package com.stevenlu.day41proj_tdd

interface Set {

    val isEmpty: Boolean

    fun add(value: Int)

    fun remove(value: Int)

    operator fun contains(value: Int): Boolean

    fun size(): Int

    fun clear()

}
