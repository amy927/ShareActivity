package edu.temple.funwithintents

import android.content.Intent
import android.content.Intent.ACTION_SEND
import android.net.Uri
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // This view contains the text to share
        val editText = findViewById<EditText>(R.id.editTextText)
        val intent = Intent(this, MainActivity::class.java)

        // When the user clicks this button, share the text if not empty
        findViewById<ImageButton>(R.id.shareImageButton).setOnClickListener {
            val text = Uri.parse(editText.toString())
            startActivity(intent.putExtra(ACTION_SEND, text))
        }
    }
}