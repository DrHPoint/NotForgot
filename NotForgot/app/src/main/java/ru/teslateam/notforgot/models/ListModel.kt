package ru.teslateam.notforgot.models

class ListModel(
    var user: Boolean,
    var category: List<Category>
)

class Category(
    var name: String,
    var data: List<Data>

)

class Data(
    var id: Int,
    var date: String,
    var title: String,
    var description: String,
    var priority: String,
    var to_date: Int
)