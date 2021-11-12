package com.gralliams.dccehandbook

class TagModel(var title: String,var image: Int) {

}

object Tag {
    var tagObject  = arrayListOf(TagModel("History", R.drawable.atbugate),
        TagModel("Philosophy",R.drawable.atilport),
        TagModel("Staff List", R.drawable.senateport),
        TagModel("Management",R.drawable.atbugate),
        TagModel("Entry Demands",  R.drawable.atilport),
        TagModel("Duration Of  Course",   R.drawable.senateport),
        TagModel("Grading System",  R.drawable.atbugate),
        TagModel("Graduation Condition",  R.drawable.atilport),
        TagModel("Exam  Guideline", R.drawable.senateport))
}
