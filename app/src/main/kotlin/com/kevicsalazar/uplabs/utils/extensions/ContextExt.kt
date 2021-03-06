package com.kevicsalazar.uplabs.utils.extensions

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat

/**
 * Created by Kevin.
 */

fun Context.colorRes(colorResId: Int): Int {
    return ContextCompat.getColor(this, colorResId)
}

fun Context.colorStateListRes(colorResId: Int): ColorStateList {
    return ContextCompat.getColorStateList(this, colorResId)
}

fun Context.intRes(intResId: Int): Int {
    return resources.getInteger(intResId)
}

fun Context.dimenRes(dimenResId: Int): Int {
    return resources.getDimensionPixelSize(dimenResId)
}

fun Context.stringArrayRes(arrayResId: Int): Array<String> {
    return resources.getStringArray(arrayResId)
}

fun Context.intArrayRes(arrayResId: Int): IntArray {
    return resources.getIntArray(arrayResId)
}

fun Context.drawableRes(drawableResId: Int): Drawable {
    return ContextCompat.getDrawable(this, drawableResId)
}

fun Context.typefaceFromAssets(assetPathResId: Int): Typeface {
    return typefaceFromAssets(getString(assetPathResId))
}

fun Context.typefaceFromAssets(assetPath: String): Typeface {
    return Typeface.createFromAsset(assets, assetPath)
}

fun Fragment.colorRes(colorResId: Int): Int {
    return ContextCompat.getColor(activity, colorResId)
}

fun Fragment.intRes(intResId: Int): Int {
    return resources.getInteger(intResId)
}

fun Fragment.dimenRes(dimenResId: Int): Int {
    return resources.getDimensionPixelSize(dimenResId)
}

fun Fragment.stringArrayRes(arrayResId: Int): Array<String> {
    return resources.getStringArray(arrayResId)
}

fun Fragment.intArrayRes(arrayResId: Int): IntArray {
    return resources.getIntArray(arrayResId)
}

fun Fragment.drawableRes(drawableResId: Int): Drawable {
    return ContextCompat.getDrawable(context, drawableResId)
}

fun Fragment.typefaceFromAssets(assetPathResId: Int): Typeface {
    return typefaceFromAssets(getString(assetPathResId))
}

fun Fragment.typefaceFromAssets(assetPath: String): Typeface {
    return Typeface.createFromAsset(activity.assets, assetPath)
}