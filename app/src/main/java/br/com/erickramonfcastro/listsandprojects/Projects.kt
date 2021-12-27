package br.com.erickramonfcastro.listsandprojects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.erickramonfcastro.listsandprojects.databinding.ActivityMainBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Projects : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projects)

        findViewById<FloatingActionButton>(R.id.btAddProject).setOnClickListener {
            val intent = Intent(this, AddProjectActivity::class.java)
            startActivity(intent)
        }
    }
}