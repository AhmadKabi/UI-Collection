package com.kodingan.instagramclone.account

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class AccountPagerAdapter(
    fm: FragmentManager
) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> PostAccountFragment.newInstance()
            1 -> PostAccountFragment.newInstance()
            else -> PostAccountFragment.newInstance()
        }
    }

    override fun getCount(): Int {
        return 2
    }

}