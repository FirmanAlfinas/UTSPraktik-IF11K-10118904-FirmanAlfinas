package com.example.utspraktik_if11k_10118904_firmanalfinas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.form.*
import kotlinx.android.synthetic.main.isi.*

class Isi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.isi)
        btnSimpan.setOnClickListener() {
            intent = Intent(this, Berhasil::class.java);
            startActivity(intent)
        }
        btnkembali.setOnClickListener() {
            intent = Intent(this, Form::class.java);
            startActivity(intent)
        }
    }
}