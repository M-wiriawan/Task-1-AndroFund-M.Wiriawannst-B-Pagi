package com.example.tugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var tv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.textView2)

        binding.fragment1Btn.setOnClicklistener { it:View!

        val username = intent.getParcelableExtra<User>("User")?.username
        val password = intent.getParcelableExtra<User>("User")?.password
        tv.text = "Username: $username dan password: $password"

        val btnImplicit: Button = findViewById(R.id.btn_implicit)
        btnImplicit.setOnClickListener(this)
    }

    override fun onClick(Z: View) {
        when (Z.id){
//            R.id.btn_implicit -> {
//                val massage = "Hallo"
//                val intent = Intent()
//                intent.action = Intent.ACTION_SEND
//                intent.putExtra(Intent.EXTRA_TEXT, massage)
//                intent.type = "text/plain"
//                startActivity(intent)
            val intent = Intent()
            intent.putExtra("history","Anda sudah Login")
            set
            }
        }
    }
}