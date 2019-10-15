package com.example.koindemo.delegate

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class Example {
    var p: String by Delegate()
}


class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name} in $thisRef.'")
    }
}

//val e = Example()e.p="Hello world"println(e.p)


//fun main(args: Array<String>) {
//    println(hello)
//    println(hello)
//}
//
//val hello:String by lazy(LazyThreadSafetyMode.NONE) {
//    println("feintkotlin")
//    "hello world"
//}


fun main(args: Array<String>) {
    val user = User()
    user.name = "first"
    user.name = "second"
}

class User {
    var name: String by Delegates.observable("<no name>") { prop, old, new ->
        println("$old -> $new")
    }
}

//fun main(args: Array<String>) {
//
//    val user = User(mapOf(
//        "name" to "John Doe",
//        "age"  to 25
//    ))
//}
//
//class User(val map: Map<String, Any?>) {
//    val name: String by map
//    val age: Int     by map
//}