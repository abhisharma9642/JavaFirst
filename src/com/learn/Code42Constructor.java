package com.learn

internal class classOne
    (val number1: Int, val naam1: String?)


object Code42Constructor {
    @kotlin.jvm.JvmStatic
    fun main(args: Array<String>) {
        println("Java Constructor in Programming Logic")
        val o = classOne(2, "sharma")
        println(o.number1)
        println(o.naam1)
    }
} //constructor will be always be in class itself, not outside the class defined already before
//constructors in Java programming can be overloaded with different parameters or arguments
//with same name of constructors
