package com.akirachix.enwallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvEpenses.layoutManager = LinearLayoutManager(this)
        displayContacts()
    }

    fun displayContacts() {
        val expense1 = Expenses("Divedends",24000,"4th July 2024")
        val expense2 = Expenses("Divedends",24000,"4th July 2024")
        val expense3 = Expenses("Divedends",24000,"4th July 2024")
        val expense4 = Expenses("Divedends",24000,"4th July 2024")
        val expense5 = Expenses("Divedends",24000,"4th July 2024")
        val expense6 = Expenses("Divedends",24000,"4th July 2024")
        val expense7 = Expenses("Divedends",24000,"4th July 2024")
        val expense8 = Expenses("Divedends",24000,"4th July 2024")
        val expense9 = Expenses("Divedends",24000,"4th July 2024")
        val expense10 = Expenses("Divedends",24000,"4th July 2024")



        val contactsList =
            listOf(expense1,expense2,expense3,expense4,expense5,expense6,expense7,expense8,expense9,expense10)
        val expenceAdapter = ExpensesAdapter(contactsList)
        binding.rvEpenses.adapter = expenceAdapter
    }
}