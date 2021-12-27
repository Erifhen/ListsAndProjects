package br.com.erickramonfcastro.listsandprojects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import br.com.erickramonfcastro.listsandprojects.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        //botões que ainda não fazem nada
        binding.btSharedList.setOnClickListener {
            Toast.makeText(applicationContext, "Coming soon", Toast.LENGTH_LONG).show()
        }
        binding.btAddFolder.setOnClickListener {
            Toast.makeText(applicationContext, "Coming soon", Toast.LENGTH_LONG).show()
            //botões que mudam de Activity
            findViewById<Button>(R.id.btMenuProjects).setOnClickListener {
                val intent = Intent(this, Projects::class.java)
                startActivity(intent)
            }
        }
    }
}