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

class SyllabusModel(var title:String, var imageUrl: Int){}

object Syllabus{
    var syallusObject = arrayListOf(SyllabusModel("100 Level", R.drawable.undraw_grades_re_j7d6),
        SyllabusModel("200 Level", R.drawable.undraw_reminders_re_gtyb),
        SyllabusModel("300 Level", R.drawable.undraw_pair_programming_re_or4x),
                SyllabusModel("400 Level", R.drawable.undraw_programmer_re_owql),
    SyllabusModel("500 Level", R.drawable.undraw_drone_delivery_re_in95))
}