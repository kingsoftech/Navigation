package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_enter_details.*
import androidx.core.os.bundleOf
import java.util.jar.Attributes


class EnterDetailsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView =  inflater.inflate(R.layout.fragment_enter_details, container, false)
        val etName = rootView.findViewById<EditText>(R.id.et_first_name)
        val etMobile = rootView.findViewById<EditText>(R.id.et_mobile)

        val btnVerifyDetails = rootView.findViewById<Button>(R.id.btn_verify_details)
        btnVerifyDetails.setOnClickListener(){
            val firstName = etName.text.toString()
            val mobile = etMobile.text.toString()
            when{
                mobile.isEmpty() ->{Toast.makeText(activity, "Enter Your Mobile Number.", Toast.LENGTH_SHORT).show()
                }
                    firstName.isEmpty() ->{Toast.makeText(activity, "Enter Name.", Toast.LENGTH_SHORT).show()
                }
                else->{

                    findNavController().navigate(EnterDetailsFragmentDirections.actionEnterDetailsFragmentToVerifyDetailsFragment(
                        firstName,
                        mobile.toLong()
                    ))
                }
            }

        }
        // Inflate the layout for this fragment
        return rootView
    }


}