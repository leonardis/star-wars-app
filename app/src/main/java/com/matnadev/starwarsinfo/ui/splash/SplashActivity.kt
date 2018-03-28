package com.matnadev.starwarsinfo.ui.splash

import android.content.Intent
import android.os.Bundle

import com.matnadev.starwarsinfo.R
import com.matnadev.starwarsinfo.ui.main.MainActivity
import com.matnadev.starwarsinfo.ui.base.BaseActivity

class SplashActivity : BaseActivity(), SplashView {

    private lateinit var splashPresenterImpl: SplashPresenterImpl<SplashView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        splashPresenterImpl = SplashPresenterImpl()
        splashPresenterImpl.onAttach(this)
        splashPresenterImpl.decideNextActivity()
    }

    override fun openMainActivity() {
        val mainIntent = Intent(this, MainActivity::class.java)
        startActivity(mainIntent)
        finish()
    }
}
