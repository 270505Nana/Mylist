package com.example.mylist.Utills

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton

class FontButton(context: Context, attributeSet: AttributeSet):AppCompatButton(context, attributeSet) {

    init{
        //Call the function to apply the font to components
        applyFont()


    }
    private fun applyFont(){
        val typeFace: Typeface =
            Typeface.createFromAsset(context.assets, "kalste.ttf")
        //path disini dia drop src file font yang mau kita pakai/terapkan

        setTypeface(typeface)
    }
}