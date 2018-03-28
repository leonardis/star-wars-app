package com.matnadev.starwarsinfo.ui.base

import android.icu.lang.UCharacter.GraphemeClusterBreak.V



/**
 * Created by leonardis on 3/25/18.
 * leonardisrojas@gmail.com
 */
open class BasePresenterImpl<V : BaseView>() : BasePresenter<V> {

    var baseView: V? = null

    init {
    }

    override fun onAttach(baseView: V) {
        this.baseView = baseView
    }
}