package com.matnadev.starwarsinfo.ui.base

/**
 * Created by leonardis on 3/25/18.
 * leonardisrojas@gmail.com
 */
interface BasePresenter<in V : BaseView> {

    fun onAttach(baseView: V)

}