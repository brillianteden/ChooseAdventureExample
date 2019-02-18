package jenn.codes.chooseadventureexample


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.navOptions
import jenn.codes.chooseadventureexample.databinding.FragmentTitleBinding


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

        val options = navOptions {
            anim {
                exit = R.anim.fade_out

            }
        }

        val action = TitleFragmentDirections.endAction(mStoryIndex)

        mTopButtonArray = resources.getStringArray(R.array.mTopButtonArray)
        mBottomButtonArray = resources.getStringArray(R.array.mBottomButtonArray)
        mTxtTitleArray = resources.getStringArray(R.array.mTxtTitleArray)
        mTxtBodyArray = resources.getStringArray(R.array.mTxtBodyArray)

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
                    binding.txtBody.text = (mTxtBodyArray as Array<String>)[1]
                    mStoryIndex = 2
                }

                2 -> {
                    binding.txtTitle.text = (mTxtTitleArray as Array<String>)[3]
                    binding.imgTitle.setImageResource(R.drawable.lost)
                    binding.mBottomButton.text = (mBottomButtonArray as Array<String>)[3]
                    binding.mTopButton.text = (mTopButtonArray as Array<String>)[3]
                    binding.txtBody.text = (mTxtBodyArray as Array<String>)[3]
                    mStoryIndex = 3
                }

                3 -> {
                    binding.txtTitle.text = (mTxtTitleArray as Array<String>)[5]
                    binding.imgTitle.setImageResource(R.drawable.falls)
                    binding.mBottomButton.text = (mBottomButtonArray as Array<String>)[5]
                    binding.mTopButton.text = (mTopButtonArray as Array<String>)[5]
                    binding.txtBody.text = (mTxtBodyArray as Array<String>)[5]
                    mStoryIndex = 5
                }

                4 -> {
                    binding.txtTitle.text = (mTxtTitleArray as Array<String>)[7]
                    binding.imgTitle.setImageResource(R.drawable.hitchhike)
                    binding.mBottomButton.text = (mBottomButtonArray as Array<String>)[7]
                    binding.mTopButton.text = (mTopButtonArray as Array<String>)[7]
                    binding.txtBody.text = (mTxtBodyArray as Array<String>)[7]
                    mStoryIndex = 10
                }

                else -> {
                    it.findNavController().navigate(action)
                    it.findNavController().navigate(R.id.endAction, null, options)
                    Navigation.createNavigateOnClickListener(R.id.endAction, null)
                }
            }


        }

        binding.mBottomButton.setOnClickListener {

            when(mStoryIndex) {
                1 -> {
                    binding.txtTitle.text = (mTxtTitleArray as Array<String>)[2]
                    binding.imgTitle.setImageResource(R.drawable.road)
                    binding.mBottomButton.text = (mBottomButtonArray as Array<String>)[2]
                    binding.mTopButton.text = (mTopButtonArray as Array<String>)[2]
                    binding.txtBody.text = (mTxtBodyArray as Array<String>)[2]
                    mStoryIndex = 4
                }

                2 -> {
                    binding.txtTitle.text = (mTxtTitleArray as Array<String>)[4]
                    binding.imgTitle.setImageResource(R.drawable.cabin)
                    binding.mBottomButton.text = (mBottomButtonArray as Array<String>)[4]
                    binding.mTopButton.text = (mTopButtonArray as Array<String>)[4]
                    binding.txtBody.text = (mTxtBodyArray as Array<String>)[4]
                    mStoryIndex = 7
                }

                3 ->{
                    binding.txtTitle.text = (mTxtTitleArray as Array<String>)[6]
                    binding.imgTitle.setImageResource(R.drawable.night)
                    binding.mBottomButton.text = (mBottomButtonArray as Array<String>)[6]
                    binding.mTopButton.text = (mTopButtonArray as Array<String>)[6]
                    binding.txtBody.text = (mTxtBodyArray as Array<String>)[6]
                    mStoryIndex = 6
                }

                4 -> {
                    binding.txtTitle.text = (mTxtTitleArray as Array<String>)[8]
                    binding.imgTitle.setImageResource(R.drawable.hitchhike)
                    binding.mBottomButton.text = (mBottomButtonArray as Array<String>)[8]
                    binding.mTopButton.text = (mTopButtonArray as Array<String>)[8]
                    binding.txtBody.text = (mTxtBodyArray as Array<String>)[8]
                    mStoryIndex = 9
                }

                5 -> {
                    binding.txtTitle.text = (mTxtTitleArray as Array<String>)[9]
                    binding.imgTitle.setImageResource(R.drawable.grave)
                    binding.mBottomButton.text = (mBottomButtonArray as Array<String>)[9]
                    binding.mTopButton.visibility = View.GONE
                    binding.txtBody.text = (mTxtBodyArray as Array<String>)[9]
                    mStoryIndex = 11
                }

                else -> {
                    it.findNavController().navigate(action)
                    it.findNavController().navigate(R.id.endAction, null, options)
                    Navigation.createNavigateOnClickListener(R.id.endAction, null)
                }
            }
        }


        return binding.root

    }


}
