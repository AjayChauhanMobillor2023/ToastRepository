package com.example.toasterslibrary

import android.content.Context
import android.widget.Toast

object Toast {

        fun Toast(context : Context,msg: String){
               Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
        }
}