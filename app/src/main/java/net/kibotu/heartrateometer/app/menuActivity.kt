package net.kibotu.heartrateometer.app

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*
import net.kibotu.heartrateometer.MainActivity

class menuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btn_oximetria.setOnClickListener{

            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btn_digital.setOnClickListener{

           // val intent2 = Intent(this,FingerprintActivity::class.java)
            //startActivity(intent2)
        }
    }
}
