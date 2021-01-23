package com.example.work01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toast= Toast.makeText(applicationContext,"Please fill in all fields!",Toast.LENGTH_LONG)
        val toast_pass =Toast.makeText(applicationContext,"Passwords do not match!",Toast.LENGTH_LONG)
        val toast_up =Toast.makeText(applicationContext,"Please do not use the same username and password!",Toast.LENGTH_LONG)
        val toast_com=Toast.makeText(applicationContext,"Complete!!",Toast.LENGTH_LONG)
        val toast_Ok=Toast.makeText(applicationContext,"OK",Toast.LENGTH_LONG)

        button1.setOnClickListener(){
            if(this.plain1.text.toString()==""){
                toast.show()
            }else{
                if(this.plain1.text.toString()==this.Password1.text.toString()){
                    toast_up.show()
                }else{
                    if(this.Password1.text.toString()==""){
                        toast.show()
                    }else{
                        if(this.Password1.text.toString()!=this.Password2.text.toString()){
                            toast_pass.show()
                        }else{
                            if(this.Password1.text.toString()==this.Password2.text.toString()){
                                toast_Ok.show()
                            }
                        }
                    }
                }
            }
        }
        button2.setOnClickListener(){
            plain1.setText(null)
            Password1.setText(null)
            Password2.setText(null)
            toast_com.show()
        }

    }
}