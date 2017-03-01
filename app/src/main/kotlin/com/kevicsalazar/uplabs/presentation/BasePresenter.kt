package com.kevicsalazar.uplabs.presentation

import java.io.IOException

/**
 * Created by Kevin Salazar
 */
abstract class BasePresenter<T : BasePresenter.BaseView> {

    protected var view: T? = null

    fun with(v: T): BasePresenter<T> {
        view = v
        return this
    }

    /**
     * This method will be executed on
     * [AppCompatActivity.onResume] in case presenter is attached to activity
     * [Fragment.onResume]  in case presenter is attached to fragment
     */
    abstract fun onResume()

    /**
     * This method will be executed on
     * [AppCompatActivity.onPause] in case presenter is attached to activity
     * [Fragment.onPause]  in case presenter is attached to fragment
     */
    abstract fun onPause()

    /**
     * This method will be executed on
     * [AppCompatActivity.onDestroy] in case presenter is detached to activity
     * [Fragment.onDestroy] in case presenter is detached to fragment
     */
    abstract fun onDestroy()

    /**
     * This method will be executed when an error occurs

     * @param error is an error or exception
     */
    fun onError(error: Throwable) {
        view?.hideProgress()
        error.printStackTrace()
        if (error is IOException) {
            view?.showMessage("Error", "No hay internet")
        } else {
            view?.showMessage("Error", "Ha ocurrido un error")
        }
    }

    interface BaseView {

        fun showProgress()

        fun hideProgress()

        fun showMessage(title: String, message: String)

    }

}