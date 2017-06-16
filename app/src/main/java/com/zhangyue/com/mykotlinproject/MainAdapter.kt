package com.zhangyue.com.mykotlinproject

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

/**
 * @date 2017/6/15
 * @author lihanrui
 */
class MainAdapter:RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    var list : ArrayList<Int> = ArrayList<Int>()
    set(value){
        list.clear()
        list.addAll(value!!)
        notifyDataSetChanged()
    }

    var maxCount: Int? = null

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MainViewHolder{
        var v : View = LayoutInflater.from(parent?.context).inflate(R.layout.random_count_item,parent,false)
        return MainViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list?.size!!
    }

    override fun onBindViewHolder(holder: MainViewHolder?, position: Int) {
        maxCount = list.max()
        holder?.mTvSerialNum?.text = "${position+1}"
        holder?.mTvCount?.text = "${list?.get(position)}"
        if (maxCount == list[position]) {
            holder?.mImgTag?.visibility = View.VISIBLE
        } else {
            holder?.mImgTag?.visibility = View.INVISIBLE
        }
    }

    /**
     * 添加元素
     */
    fun addItem(param:Int,action:(Int) -> Unit){
        list?.add(param)
        notifyItemInserted(itemCount) //显示添加动画
        action(itemCount)
        if (list.max() == param) { //该元素是最大的
            notifyDataSetChanged()
        }
    }

    /**
     * 清除所有元素
     */
    fun clear() {
        list.clear()
        notifyDataSetChanged()
    }

    class MainViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        var mTvCount: TextView? = null
        var mTvSerialNum: TextView? = null
        var mImgTag: ImageView? = null

        init {
            mTvSerialNum = itemView.findViewById(R.id.tv_ramdom_count_item_serial_number) as TextView
            mTvCount = itemView.findViewById(R.id.tv_random_count_item_count) as TextView
            mImgTag = itemView.findViewById(R.id.img_random_count_item_tag) as ImageView
        }
    }
}