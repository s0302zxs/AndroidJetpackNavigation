package com.giles.navigationtest.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.giles.navigationtest.databinding.CFragmentBinding

class CFragment : Fragment(){
    private lateinit  var mBinding: com.giles.navigationtest.databinding.CFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mBinding = CFragmentBinding.inflate(inflater, container, false)

        mBinding.btnPopToA.setOnClickListener {
            //clear stack
            findNavController().navigate(CFragmentDirections.popToA())
//            Navigation.findNavController(it).navigate(CFragmentDirections.popToA())
        }

        mBinding.btnBack.setOnClickListener {
            //back
            findNavController().navigateUp()
//            Navigation.findNavController(it).navigateUp()
        }


        return mBinding.root
    }
}