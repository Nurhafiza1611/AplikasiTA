package com.aplikasita
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<DataClass>
    lateinit var imageList: Array<Int>
    lateinit var titleList: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        imageList = arrayOf(
            R.drawable.buku1,
            R.drawable.buku2,
            R.drawable.buku3,
            R.drawable.buku4,
            R.drawable.buku5,
            R.drawable.buku6,
            R.drawable.buku7,
            R.drawable.buku8,
            R.drawable.buku9,
            R.drawable.buku10,
            R.drawable.buku11,
            R.drawable.buku12
        )

        titleList = arrayOf(
            "TOEFL Target 600",
            "TOEFL TOP MODUL",
            "TOEFL BEST Preparation",
            "TOEFL Target 600+",
            "TOEFL TOP Preparation",
            "TOEFL Structure",
            "TOEFL TOP Strategy",
            "TOEFL iBT",
            "TOEFL ITP super Tricks",
            "TOEFL Strategy ITP",
            "TOEFL ITP untuk Pemula",
            "TOEFL Teruji"
        )

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        dataList = arrayListOf<DataClass>()
        getData()
    }

    private fun getData() {
        for (i in imageList.indices) {
            val dataClass = DataClass(imageList[i], titleList[i])
            dataList.add(dataClass)

        }
        recyclerView.adapter = AdapterClass(dataList)
    }
}

//        AdapterClass.onItemClick = {
//            val intent = Intent( this,detailActivity::class.java)
//            intent.putExtra("book", it)
//        }
//    }
