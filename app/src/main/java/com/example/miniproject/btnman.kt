package com.example.miniproject

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_btnlogin.*
import kotlinx.android.synthetic.main.activity_btnman.*
import kotlinx.android.synthetic.main.activity_member.*


class btnman : AppCompatActivity() {

    var we = 0.0 //น้ำหนัก
    var he = 0.0 //ส่วนสูง
    var ag = 0.0 //อายุ
    var sum = 0.0
    var op = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_btnman)

        bmrok.setOnClickListener {
            if (op == "1") {
                we = 13.7 * bmrng.text.toString().toDouble()
                he = 5 * bmrcm.text.toString().toDouble()
                ag = 6.8 * bmryear.text.toString().toDouble()
                sum = (66 + we + he - ag) * 1.2
                show.setText("$sum")
                Toast.makeText(this,"กรุณาคัดลอกค่า BMR เพื่อนำไปคำนวนหน้าถัดไป!", Toast.LENGTH_LONG).show()
            }else if (op == "2"){
                we = 13.7 * bmrng.text.toString().toDouble()
                he = 5 * bmrcm.text.toString().toDouble()
                ag = 6.8 * bmryear.text.toString().toDouble()
                sum = (66 + we + he - ag) * 1.375
                show.setText("$sum")
                Toast.makeText(this,"กรุณาคัดลอกค่า BMR เพื่อนำไปคำนวนหน้าถัดไป!", Toast.LENGTH_LONG).show()
            }else if (op == "3"){
                we = 13.7 * bmrng.text.toString().toDouble()
                he = 5 * bmrcm.text.toString().toDouble()
                ag = 6.8 * bmryear.text.toString().toDouble()
                sum = (66 + we + he - ag) * 1.55
                show.setText("$sum")
                Toast.makeText(this,"กรุณาคัดลอกค่า BMR เพื่อนำไปคำนวนหน้าถัดไป!", Toast.LENGTH_LONG).show()
            }
            else if (op == "4"){
                we = 13.7 * bmrng.text.toString().toDouble()
                he = 5 * bmrcm.text.toString().toDouble()
                ag = 6.8 * bmryear.text.toString().toDouble()
                sum = (66 + we + he - ag) * 1.725
                show.setText("$sum")
                Toast.makeText(this,"กรุณาคัดลอกค่า BMR เพื่อนำไปคำนวนหน้าถัดไป!", Toast.LENGTH_LONG).show()
            }else if (op == "5"){
                we = 13.7 * bmrng.text.toString().toDouble()
                he = 5 * bmrcm.text.toString().toDouble()
                ag = 6.8 * bmryear.text.toString().toDouble()
                sum = (66 + we + he - ag) * 1.9
                show.setText("$sum")
                Toast.makeText(this,"กรุณาคัดลอกค่า BMR เพื่อนำไปคำนวนหน้าถัดไป!", Toast.LENGTH_LONG).show()
            }
        }

        ra1.setOnClickListener {
            op = "1"
        }
        ra2.setOnClickListener {
            op = "2"
        }
        ra3.setOnClickListener {
            op = "3"
        }
        ra4.setOnClickListener {
            op = "4"
        }
        ra5.setOnClickListener {
            op = "5"
        }

        bmrclear.setOnClickListener {
            bmryear.setText(null)
            bmrcm.setText(null)
            bmrng.setText(null)
            show.setText(null)
        }

        sexblack.setOnClickListener {
            onBackPressed()
        }

        calm.setOnClickListener {
            val it = Intent(this,calcalm::class.java)
            startActivity(it)
        }
    }
}