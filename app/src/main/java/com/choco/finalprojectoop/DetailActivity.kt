package com.choco.finalprojectoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.choco.finalprojectoop.realm.UserChocoAdapter
import io.realm.Realm

class DetailActivity : AppCompatActivity() {
    lateinit var userChocoAdapter: UserChocoAdapter//
    var ln = LinearLayoutManager(this)


    lateinit var realm: Realm
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }
}