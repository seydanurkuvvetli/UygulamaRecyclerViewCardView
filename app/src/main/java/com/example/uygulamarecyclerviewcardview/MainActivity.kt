package com.example.uygulamarecyclerviewcardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.uygulamarecyclerviewcardview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var filmlerArrayList:ArrayList<Filmler>
private  lateinit var binding: ActivityMainBinding
    private lateinit var adapter: FilmlerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
val f1=Filmler(1,"7.Koğuştaki Mucize","film1",12.99)
        val f2=Filmler(2,"Çakallarla Dans 6","film2",16.99)
        val f3=Filmler(3,"Kutsal Damacana 4","film3",12.99)
        val f4=Filmler(4,"Fındıkkıran","film4",12.99)
        val f5=Filmler(5,"Kayıp Şehir","film5",12.99)
        filmlerArrayList=ArrayList<Filmler>()
        filmlerArrayList.add(f1)
        filmlerArrayList.add(f2)
        filmlerArrayList.add(f3)
        filmlerArrayList.add(f4)
        filmlerArrayList.add(f5)
        adapter=FilmlerAdapter(this,filmlerArrayList)
        binding.rv.adapter=adapter


    }
}