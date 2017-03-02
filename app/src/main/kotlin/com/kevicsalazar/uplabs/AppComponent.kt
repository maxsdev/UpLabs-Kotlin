package com.kevicsalazar.uplabs

import android.content.Context
import android.content.SharedPreferences
import com.kevicsalazar.uplabs.domain.DataHelper
import com.kevicsalazar.uplabs.repository.WebServiceModule
import com.kevicsalazar.uplabs.repository.ws.WebServicePosts
import dagger.Component

/**
 * @author Kevin Salazar
 * @link kevicsalazar.com
 */
@PerApp
@Component(modules = arrayOf(AppModule::class, WebServiceModule::class))
interface AppComponent {

    fun inject(app: App)

    // App Module

    fun getContext(): Context

    fun getSharedPreferences(): SharedPreferences

    // Web Service

    fun getWebServicePosts(): WebServicePosts

    // Data

    fun getDataHelper(): DataHelper

    // Initializer

    object Initializer {
        fun init(app: App): AppComponent =
                DaggerAppComponent.builder()
                        .appModule(AppModule(app))
                        .webServiceModule(WebServiceModule())
                        .build()
    }

}