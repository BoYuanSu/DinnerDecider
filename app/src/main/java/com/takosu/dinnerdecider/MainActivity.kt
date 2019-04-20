package com.takosu.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("MOS", "McDonalds", "爵克貓", "丼之家", "小屋", "飽飽", "銀魚", "餃子呦", "阮家", "米香", "民欣", "肉麻麵","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        txtSelectFood.text = "Burger King"

        btnDecide.setOnClickListener {
            println("You clicked me!")
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            txtSelectFood.text = foodList[randomFood]
        }
        btnAddFood.setOnClickListener {
            val newFood = txtAddFood.text.toString()
            if (newFood != "") {
                foodList.add(newFood)
                txtAddFood.text.clear()
            }
        }
    }
}
