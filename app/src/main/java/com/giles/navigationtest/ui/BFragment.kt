package com.giles.navigationtest.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.giles.navigationtest.R
import com.giles.navigationtest.databinding.BFragmentBinding

class BFragment : Fragment(){
    private lateinit  var mBinding: BFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mBinding = BFragmentBinding.inflate(inflater, container, false)

        mBinding.btnToC.setOnClickListener {
//            Navigation.findNavController(it).navigate(R.id.showC)
            findNavController().navigate(R.id.showC)
        }

        return mBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        val params = BFragmentArgs.fromBundle(arguments!!)
        val text = BFragmentArgs.fromBundle(arguments!!).username

        Log.d("Test", "text = $text")
    }
}