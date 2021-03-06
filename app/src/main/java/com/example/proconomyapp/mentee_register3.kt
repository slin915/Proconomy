package com.example.proconomyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class mentee_register3 : AppCompatActivity() , AdapterView.OnItemClickListener {
    private var listView:ListView ? = null
    private var arrayAdapter:ArrayAdapter<String> ? = null
    private var itemList = arrayOf(
        "College graduate (Bachelor's)", "College graduate (Master's)", "College student",
        "Employee", "Self-employed", "In between jobs"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentee_register3)

        listView = findViewById(R.id.choiceList)
        arrayAdapter = ArrayAdapter(applicationContext,
            android.R.layout.simple_list_item_single_choice, itemList)
        listView?.adapter = arrayAdapter
        listView?.choiceMode = ListView.CHOICE_MODE_SINGLE
        listView?.onItemClickListener = this
    }

    fun backClick(view: View){
        val myIntent = Intent(this, mentee_register2::class.java)
        startActivity(myIntent)
    }

    fun menteeRegister_4(view: View) {
        val reg = Intent(this, mentee_register4::class.java)
        startActivity(reg)
    }

    override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        var items:String = p0?.getItemAtPosition(p2) as String
        Toast.makeText(applicationContext, "$items", Toast.LENGTH_LONG).show()
    }

}