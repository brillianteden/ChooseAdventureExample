package jenn.codes.chooseyourownadventure

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.navOptions
import jenn.codes.chooseadventureexample.R
import jenn.codes.chooseadventureexample.databinding.FragmentEndBinding


class EndFragment : Fragment() {


    private var mTxtEndTitleArray: Array<String>? = null
    private var mTxtEndBodyArray: Array<String>? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: FragmentEndBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_end, container, false)

        val args: EndFragmentArgs.fromBundle(mStoryIndex)

        val options = navOptions {
            anim {
                exit = R.anim.fade_out

            }
        }

        var mStoryIndex = args.mStoryIndex

        mTxtEndTitleArray = resources.getStringArray(R.array.mTxtEndTitleArray)
        mTxtEndBodyArray = resources.getStringArray(R.array.mTxtEndBodyArray)

        when (mStoryIndex) {
            1 -> {
                binding.txtEndTitle.text = (mTxtEndTitleArray as Array<String>)[1]
                binding.imgEnd.setImageResource(R.drawable.grave)
                binding.txtEndBody.text = (mTxtEndBodyArray as Array<String>)[1]
                mStoryIndex = 1
            }

            2 -> {
                binding.txtEndTitle.text = (mTxtEndTitleArray as Array<String>)[1]
                binding.imgEnd.setImageResource(R.drawable.grave)
                binding.txtEndBody.text = (mTxtEndBodyArray as Array<String>)[1]
                mStoryIndex = 1
            }

            3 -> {
                binding.txtEndTitle.text = (mTxtEndTitleArray as Array<String>)[1]
                binding.imgEnd.setImageResource(R.drawable.grave)
                binding.txtEndBody.text = (mTxtEndBodyArray as Array<String>)[1]
                mStoryIndex = 1
            }

            4 -> {
                binding.txtEndTitle.text = (mTxtEndTitleArray as Array<String>)[1]
                binding.imgEnd.setImageResource(R.drawable.grave)
                binding.txtEndBody.text = (mTxtEndBodyArray as Array<String>)[1]
                mStoryIndex = 1
            }
        }

        binding.mPlayAgainButton.setOnClickListener {


            it.findNavController().navigate(R.id.restartAction, null, options)
            Navigation.createNavigateOnClickListener(R.id.restartAction, null)

        }

        return binding.root
    }
}