package com.example.animalsrv

import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.animalsrv.adapters.CategoryAdapter
import com.example.animalsrv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /**
         * Сделать ссылку в тексте кликабельной
         */
        binding.info.movementMethod = LinkMovementMethod.getInstance()

        binding.rvCategory.layoutManager = LinearLayoutManager(this)
        binding.rvCategory.adapter = CategoryAdapter(getCategoryData())


    }

    private fun getFishData(): ArrayList<Int> =
        arrayListOf(R.drawable.fish1, R.drawable.fish2, R.drawable.fish3)

    private fun getBirdsData(): ArrayList<Int> =
        arrayListOf(R.drawable.birds1, R.drawable.birds2, R.drawable.birds3)

    private fun getInsectsData(): ArrayList<Int> =
        arrayListOf(R.drawable.insects1, R.drawable.insects2, R.drawable.insects3)

    private fun getDragonfliesData(): ArrayList<Int> =
        arrayListOf(R.drawable.dragonflies1, R.drawable.dragonflies2, R.drawable.dragonflies3)

    private fun getFrogsData(): ArrayList<Int> =
        arrayListOf(R.drawable.frogs1, R.drawable.frogs2, R.drawable.frogs3)

    private fun getReptilesData(): ArrayList<Int> =
        arrayListOf(R.drawable.reptiles1, R.drawable.reptiles2, R.drawable.reptiles3)


    private fun getCategoryData(): ArrayList<Category> = arrayListOf(
        Category(getString(R.string.fish), getFishData()),
        Category(getString(R.string.birds), getBirdsData()),
        Category(getString(R.string.insects), getInsectsData()),
        Category(getString(R.string.dragonflies), getDragonfliesData()),
        Category(getString(R.string.frogs), getFrogsData()),
        Category(getString(R.string.reptiles), getReptilesData())
    )
}