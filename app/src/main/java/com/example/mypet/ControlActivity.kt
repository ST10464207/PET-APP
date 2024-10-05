package com.example.mypet

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class ControlActivity : AppCompatActivity() {

//variables
    lateinit var fbutton:Button
    lateinit var cbutton:Button
    lateinit var pbutton:Button
    lateinit var image: ImageView
    lateinit var hunger:TextView
    lateinit var cleanliness: TextView
    lateinit var play:TextView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_control)

        fbutton=findViewById(R.id.feedbutton)
        cbutton=findViewById(R.id.cleanButton)
        pbutton=findViewById(R.id.playButton)
        image=findViewById(R.id.petImage)
        hunger=findViewById(R.id.hungerStatus)
        cleanliness=findViewById(R.id.cleanlinessStatus)
        play=findViewById(R.id.playStatus)



//click on feed button
        fbutton.setOnClickListener {
            if (image.tag=="welcome")
            {
                image.setImageResource(R.drawable.eat)
                image.tag="eat"
            }
            else
            {
        image.setImageResource(R.drawable.welcome)
        image.tag="welcome"

    }
            //when clicking on this clean button
            cbutton.setOnClickListener {
                if (image.tag=="welcome")
                {
                    image.setImageResource(R.drawable.clean)
                    image.tag="clean"
                }
                else
                {
                    image.setImageResource(R.drawable.welcome)
                    image.tag="welcome"
}
                //clicking on the play button
                pbutton.setOnClickListener {
                    if (image.tag=="welcome")
                    {
                        image.setImageResource(R.drawable.play)
                        image.tag="play"
                    }
                    else
                    {
                        image.setImageResource(R.drawable.welcome)
                        image.tag="welcome"
            }}}}}


    }
