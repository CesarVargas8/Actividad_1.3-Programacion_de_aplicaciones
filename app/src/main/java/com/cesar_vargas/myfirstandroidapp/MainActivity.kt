package com.cesar_vargas.myfirstandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.getName)
        val age = findViewById<EditText>(R.id.getAge)
        val luckyNum = findViewById<TextView>(R.id.giveData)
        val buttonData = findViewById<Button>(R.id.getData)
        buttonData.setOnClickListener(){
            if (name.text.isEmpty() or age.text.isEmpty()){
                Toast.makeText(this,"Enter all the data", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            var luck:Int = age.text.toString().toInt()
            if (luck < 10){
                luck *= 7;
            }
            if (luck > 9){
                while (luck > 9){
                    luck = luck.toString().substring(0,1).toInt() + luck.toString().substring(1).toInt()
                }
            }
            luckyNum.text = "Welcome " + name.text + ", his lucky number is " + luck;

        }
    }
}