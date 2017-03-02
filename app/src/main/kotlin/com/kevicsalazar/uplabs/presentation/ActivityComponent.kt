package com.kevicsalazar.uplabs.presentation

import android.support.v4.app.FragmentActivity
import com.kevicsalazar.uplabs.App
import com.kevicsalazar.uplabs.AppComponent
import com.kevicsalazar.uplabs.presentation.views.MainActivity
import com.kevicsalazar.uplabs.presentation.views.PageFragment
import com.kevicsalazar.uplabs.presentation.views.PostActivity
import dagger.Component

/**
 * @author Kevin Salazar
 * @link kevicsalazar.com
 */
@PerActivity
@Component(dependencies = arrayOf(AppComponent::class))
interface ActivityComponent {

    fun inject(activity: MainActivity)

    fun inject(fragment: PageFragment)

    fun inject(activity: PostActivity)

    // Initializer

    object Initializer {
        fun init(activity: FragmentActivity): ActivityComponent =
                DaggerActivityComponent.builder()
                        .appComponent((activity.application as App).appComponent)
                        .build()
    }

}
