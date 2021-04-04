package com.example.miniproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_app.*
import kotlinx.android.synthetic.main.activity_calcalm.*
import kotlinx.android.synthetic.main.activity_main.*

class app : AppCompatActivity() {

    var auth: FirebaseAuth? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)

        auth = FirebaseAuth.getInstance()
        goman.setOnClickListener {
            val it = Intent(this, btnman::class.java)
            startActivity(it)
        }
        gowomen.setOnClickListener {
            val it = Intent(this, btnwomen::class.java)
            startActivity(it)
        }
        logout2.setOnClickListener {
            auth!!.signOut()

            Toast.makeText(this,"LogOut Complete", Toast.LENGTH_LONG).show()

            val it = Intent(this,MainActivity::class.java)
            startActivity(it)
            finish()
        }
    }

}