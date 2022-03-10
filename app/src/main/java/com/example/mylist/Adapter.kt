////package com.example.mylist
////
////import android.widget.ArrayAdapter
////import android.widget.TextView
////import com.google.firebase.database.core.Context
////
////class Adapter(val mCtx: Context, val layoutResId: Int, val list: List<Users> )
////    : ArrayAdapter<Note>(mCtx,layoutResId,list){
////
////    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
////        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)
////        val view: View = layoutInflater.inflate(layoutResId,null)
////
////        val textTitle = view.findViewById<TextView>(R.id.text_title)
////        val textNote = view.findViewById<TextView>(R.id. text_note)
////
////        val user = list[position]
////
////        textTitle.text = notes.title
////        textNote.text = notes.note
////
////        return view
//
//    }
//}