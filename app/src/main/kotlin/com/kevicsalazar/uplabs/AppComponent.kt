package com.kevicsalazar.uplabs

import android.content.Context
import com.kevicsalazar.uplabs.api.WebServiceModule
import com.kevicsalazar.uplabs.api.ws.WebServiceIOSPosts
import com.kevicsalazar.uplabs.api.ws.WebServiceMaterialPosts
import com.kevicsalazar.uplabs.base.scopes.PerApp
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

    // Web Service

    fun getWebServiceMaterialPosts(): WebServiceMaterialPosts

    fun getWebServiceIOSPosts(): WebServiceIOSPosts

    // Initializer

    object Initializer {
        fun init(app: App): AppComponent =
                DaggerAppComponent.builder()
                        .appModule(AppModule(app))
                        .webServiceModule(WebServiceModule())
                        .build()
    }

}