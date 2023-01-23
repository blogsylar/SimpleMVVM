package ru.macdroid.simplemvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SecondViewModel() : ViewModel() {

    private val _simpleString = MutableLiveData<MainModel>()
    val simpleString: LiveData<MainModel> get() = _simpleString


    init {
        println("happy SecondViewModel $abc")
    }

    companion object {
        const val abc = ""
    }

}