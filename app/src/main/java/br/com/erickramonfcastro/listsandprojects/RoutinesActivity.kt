package br.com.erickramonfcastro.listsandprojects

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.erickramonfcastro.listsandprojects.databinding.ActivityRoutinesBinding

class RoutinesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRoutinesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRoutinesBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_routines)
    }
}