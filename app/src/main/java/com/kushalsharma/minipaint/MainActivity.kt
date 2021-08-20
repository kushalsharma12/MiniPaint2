package com.kushalsharma.minipaint

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("NewApi")
//    @android.support.annotation.RequiresApi(Build.VERSION_CODES.DONUT)
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val myCanvasView = MyCanvasView(this)
        myCanvasView.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN
        myCanvasView.contentDescription = getString(R.string.canvasContentDescription)
        setContentView(myCanvasView)

        println("Something useful is going on, working to change the world and know why I am living. Life is fragile and one can die at any time or soon")

        Toast.makeText(this, "Start drawing with clarity.", Toast.LENGTH_SHORT).show()

        println("adding a feature in new branch the barjflds")
    }
}