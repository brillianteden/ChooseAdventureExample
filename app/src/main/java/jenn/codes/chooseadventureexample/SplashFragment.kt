package jenn.codes.chooseadventureexample


import android.databinding.DataBindingUtil
import android.os.Build
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat
import android.support.v7.app.AppCompatActivity
import android.view.*
import androidx.navigation.findNavController
import jenn.codes.chooseadventureexample.databinding.FragmentSplashBinding
import android.view.LayoutInflater




class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //Create the data binding object
        val binding: FragmentSplashBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_splash, container, false)



        binding.mStartButton.setOnClickListener {
            it.findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToTitleFragment())
        }


        return binding.root
    }


}
