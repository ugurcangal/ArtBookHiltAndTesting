package com.ugurcangal.artbookhiltandtesting.view

import android.os.Bundle
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.RequestManager
import com.ugurcangal.artbookhiltandtesting.R
import com.ugurcangal.artbookhiltandtesting.databinding.FragmentArtDetailsBinding
import javax.inject.Inject

class ArtDetailsFragment @Inject constructor(val glide: RequestManager) : Fragment(R.layout.fragment_art_details) {

    private var fragmentBinding : FragmentArtDetailsBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentArtDetailsBinding.bind(view)
        fragmentBinding = binding

        binding.artImageView.setOnClickListener {
            findNavController().navigate(ArtDetailsFragmentDirections.actionArtDetailsFragmentToImageApiFragment())
        }

        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                findNavController().popBackStack()
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(callback)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        fragmentBinding = null
    }

}