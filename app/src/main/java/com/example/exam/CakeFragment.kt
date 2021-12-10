package com.example.exam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView


class CakeFragment : Fragment() {

    lateinit var cakeImageView: ImageView
    lateinit var cakeButton: Button

    private val cakeImageList:List<Int> = listOf(

        R.drawable.cake1,
        R.drawable.cake2,
        R.drawable.cake3,
        R.drawable.cake4,




        )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

      val view= inflater.inflate(R.layout.fragment_cake, container, false)


        cakeImageView=view.findViewById(R.id.cake_image_view)
        cakeButton=view.findViewById(R.id.cake_button)

        cakeButton.setOnClickListener{

            cakeImageView.setImageResource(cakeImageList.random())
        }


        return view
    }

}