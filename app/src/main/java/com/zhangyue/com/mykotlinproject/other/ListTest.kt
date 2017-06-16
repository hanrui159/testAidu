package com.zhangyue.com.mykotlinproject.other

/**
 * @date 2017/6/15
 * @author lihanrui
 */
class ListTest {

    private var TAG = "listTest"

    fun test() {

        var list:ArrayList<Int> = ArrayList<Int>()
        list.add(1)
        list.add(2)
        list.add(3)
        list.add(4)
        list.add(5)

        list.forEach {
            println(it)
        }
    }
}