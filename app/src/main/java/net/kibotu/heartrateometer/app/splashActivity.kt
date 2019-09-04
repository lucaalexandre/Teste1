package net.kibotu.heartrateometer.app

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import net.kibotu.heartrateometer.MainActivity

class splashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        carregar()
    }

    private fun carregar() {
        val intent = Intent(this, MainActivity::class.java)

        Handler().postDelayed({
            intent.change()

            finish()
        }, 3000)
    }

    fun Intent.change(){
        startActivity(this)
        finish()


    }
}
