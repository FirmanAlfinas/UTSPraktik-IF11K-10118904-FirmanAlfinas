package com.example.utspraktik_if11k_10118904_firmanalfinas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.berhasil_simpan.*

class Berhasil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.berhasil_simpan)
        btnOk.setOnClickListener(){
            intent = Intent(this, Form::class.java);
            startActivity(intent)
            finish()
        }
    }
}