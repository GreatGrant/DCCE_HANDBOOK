package com.gralliams.dccehandbook

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SyllabusAdapter(val onPhotoSelected: (photo: PhotoModel, position: Int) -> Unit) : RecyclerView.Adapter<SyllabusAdapter.SyllabusViewHolder>() {

    private val photoItems: ArrayList<PhotoModel> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SyllabusViewHolder {
        var binding = PhotoItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return SyllabusViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SyllabusViewHolder, position: Int) {
        holder.bind(photoItems[position], position)
    }

    override fun getItemCount() = photoItems.size

    fun updateItems(photosList: List<PhotoModel>) {
        photoItems.clear()
        photoItems.addAll(photosList)
        notifyDataSetChanged()
    }

    inner class SyllabusViewHolder(val itemBinding: PhotoItemLayoutBinding) : RecyclerView.ViewHolder(itemBinding.root) {

        fun bind(photoModel: PhotoModel, position: Int) {
            itemBinding.apply {
                imgPhoto.load(photoModel.urls.thumb) {
                    placeholder(R.color.color_box_background)
                    crossfade(true)
                }

                cardPhoto.setOnClickListener {
                    onPhotoSelected(photoModel, position)
                }
            }
        }
    }
}

