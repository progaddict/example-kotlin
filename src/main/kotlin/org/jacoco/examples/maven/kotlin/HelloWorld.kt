package org.jacoco.examples.maven.kotlin

class HelloWorld {

    fun getMessage(bigger: Boolean): String {
        if (bigger) {
            return "Hello Universe!";
        } else {
            return "Hello World!";
        }
    }
}

val String.doubleLen: Int
    get() = 2 * this.length

fun foo(i: Int): String {
    return (i * i).toString()
}
