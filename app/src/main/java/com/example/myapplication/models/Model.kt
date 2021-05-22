package com.example.myapplication.models

data class Hobby(var title: String)

object Supplier{
    val hobbies = listOf(
        Hobby("Swimming") ,
        Hobby("Working out"),
        Hobby("Learning"),
        Hobby("Take a walk"),
        Hobby("Avoiding to be alone"),
        Hobby("Eat"),
        Hobby("Sleep"),
        Hobby("Conquer"),
        Hobby("Repeat"),
        Hobby("Coding"),
        Hobby("Testing"),
        Hobby("Deploying"),
        Hobby("Repeat")

    )
}