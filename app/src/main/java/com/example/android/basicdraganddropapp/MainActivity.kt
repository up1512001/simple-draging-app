package com.example.android.basicdraganddropapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.jmedeisis.draglinearlayout.DragLinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dragLayout : DragLinearLayout = findViewById(R.id.drag)

        for(i in 0 until  dragLayout.childCount){
            val child : View = dragLayout.getChildAt(i)
            dragLayout.setViewDraggable(child,child)
        }


    }
}