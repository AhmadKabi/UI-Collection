package com.kodingan.instagramclone.account

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kodingan.instagramclone.R
import com.kodingan.instagramclone.databinding.FragmentAccountBinding

class AccountFragment : Fragment() {

    lateinit var binding: FragmentAccountBinding
    private lateinit var accountPagerAdapter: AccountPagerAdapter

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
        accountPagerAdapter = AccountPagerAdapter(childFragmentManager)
        binding.viewPager.adapter = accountPagerAdapter
        binding.viewPager.offscreenPageLimit = 2

        binding.tabLayout.setupWithViewPager(binding.viewPager)
        binding.tabLayout.getTabAt(0)?.setIcon(R.drawable.ic_grid)
        binding.tabLayout.getTabAt(1)?.setIcon(R.drawable.ic_mention)
    }

    companion object {

        fun newInstance(): AccountFragment {
            return AccountFragment()
        }

    }

}