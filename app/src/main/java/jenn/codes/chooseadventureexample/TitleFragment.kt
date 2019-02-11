package jenn.codes.chooseadventureexample


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import jenn.codes.chooseadventureexample.databinding.FragmentTitleBinding
import kotlinx.android.synthetic.main.fragment_alone.*


class TitleFragment : Fragment() {

    private var mStoryIndex = 1
    private var mTopButtonArray: Array<String>? = null
    private var mBottomButtonArray: Array<String>? = null
    private var mTxtTitleArray: Array<String>? = null
    private var mTxtBodyArray: Array<String>? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        //Create the data binding object
        val binding: FragmentTitleBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_title, container, false)

        mTopButtonArray = resources.getStringArray(R.array.mTopButtonArray)
        mBottomButtonArray = resources.getStringArray(R.array.mBottomButtonArray)
        mTxtTitleArray = resources.getStringArray(R.array.mTxtTitleArray)

        //Added a listener for the walk button
        //This only works if there is a link on the Navigation Component
        //With the appropriate name between the Fragments
        binding.mTopButton.setOnClickListener {
            when (mStoryIndex) {
                1 -> {
                    binding.txtTitle.text = (mTxtTitleArray as Array<String>)[1]
                    binding.imgTitle.setImageResource(R.drawable.path)
                    binding.mBottomButton.text = (mBottomButtonArray as Array<String>)[1]
                    binding.mTopButton.text = (mTopButtonArray as Array<String>)[1]
                }

                2 -> {
                        binding.txtTitle.text = "pressed again"
                }
                3 ->
                    binding.txtTitle.text = "3rd time"
                else ->
                    it.findNavController().navigate(TitleFragmentDirections.actionTitleFragmentToAlone())
            }
            mStoryIndex++


        }

        binding.mBottomButton.setOnClickListener {

            when(mStoryIndex) {
                1 -> {
                    binding.txtTitle.text = (mTxtTitleArray as Array<String>)[2]
                    binding.imgTitle.setImageResource(R.drawable.path)
                    binding.mBottomButton.text = (mBottomButtonArray as Array<String>)[2]
                    binding.mTopButton.text = (mTopButtonArray as Array<String>)[2]
                }
                2 ->
                    binding.txtTitle.text = "pressed again"
                else ->
                    it.findNavController().navigate(TitleFragmentDirections.actionTitleFragmentToAlone())
            }
            mStoryIndex++
        }


        return binding.root

    }


}
