package br.com.erickramonfcastro.listsandprojects

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.erickramonfcastro.listsandprojects.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            btSharedList.setOnClickListener {
                Toast.makeText(applicationContext, "Coming soon", Toast.LENGTH_LONG).show()
            }
            btAddFolder.setOnClickListener {
                Toast.makeText(applicationContext, "Coming soon", Toast.LENGTH_LONG).show()
                //botões que mudam de Activity
                //O jão, adiciona ai a parte das rotinas na moral
            }
            btMenuProjects.setOnClickListener {
                val intent = Intent(this@MainActivity, Projects::class.java)
                startActivity(intent)
            }
            btMenuRoutine.setOnClickListener {
                Toast.makeText(applicationContext, "Ta funfando", Toast.LENGTH_SHORT).show()
                val intent = Intent(applicationContext, Projects::class.java)
                startActivity(intent)
            }
        }
    }
}
