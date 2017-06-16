package com.zhangyue.com.mykotlinproject

import android.os.Bundle
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar

class MainActivity : AppCompatActivity() {

    var mTbMain: Toolbar? = null
    var mActionBar:ActionBar? = null

    var mFragment:MainFragment? = null
    var mPresenter :MainPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initActionBar()

        initFragment()
    }

    private fun initActionBar() {
        //这里需要简化
        mTbMain = findViewById(R.id.tb_main) as Toolbar
        setSupportActionBar(mTbMain)
        mActionBar = supportActionBar
    }

    private fun initFragment() {
        supportFragmentManager.findFragmentById(R.id.rl_main_frag) as MainFragment?
        if (mFragment == null) {
            mFragment = MainFragment()
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.rl_main_frag, mFragment).commit()
            mPresenter = MainPresenter(mFragment!!)
        }
    }

}
