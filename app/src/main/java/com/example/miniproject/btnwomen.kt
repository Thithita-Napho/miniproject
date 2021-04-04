package com.example.miniproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_btnman.*
import kotlinx.android.synthetic.main.activity_btnwomen.*

class btnwomen : AppCompatActivity() {

    var wwe = 0.0 //น้ำหนัก
    var whe = 0.0 //ส่วนสูง
    var wag = 0.0 //อายุ
    var sumW = 0.00
    var wop = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_btnwomen)

        Wobmrok.setOnClickListener {
            if (wop == "1") {
                wwe = 9.6 * Wobmrng.text.toString().toDouble()
                whe = 1.8 * Wobmrcm.text.toString().toDouble()
                wag = 4.7 * Wobmryear.text.toString().toDouble()
                sumW = (665 + wwe + whe - wag) * 1.2
                WtViwe.setText("$sumW")
                Toast.makeText(this,"กรุณาคัดลอกค่า BMR เพื่อนำไปคำนวนหน้าถัดไป!", Toast.LENGTH_LONG).show()
            }else if (wop == "2"){
                wwe = 9.6 * Wobmrng.text.toString().toDouble()
                whe = 1.8 * Wobmrcm.text.toString().toDouble()
                wag = 4.7 * Wobmryear.text.toString().toDouble()
                sumW = (665 + wwe + whe - wag) * 1.375
                WtViwe.setText("$sumW")
                Toast.makeText(this,"กรุณาคัดลอกค่า BMR เพื่อนำไปคำนวนหน้าถัดไป!", Toast.LENGTH_LONG).show()
            }else if (wop == "3"){
                wwe = 9.6 * Wobmrng.text.toString().toDouble()
                whe = 1.8 * Wobmrcm.text.toString().toDouble()
                wag = 4.7 * Wobmryear.text.toString().toDouble()
                sumW = (665 + wwe + whe - wag) * 1.55
                WtViwe.setText("$sumW")
                Toast.makeText(this,"กรุณาคัดลอกค่า BMR เพื่อนำไปคำนวนหน้าถัดไป!", Toast.LENGTH_LONG).show()
            }
            else if (wop == "4"){
                wwe = 9.6 * Wobmrng.text.toString().toDouble()
                whe = 1.8 * Wobmrcm.text.toString().toDouble()
                wag = 4.7 * Wobmryear.text.toString().toDouble()
                sumW = (665 + wwe + whe - wag) * 1.725
                WtViwe.setText("$sumW")
                Toast.makeText(this,"กรุณาคัดลอกค่า BMR เพื่อนำไปคำนวนหน้าถัดไป!", Toast.LENGTH_LONG).show()
            }else if (wop == "5"){
                wwe = 9.6 * Wobmrng.text.toString().toDouble()
                whe = 1.8 * Wobmrcm.text.toString().toDouble()
                wag = 4.7 * Wobmryear.text.toString().toDouble()
                sumW = (665 + wwe + whe - wag) * 1.9
                WtViwe.setText("$sumW")
                Toast.makeText(this,"กรุณาคัดลอกค่า BMR เพื่อนำไปคำนวนหน้าถัดไป!", Toast.LENGTH_LONG).show()
            }
        }

        Wora1.setOnClickListener {
            wop = "1"
        }
        Wora2.setOnClickListener {
            wop = "2"
        }
        Wora3.setOnClickListener {
            wop = "3"
        }
        Wora4.setOnClickListener {
            wop = "4"
        }
        Wora5.setOnClickListener {
            wop = "5"
        }

        Wobmrclear.setOnClickListener {
            Wobmryear.setText(null)
            Wobmrcm.setText(null)
            Wobmrng.setText(null)
            WtViwe.setText(null)
        }

        Wosexblack.setOnClickListener {
            onBackPressed()
        }
        calwm.setOnClickListener {
            val it = Intent(this,calcalm::class.java)
            startActivity(it)
        }
    }
}