package com.kodingan.instagramclone.account.fragment.mention

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.kodingan.instagramclone.databinding.ItemSearchFeedBinding

class MentionAdapter : RecyclerView.Adapter<MentionAdapter.MyViewHolder>() {

    private val items = arrayListOf<MentionModel>()

    inner class MyViewHolder(val binding: ItemSearchFeedBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            ItemSearchFeedBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = items[position]

        holder.binding.img.setImageResource(item.imageResource)

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, position.toString(), Toast.LENGTH_SHORT).show()
        }
    }

    fun addItem(item: MentionModel) {
        items.add(item)
        notifyItemInserted(items.lastIndex)
    }

    fun addItems(items: List<MentionModel>) {
        this.items.addAll(items)
        notifyItemRangeChanged(0, itemCount)
    }

}