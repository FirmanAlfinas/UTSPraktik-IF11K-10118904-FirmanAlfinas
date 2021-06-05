package com.example.utspraktik_if11k_10118904_firmanalfinas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.form.*
import kotlinx.android.synthetic.main.isi.*

class Form : AppCompatActivity() {
    private var nik = ""
    private var nama = ""
    private var tgl = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.form)
        btnNext.setOnClickListener() {
            nik = textNik.text.toString()
            nama = textNama.text.toString()
            tgl = textTglLahir.text.toString()
            intent = Intent(this, Isi::class.java);
            intent.putExtra("data", arrayOf(nik, nama, tgl))
            startActivity(intent)
        }
    }
}