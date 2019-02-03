package jenn.codes.chooseadventureexample


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import jenn.codes.chooseadventureexample.databinding.FragmentTitleBinding


class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        //Create the data binding object
        val binding: FragmentTitleBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_title, container, false)

        //Added a listener for the walk button
        //This only works if there is a link on the Navigation Component
        //With the appropriate name between the Fragments
        binding.btnWalk.setOnClickListener {
            it.findNavController().navigate(TitleFragmentDirections.actionTitleFragmentToWalk())
        }

        return binding.root

    }


}
