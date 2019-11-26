package com.stevenlu.day41proj_tdd

class SetImpl5() : Set1 {

    var set: ArrayList<String> = ArrayList()

    override fun isEmpty(): Boolean {
        if(set.size != 0){
            return false
        }
        return true
    }

    override fun add(value: String) {

        for (i in set.indices) {
            if (set[i] == value) {
                return
            }
        }
        set.add(value)
    }

    override fun remove(value: String) {

        for (i in set.indices){
            if(set[i] == value){
                set.removeAt(i)
            }
        }
    }

    override fun contains(value: String): Boolean {
        for (i in set.indices){
            if(set[i] == value){
                return true
            }
        }
        return false
    }

    override fun size(): Int {
        return set.size
    }

    override fun clear() {
        set.clear()
    }
}