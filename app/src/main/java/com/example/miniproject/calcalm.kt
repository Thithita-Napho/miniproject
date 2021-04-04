package com.example.miniproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_btnlogin.*
import kotlinx.android.synthetic.main.activity_calcalm.*
import kotlinx.android.synthetic.main.activity_member.*

class calcalm : AppCompatActivity() {
    var auth: FirebaseAuth? = null
    var food1=1
    var ff1=0.0
    var ff2=0.0
    var ff3=0.0
    var af1=0.0
    var af2=0.0
    var af3=0.0
    var if1=0.0
    var if2=0.0
    var if3=0.0
    var anser=0.0
    var callodi=0.0
    var ans = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcalm)
        auth = FirebaseAuth.getInstance()

        savefood.setOnClickListener {
            if (food1 == 1){
                ff1 = 500 * editTextNumber2.text.toString().toDouble()
                ff2 = 100 * editTextNumber3.text.toString().toDouble()
                ff3 = 15 * editTextNumber4.text.toString().toDouble()
                af1 = 500 * editTextNumber5.text.toString().toDouble()
                af2 = 100 * editTextNumber6.text.toString().toDouble()
                af3 = 15 * editTextNumber7.text.toString().toDouble()
                if1 = 500 * editTextNumber8.text.toString().toDouble()
                if2 = 100 * editTextNumber9.text.toString().toDouble()
                if3 = 15 * editTextNumber10.text.toString().toDouble()
                callodi = editTextNumber.text.toString().toDouble()
                anser = (ff1+ff2+ff3)+(af1+af2+af3)+(if1+if2+if3)
                calvm222.setText("$anser")
            }
                if (food1==1 && anser > callodi){
                ans = anser - callodi
                Toast.makeText(this,"คุณได้รับแคลลอรี่มากเกินกว่าที่ร่างกายควรได้รับ : $ans แคลลอรี่", Toast.LENGTH_LONG).show()
            }else if (food1==1 && callodi > anser){
                ans =   callodi-anser
                Toast.makeText(this,"คุณได้รับแคลลอรี่น้อยกว่าที่ร่างกายควรได้รับ : $ans แคลลอรี่", Toast.LENGTH_LONG).show()
            }
        }
        foodblack.setOnClickListener {
            onBackPressed()
        }
        logout.setOnClickListener {
            auth!!.signOut()

            Toast.makeText(this,"LogOut Complete", Toast.LENGTH_LONG).show()

            val it = Intent(this,MainActivity::class.java)
            startActivity(it)
            finish()
        }
    }
}