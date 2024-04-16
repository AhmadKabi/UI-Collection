package com.kodingan.instagramclone.account

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class AccountPagerAdapter(
    fm: FragmentManager
) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> FirstFragment.newInstance()
            1 -> FirstFragment.newInstance()
            else -> FirstFragment.newInstance()
        }
    }

    override fun getCount(): Int {
        return 2
    }
}