package com.example.utspraktik_if11k_10118904_firmanalfinas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.form.*
import kotlinx.android.synthetic.main.isi.*

class Form : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.form)
        btnNext.setOnClickListener() {
            intent = Intent(this, Isi::class.java);
            startActivity(intent)
        }
    }
}