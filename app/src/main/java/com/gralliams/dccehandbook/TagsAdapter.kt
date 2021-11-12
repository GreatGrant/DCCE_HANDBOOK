package com.gralliams.dccehandbook

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gralliams.dccehandbook.databinding.TagItemLayoutBinding

class TagsAdapter(var context: Context, private val tagItems: ArrayList<TagModel> ) : RecyclerView.Adapter<TagsAdapter.TagViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TagViewHolder {
        var binding = TagItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return TagViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TagViewHolder, position: Int) {
        holder.bind(tagItems[position], position)
    }

    override fun getItemCount() = tagItems.size

    fun updateItems(tagsList: List<TagModel>) {
        tagItems.clear()
        tagItems.addAll(tagsList)
        notifyDataSetChanged()
    }

    inner class TagViewHolder(val itemBinding: TagItemLayoutBinding) : RecyclerView.ViewHolder(itemBinding.root) {

        fun bind(tagModel: TagModel, position: Int) {
            var tagPosition = position
            itemBinding.apply {
                txtTagName.text = tagModel.title
                imgTag.setImageResource(tagModel.image)

                cardTag.setOnClickListener {
                    var intent = Intent(context, TagDisplayActivity::class.java)
                    intent.putExtra(TAG_POSITION, tagPosition)
                    context.startActivity(intent)
                }
            }
        }
    }
}
