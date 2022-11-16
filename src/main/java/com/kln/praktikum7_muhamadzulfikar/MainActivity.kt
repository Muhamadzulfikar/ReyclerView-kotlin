package com.kln.praktikum7_muhamadzulfikar

import Adapter.MahasiswaAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.kln.praktikum7_muhamadzulfikar.databinding.ActivityMainBinding
import model.mahasiswa

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    lateinit var mahasiswaAdapter: MahasiswaAdapter
    val lm = LinearLayoutManager(this)
    val addMahasiswaList : MutableList<mahasiswa> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    fun initView(){
        binding.rvData.layoutManager = lm
        mahasiswaAdapter = MahasiswaAdapter(this)
        binding.rvData.adapter = mahasiswaAdapter

        addMahasiswaList.add(
            mahasiswa(foto = R.drawable.jika, nim = "2021018", nama = "zulfikar", alamat = "Batam", prodi = "sistem Informasi")
        )

        addMahasiswaList.add(
            mahasiswa(foto = R.drawable.jika, nim = "2021018", nama = "zulfikar", alamat = "Batam", prodi = "sistem Informasi")
        )
        addMahasiswaList.add(
            mahasiswa(foto = R.drawable.jika, nim = "2021018", nama = "zulfikar", alamat = "Batam", prodi = "sistem Informasi")
        )

        mahasiswaAdapter.setListDataMahasiswa(addMahasiswaList)
    }
}