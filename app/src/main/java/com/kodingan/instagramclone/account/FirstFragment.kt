package com.kodingan.instagramclone.account

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kodingan.instagramclone.databinding.FragmentPostBinding

/**
 * A placeholder fragment containing a simple view.
 */
class FirstFragment : Fragment() {

    lateinit var binding: FragmentPostBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPostBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {

        }
    }

    companion object {
        private const val ARG_FRAGMENT_TYPE = "fragment_type"

        @JvmStatic
        fun newInstance(): FirstFragment {
            return FirstFragment()
                .apply {
                    arguments = Bundle().apply {
                        //                    putInt(ARG_FRAGMENT_TYPE, type)
                    }
                }
        }
    }

}
