package com.zhangyue.com.mykotlinproject.random

/**
 * @date 2017/6/15
 * @author lihanrui
 */
abstract class ABuilder {

    /**
     * 设置随机数种子
     */
    abstract fun setSeed(seed:Long):ABuilder

    /**
     * 设置随机数上界
     */
    abstract fun setUpRange(up:Int):ABuilder

    /**
     * 设置随机数下界
     */
    abstract fun setLowRange(low:Int):ABuilder

    /**
     * 创建Arandom
     */
    abstract fun build():ARandom

}