package com.kodingan.instagramclone.account

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kodingan.instagramclone.databinding.FragmentAccountBinding

class AccountFragment : Fragment() {

    lateinit var binding: FragmentAccountBinding
    private lateinit var template6PagerAdapter: Template6PagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAccountBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buildViewPager()

    }

    private fun buildViewPager() {
        template6PagerAdapter = Template6PagerAdapter(childFragmentManager)
        binding.viewPager.adapter = template6PagerAdapter
        binding.viewPager.offscreenPageLimit = 2
        binding.tabLayout.setupWithViewPager(binding.viewPager)

    }


    companion object {

        fun newInstance(): AccountFragment {
            return AccountFragment()
        }

    }

}