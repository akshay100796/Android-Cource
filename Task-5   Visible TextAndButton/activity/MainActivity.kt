package com.example.task5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    private var btn_gm : Button? = null
    private var btn_ga : Button? = null
    private var btn_ge : Button? = null
    private var btn_gn : Button? = null

    private var txt_greeting : TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_gm = findViewById(R.id.id_btn_gm)
        btn_ga = findViewById(R.id.id_btn_ga)
        btn_ge = findViewById(R.id.id_btn_ge)
        btn_gn = findViewById(R.id.id_btn_gn)

        txt_greeting = findViewById(R.id.id_text)

        btn_gm?.setOnClickListener {
            txt_greeting?.text = btn_gm?.text.toString()
            txt_greeting?.visibility = View.VISIBLE
            if(btn_ga?.visibility != View.VISIBLE){
                btn_ga?.visibility =View.VISIBLE
            }

        }

        btn_ga?.setOnClickListener {
            txt_greeting?.text = btn_ga?.text.toString()
            txt_greeting?.visibility = View.VISIBLE
            if(btn_ge?.visibility != View.VISIBLE){
                btn_ge?.visibility =View.VISIBLE
            }
        }
        btn_ge?.setOnClickListener {
            txt_greeting?.text = btn_ge?.text.toString()
            txt_greeting?.visibility = View.VISIBLE
            if(btn_gn?.visibility != View.VISIBLE){
                btn_gn?.visibility =View.VISIBLE
            }
        }
        btn_gn?.setOnClickListener {
            txt_greeting?.text = btn_gn?.text.toString()
            txt_greeting?.visibility = View.VISIBLE


        }







    }
}