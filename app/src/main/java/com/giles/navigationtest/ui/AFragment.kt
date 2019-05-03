package com.giles.navigationtest.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.giles.navigationtest.databinding.AFragmentBinding

class AFragment : Fragment(){
    private lateinit  var mBinding: AFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mBinding = AFragmentBinding.inflate(inflater, container, false)

        mBinding.btnToB.setOnClickListener {
            //pass argument
            val direction = AFragmentDirections.showB().setUsername("Hello World")
            findNavController().navigate(direction)
        }

        return mBinding.root
    }
}