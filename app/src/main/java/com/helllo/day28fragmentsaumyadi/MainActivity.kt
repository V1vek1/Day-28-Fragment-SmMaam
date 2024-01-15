package com.helllo.day28fragmentsaumyadi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.helllo.day28fragmentsaumyadi.ui.login.LoginFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClock = findViewById<Button>(R.id.btnTime)
        val buttonExam = findViewById<Button>(R.id.btnExam)
        val buttonValidate = findViewById<Button>(R.id.btnValidate)


        buttonClock.setOnClickListener {
          //   replaceFrameWithFragment(Clock_Fragment())

         // * niche wale
           supportFragmentManager.beginTransaction().replace(R.id.frameLayout, Clock_Fragment()).commit()
        }



        buttonExam.setOnClickListener {

            // * Niche wale ek line se hum wo pura kaam kar pa rhe h jo hum uper wale Button ke Private
            // * Function bnakar kar rhe h

            supportFragmentManager.beginTransaction().replace(R.id.frameLayout, Exam_Fragment()).commit()
        }

        buttonValidate.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frameLayout, LoginFragment()).commit()
        }
    }

//    private fun replaceFrameWithFragment(frag: Clock_Fragment) {
//
//        val fragManager = supportFragmentManager
//        val fragTransaction = fragManager.beginTransaction()
//        fragTransaction.replace(R.id.frameLayout, frag)
//        fragTransaction.commit()
//    }

}