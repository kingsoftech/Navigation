package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs

class VerifyDetailsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        //val name = arguments?.getString("name")
        //val mobile = arguments?.getLong("mobile")
        val args :VerifyDetailsFragmentArgs by navArgs()
        val name = args.name
        val mobile = args.mobile
        val rootView = inflater.inflate(R.layout.fragment_verify_details, container, false)
        var nameEditText = rootView.findViewById<TextView>(R.id.tv_name)
        var mobileTextView = rootView.findViewById<TextView>(R.id.tv_mobile_number)
        nameEditText.text = name
        mobileTextView.text = mobile.toString()
        return rootView
    }

}