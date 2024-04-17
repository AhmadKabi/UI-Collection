package com.kodingan.instagramclone.account.fragment.mention

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.kodingan.instagramclone.R
import com.kodingan.instagramclone.databinding.FragmentAccountPostBinding
import com.kodingan.instagramclone.search.ItemDecorationGridVertical

class MentionAccountFragment : Fragment() {

    private lateinit var binding: FragmentAccountPostBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAccountPostBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buildRv()
    }

    private fun buildRv() {
        val spanCount = 3
        val adapter = MentionAdapter()

        val drawables = arrayOf(
            R.drawable.cat_1,
            R.drawable.cat_2,
            R.drawable.cat_3,
            R.drawable.cat_4,
            R.drawable.cat_5,
            R.drawable.cat_6,
            R.drawable.cat_7,
            R.drawable.cat_8,
            R.drawable.cat_9,
            R.drawable.cat_10,
            R.drawable.cat_11,
            R.drawable.cat_12,
            R.drawable.cat_13,
            R.drawable.cat_14,
            R.drawable.cat_15,
            R.drawable.cat_16,
            R.drawable.cat_17,
            R.drawable.cat_18,
            R.drawable.cat_19,
            R.drawable.cat_20,
            R.drawable.cat_21,
            R.drawable.cat_22,
            R.drawable.cat_23,
            R.drawable.cat_24,
            R.drawable.cat_25,
            R.drawable.cat_26,
        )

        val items = mutableListOf<MentionModel>()
        for (i in drawables.indices) {
            items.add(MentionModel(drawables[i]))
        }
        adapter.addItems(items)
        binding.rv.adapter = adapter

        val itemDecoration = ItemDecorationGridVertical(
            spanCount,
            6,
            true
        )
        binding.rv.addItemDecoration(itemDecoration)
        binding.rv.layoutManager = GridLayoutManager(
            requireContext(),
            spanCount,
            GridLayoutManager.VERTICAL,
            false
        )
        binding.rv.setHasFixedSize(false)

    }

    companion object {

        fun newInstance(): MentionAccountFragment {
            return MentionAccountFragment()
        }

    }

}