package org.jacoco.examples.maven.kotlin

val String.doubleLen: Int
    get() = 2 * this.length

fun foo(i: Int): String {
    return (i * i).toString()
}
