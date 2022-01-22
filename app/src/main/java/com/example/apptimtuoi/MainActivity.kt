package com.example.apptimtuoi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button2)
        button.setOnClickListener{ Xly() }
    }
    private fun Xly(){
        val editText: EditText = findViewById(R.id.editTextDate3)
//        val namSinh = Integer.parseInt(editText.text.toString())
        val namSinh = editText.text.toString().toInt()
        val namHienTai : Int = Calendar.getInstance().get(Calendar.YEAR)
        val tuoi = namHienTai - namSinh

        val text1: TextView = findViewById(R.id.textView3)
        text1.text = "Tuổi của bạn là: $tuoi "
//        if (namSinh == null){
//            Toast.makeText(this, "Bạn chưa nhập năm sinh!", Toast.LENGTH_SHORT).show()
//        }else
//        text1.text = "$namSinh"



    }
}