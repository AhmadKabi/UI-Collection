package com.kodingan.instagramclone.account

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kodingan.instagramclone.databinding.FragmentAccountPostBinding

class PostAccountFragment : Fragment() {

    lateinit var binding: FragmentAccountPostBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAccountPostBinding.inflate(layoutInflater)
        return binding.root
    }

    companion object {

        fun newInstance(): PostAccountFragment {
            return PostAccountFragment()
        }

    }

}