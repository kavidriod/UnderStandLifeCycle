package com.ninja.understandlifecycle

import android.util.Log

class OwnLoger {

    companion object{
        private const val TAG = "OwnLoger"
    }

    fun logCreate(){
        Log.d(TAG, "logCreate: ")
    }

    fun logStart(){
        Log.d(TAG, "logStart: ")
    }

    fun logResume(){
        Log.d(TAG, "logResume: ")
    }

    fun logPause(){
        Log.d(TAG, "logPause: ")
    }

    fun logStop(){
        Log.d(TAG, "logStop: ")
    }

    fun logDestroy(){
        Log.d(TAG, "logDestroy: ")
    }
}