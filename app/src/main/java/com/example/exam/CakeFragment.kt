package com.example.exam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView


private const val LAST_CHOOSE_IMAGE="image"

class CakeFragment : Fragment() {

    lateinit var cakeImageView: ImageView
    lateinit var cakeButton: Button

    private val cakeImageList:List<Int> = listOf(

        R.drawable.cake1,
        R.drawable.cake2,
        R.drawable.cake3,
        R.drawable.cake4,




        )
    var lastChooseImageRes=0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

      val view= inflater.inflate(R.layout.fragment_cake, container, false)


        cakeImageView=view.findViewById(R.id.cake_image_view)
        cakeButton=view.findViewById(R.id.cake_button)


        if(savedInstanceState != null)
            cakeImageView.setImageResource(lastChooseImageRes)


        cakeButton.setOnClickListener{

            lastChooseImageRes=cakeImageList.random()

            cakeImageView.setImageResource(lastChooseImageRes)
        }



        return view
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(LAST_CHOOSE_IMAGE,lastChooseImageRes)
    }
}