package com.example.mylist

import com.google.firebase.database.DatabaseReference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_addd.*


class AddActivity : AppCompatActivity() {
    lateinit var ref : DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addd)


        ref = FirebaseDatabase.getInstance().getReference("NOTE")
        button_Save.setOnClickListener {
            savedata()

//      manggil id buttonnya, jadi kalau button_save diketik dia akan save data
        }
    }
    private fun savedata() {


        val title = edit_title.text.toString()
        val description = edit_note.text.toString()

        val notes = Note(title,description)
        val notesId = ref.push().key.toString()

        ref.child(notesId).setValue(notes).addOnCompleteListener {
            Toast.makeText(this, "Successs",Toast.LENGTH_SHORT).show()
            edit_title.setText("")
            edit_note.setText("")
        }
    }

}

