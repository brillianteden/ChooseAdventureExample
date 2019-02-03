package jenn.codes.chooseyourownadventure

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import jenn.codes.chooseadventureexample.R
import jenn.codes.chooseadventureexample.databinding.FragmentWithFriendsBinding


class WithFriends : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: FragmentWithFriendsBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_with_friends, container, false)


        return binding.root
    }
}
