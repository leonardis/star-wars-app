package com.matnadev.starwarsinfo.ui.splash

import com.matnadev.starwarsinfo.ui.base.BasePresenter

/**
 * Created by leonardis on 3/25/18.
 * leonardisrojas@gmail.com
 */
interface SplashPresenter<V: SplashView>: BasePresenter<V> {
    fun decideNextActivity()
}