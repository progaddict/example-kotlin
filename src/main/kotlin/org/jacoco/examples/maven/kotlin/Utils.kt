@file:JvmName("Utils")

package org.jacoco.examples.maven.kotlin

val String.doubleLen: Int
    get() = 2 * this.length

fun foo(i: Int): String {
    return (i * i).toString()
}

fun bar(i: Int): String {
    val s = i.toString()
    return s + s
}
