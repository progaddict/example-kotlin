package org.jacoco.examples.maven.kotlin

import junit.framework.TestCase

class HelloWorldTest : TestCase() {

    fun testAssert(): Unit {
        assertEquals("Hello World!", HelloWorld().getMessage(false))
    }
}
