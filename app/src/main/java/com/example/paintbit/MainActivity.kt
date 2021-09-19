package com.example.paintbit

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.paintbit.PaintView.Companion.colorList
import com.example.paintbit.PaintView.Companion.currentBrush
import com.example.paintbit.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object{
        var path = Path()
        var paintBrush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        var redBtn = findViewById<ImageButton>(R.id.redColor)
        var blueBtn = findViewById<ImageButton>(R.id.blueColor)
        var blackBtn = findViewById<ImageButton>(R.id.blackColor)
        var whiteBtn = findViewById<ImageButton>(R.id.whiteColor)
        var yellowBtn = findViewById<ImageButton>(R.id.yellowColor)
        var greenBtn = findViewById<ImageButton>(R.id.greenColor)

        redBtn.setOnClickListener{
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }
        blueBtn.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)
        }
        blackBtn.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)

        }
        yellowBtn.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.YELLOW
            currentColor(paintBrush.color)
        }
        greenBtn.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.GREEN
            currentColor(paintBrush.color)
        }

        whiteBtn.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()

        }
    }
    private fun currentColor(color : Int){
        currentBrush = color
        path = Path()
    }
}