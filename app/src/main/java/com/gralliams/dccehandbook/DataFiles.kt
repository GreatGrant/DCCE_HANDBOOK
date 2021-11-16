package com.gralliams.dccehandbook

class TagModel(var title: String,var image: Int) {

}

object Tag {
    var tagList  = arrayListOf(
        TagModel("History", R.drawable.atbugate),
        TagModel("Philosophy",R.drawable.atilport),
        TagModel("Exam  Guideline", R.drawable.senateport),
        TagModel("Regulations",R.drawable.atbugate),
        TagModel("Entry Demands",  R.drawable.atilport),
        TagModel("Duration Of  Course",   R.drawable.senateport),
        TagModel("Graduation Condition",  R.drawable.atilport),
        TagModel("Grading System",  R.drawable.atbugate),
        TagModel("Staff List", R.drawable.senateport))
}

class SyllabusModel(var title:String, var imageUrl: Int){}

object Syllabus{
    var syallusList = arrayListOf(SyllabusModel("100 Level", R.drawable.ic_undraw_begin_chat_re_v0lw),
        SyllabusModel("200 Level", R.drawable.ic_undraw_bibliophile_re_xarc),
        SyllabusModel("300 Level", R.drawable.ic_undraw_lightbulb_moment_re_ulyo),
                SyllabusModel("400 Level", R.drawable.undraw_pair_programming_re_or4x),
    SyllabusModel("500 Level", R.drawable.ic_undraw_certification_aif8))
}