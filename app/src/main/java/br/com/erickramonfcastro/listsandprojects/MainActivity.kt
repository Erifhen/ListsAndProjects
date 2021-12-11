package br.com.erickramonfcastro.listsandprojects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //botões que ainda não fazem nada
      val sharedList = findViewById<Button>(R.id.btSharedList)
        sharedList.setOnClickListener {
            Toast.makeText(applicationContext, "Coming soon", Toast.LENGTH_LONG).show()
        }
        findViewById<Button>(R.id.btAddFolder).setOnClickListener {
            Toast.makeText(applicationContext, "Coming soon", Toast.LENGTH_LONG).show()
            //botões que mudam de Activity
            findViewById<Button>(R.id.btMenuProjects).setOnClickListener {
                val intent = Intent(this, Projects::class.java)
                startActivity(intent)
            }
            //O jão, adiciona ai a parte das rotinas na moral
        }
    }
}