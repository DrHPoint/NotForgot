package ru.teslateam.notforgot.models

import com.google.gson.annotations.SerializedName

import java.util.ArrayList

class RequestRegister {
    @SerializedName("email")
    var email: String? = null
    @SerializedName("name")
    var name: String? = null
    @SerializedName("id")
    var id: Int? = null
    @SerializedName("api_token")
    var api_token: String? = null
}

class ReguestAuthorization {
    @SerializedName("api_token")
    var api_token: String? = null
}

class ReguestPriorities {
    @SerializedName("id")
    var id: Int? = null
    @SerializedName("name")
    var name: String? = null
    @SerializedName("color")
    var color: String? = null
}

class RequestCategories {
    @SerializedName("id")
    var id: Int? = null
    @SerializedName("name")
    var name: String? = null
}

class RequestTasks {
    @SerializedName("id")
    var id: Int? = null
    @SerializedName("title")
    var title: String? = null
    @SerializedName("description")
    var description: String? = null
    @SerializedName("done")
    var done: Int? = null
    @SerializedName("deadline")
    var deadline: Int? = null
    @SerializedName("category")
    var category: RequestCategories? = null
    @SerializedName("priority")
    var priority: ReguestPriorities? = null
    @SerializedName("created")
    var created: Int? = null
}
