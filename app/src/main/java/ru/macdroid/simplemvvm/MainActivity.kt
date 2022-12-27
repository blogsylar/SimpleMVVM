package ru.macdroid.simplemvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.activity.viewModels
import ru.macdroid.simplemvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val model: MainViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initUI()
        observer()

    }

    private fun initUI() {
        binding.etInput.addTextChangedListener(object : TextWatcher {

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

                model.setData(s.toString()) // set data into viewModel

            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun afterTextChanged(s: Editable) {}
        })
    }

    private fun observer() {

        model.getData().observe(this) {
            binding.tvInfo.text = it.text // get data from viewModel
        }


    }
}