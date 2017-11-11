package org.jacoco.examples.maven.kotlin

import junit.framework.Assert
import junit.framework.TestCase

class Test2 : TestCase() {
    fun testFoo() {
        Assert.assertEquals("100", foo(10))
    }

    fun testDoubleLen() {
        Assert.assertEquals(22, "hello world".doubleLen)
    }
}
