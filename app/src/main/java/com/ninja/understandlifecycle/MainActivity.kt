package com.ninja.understandlifecycle

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.Observer
import com.ninja.understandlifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        //Implement LifecycleObserver interface and use the OnLifecycleEvent Annotation
        val lifeCycleObserver = OwnLifeCycleObserver(lifecycle , OwnLoger())
        lifecycle.addObserver(lifeCycleObserver)

        //In Java 8,an Observer class can implement the DefaultLifecycleObserver
        val defaultLifeCycleObserver = OwnLifeCycleObserverJava8
        lifecycle.addObserver(OwnLifeCycleObserverJava8())

        binding.launchGoogle.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.google.com/"))
            startActivity(intent)
        }
        setContentView(view)
    }
}