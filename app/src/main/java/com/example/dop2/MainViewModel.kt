package com.example.dop2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainViewModel : ViewModel() {

    private var list: MutableLiveData<Int> = MutableLiveData()

    fun getRandomNumber(): MutableLiveData<Int> {
        val random = Random.nextInt(1000)
        list.value = random
        return list
    }
}