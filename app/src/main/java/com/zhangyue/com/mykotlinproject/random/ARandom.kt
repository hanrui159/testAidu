package com.zhangyue.com.mykotlinproject.random

/**
 * 产生随机数的抽象类
 * @date 2017/6/15
 * @author lihanrui
 */
abstract class ARandom {

    /**
     * 随机数种子
     */
    abstract var seed:Long

    /**
     * 随机数上界
     */
    abstract var upRange:Int

    /**
     * 随机数下界
     */
    abstract var lowRange:Int

    /**
     * 获取下一个随机数
     */
    abstract fun next():Int
}