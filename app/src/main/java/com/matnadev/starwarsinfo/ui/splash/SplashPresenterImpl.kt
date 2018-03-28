package com.matnadev.starwarsinfo.ui.splash

import com.matnadev.starwarsinfo.ui.base.BasePresenterImpl
import java.util.*


/**
 * Created by leonardis on 3/25/18.
 * leonardisrojas@gmail.com
 */
class SplashPresenterImpl<V : SplashView> : BasePresenterImpl<V>(), SplashPresenter<V> {

    override fun decideNextActivity() {
        //TODO Manage session if we needed and delete this code
        var timer = Timer()

        timer.schedule(object : TimerTask() {
            override fun run() {
                baseView!!.openMainActivity()
            }
        }, 5000)
    }
}