package com.gralliams.dccehandbook

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.gralliams.dccehandbook.databinding.SyllabusItemLayoutBinding

class SyllabusAdapter(var context: Context,var syllabusItem: ArrayList<SyllabusModel> ) : RecyclerView.Adapter<SyllabusAdapter.SyllabusViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SyllabusViewHolder {
        var binding = SyllabusItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return SyllabusViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SyllabusViewHolder, position: Int) {
        holder.bind(syllabusItem[position], position)
    }

    override fun getItemCount() = syllabusItem.size

    fun updateItems(photosList: List<SyllabusModel>) {
        syllabusItem.clear()
        syllabusItem.addAll(photosList)
        notifyDataSetChanged()
    }

    inner class SyllabusViewHolder(val itemBinding: SyllabusItemLayoutBinding) : RecyclerView.ViewHolder(itemBinding.root) {

        fun bind(syllabusModel: SyllabusModel, position: Int) {
            var tagPosition = position
            itemBinding.apply {
                syallbusPhoto.setImageResource(syllabusModel.imageUrl)


                cardPhoto.setOnClickListener {
                    var intent = Intent(context, SyllabusActivity::class.java)
                    intent.putExtra(TAG_POSITION, tagPosition)
                    context.startActivity(intent)
                }
            }
        }
    }
}

