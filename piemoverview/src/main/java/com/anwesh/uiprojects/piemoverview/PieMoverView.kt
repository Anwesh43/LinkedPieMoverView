package com.anwesh.uiprojects.piemoverview

/**
 * Created by anweshmishra on 01/08/18.
 */

import android.view.View
import android.content.Context
import android.view.MotionEvent
import android.graphics.Canvas
import android.graphics.Paint

val nodes : Int = 5

class PieMoverView(ctx : Context) : View(ctx) {

    private val paint : Paint = Paint(Paint.ANTI_ALIAS_FLAG)

    override fun onDraw(canvas : Canvas) {

    }

    override fun onTouchEvent(event : MotionEvent) : Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {

            }
        }
        return true
    }
}