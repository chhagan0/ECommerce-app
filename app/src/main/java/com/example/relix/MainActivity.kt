

package com.example.relix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.ActionBar
import com.example.relix.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar: ActionBar?= supportActionBar
        actionBar?.hide()
        val imageView=findViewById<ImageView>(R.id.imageview1)
        val ani: Animation = AnimationUtils.loadAnimation(this,R.anim.left_to_right)
        imageView.setAnimation(ani)
        try {
            Handler().postDelayed(
                {
                    startActivity(Intent(this,Login::class.java))
                    finish()
                },3000
            )
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
}