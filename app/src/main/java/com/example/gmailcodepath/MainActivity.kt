package com.example.gmailcodepath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.gmailcodepath.EmailFetcher.Companion.getEmails

class MainActivity : AppCompatActivity() {
    lateinit var emails:List<Email>;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var recycler = findViewById<RecyclerView>(R.id.emailsRv);
        emails=getEmails()
        var adapter = EmailAdapter(emails);
        recycler.adapter=adapter;
        recycler.layoutManager = LinearLayoutManager(this)
    }
}