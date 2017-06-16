package com.zhangyue.com.mykotlinproject

/**
 * @date 2017/6/15
 * @author lihanrui
 */
public interface MainContract {

    interface Presenter : BasePresenter {

        /**
         * 获取随机数字
         */
        fun getCount(list: ArrayList<Int>,error: () -> Unit) : Int
    }

    interface View : BaseView<Presenter> {
        /**
         * 向列表中添加随机数字
         */
        fun addCount(count : Int)   //Glide

        fun showEmptyView()

        fun hideEmptyView()

    }
}