package jenn.codes.chooseyourownadventure

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import jenn.codes.chooseadventureexample.R
import jenn.codes.chooseadventureexample.databinding.FragmentWalkBinding


class Walk : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        val binding: FragmentWalkBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_walk, container, false)

        //The button handlers

        //Walk alone
        binding.btnWalkAlone.setOnClickListener {
            it.findNavController().navigate(WalkDirections.actionWalkToAlone())
        }

        //Walk with friends
        binding.btnWalkWithFriends.setOnClickListener {
            it.findNavController().navigate(WalkDirections.actionWalkToWithFriends())
        }

        return binding.root
    }

}
