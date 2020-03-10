package com.designtesting.timelineappdev1

data class Task(var title: String, var due_day: Int, var due_month: Int, var subject: String)

object Supplier {

    val task_list = listOf<Task>(
        Task("Do homework", 27, 2, "Maths"),
        Task("Service Learning", 23, 6, "Other"),
        Task("Kanji", 2, 3, "Japanese"),
        Task("Do homework", 27, 2, "Maths"),
        Task("Service Learning", 23, 6, "Other"),
        Task("Kanji", 2, 3, "Japanese"),
        Task("Do homework", 27, 2, "Maths"),
        Task("Service Learning", 23, 6, "Other"),
        Task("Kanji", 2, 3, "Japanese"),
        Task("Do homework", 27, 2, "Maths"),
        Task("Service Learning", 23, 6, "Other"),
        Task("Kanji", 2, 3, "Japanese")
    )
}