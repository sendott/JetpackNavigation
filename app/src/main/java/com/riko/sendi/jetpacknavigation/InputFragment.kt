package com.riko.sendi.jetpacknavigation

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_input.*
import kotlinx.android.synthetic.main.fragment_utama.*


class InputFragment : Fragment(){

    lateinit var nav : navController

    override fun onCreateView(
    inflater: LayoutInflater, container:ViewGroup?,
    savedInstancasState: Bundle?
    ): View?{
        return infalter.inflate(R.layout.fragment_utama, container, attachToRoot:false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nav = navigation.findNavController(view)

        buttonSubmit.setOnClickListener{it::View!
            if (editInput.text.toString().isNotEmpty()){
                val input:String = editInput.text.toString()
                val bundle = Bundle()
                Bundle.putString("args", input)
            }
            nav.navigate(R.id.action_inputFragment_to_hasilFragment2)
        }
    }
}