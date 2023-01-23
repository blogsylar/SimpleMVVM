package ru.macdroid.simplemvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val simpleString = MutableLiveData<MainModel>()


    init {
        println("happy MainViewModel")
    }

    fun setData(string: String) {
        simpleString.value = MainModel(string)
    }

    fun getData() : LiveData<MainModel> {
        return simpleString
    }
}