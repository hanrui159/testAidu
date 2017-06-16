package com.zhangyue.com.mykotlinproject.random

import java.util.*

/**
 * @date 2017/6/15
 * @author lihanrui
 */
class CountRandom(override var seed: Long, override var upRange: Int, override var lowRange: Int):ARandom() {

    var mRandom :Random? = null

    init {
        mRandom = Random(seed)
    }

    override fun next(): Int {
        return mRandom?.nextInt(upRange - lowRange)!! + lowRange
    }

    class Builder:ABuilder() {
        var seed:Long? = null
        var upRange:Int? = null
        var lowRange:Int? = null

        override fun setSeed(seed: Long): ABuilder {
            this.seed = seed
            return this
        }

        override fun setUpRange(up: Int): ABuilder {
            this.upRange = up
            return this
        }

        override fun setLowRange(low: Int): ABuilder {
            this.lowRange = low
            return this
        }


        override fun build(): ARandom {
            return CountRandom(seed!!,upRange!!,lowRange!!)
        }
    }
}