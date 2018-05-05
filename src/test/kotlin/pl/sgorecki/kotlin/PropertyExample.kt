package pl.sgorecki.kotlin

import io.kotlintest.matchers.haveLength
import io.kotlintest.matchers.should
import io.kotlintest.matchers.shouldBe
import io.kotlintest.matchers.startWith
import io.kotlintest.properties.assertAll
import io.kotlintest.specs.StringSpec

class PropertyExample : StringSpec({
    "String size" {
        assertAll(2300) { a: String, b: String ->
            (a + b) should haveLength(a.length + b.length)
        }
    }
})

class MyTest : StringSpec({
    "length should return size of string" {
        "hello".length shouldBe 5
    }
    "startsWith should test for a prefix" {
        "world" should startWith("wor")
    }
})