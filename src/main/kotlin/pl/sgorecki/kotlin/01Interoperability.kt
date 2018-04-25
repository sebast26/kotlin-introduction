package pl.sgorecki.kotlin

import com.opencsv.bean.StatefulBeanToCsvBuilder
import java.io.File
import java.io.PrintWriter

fun main(args: Array<String>) {
    val file = File("/Users/sgorecki/test.csv")
    val writer = PrintWriter(file)
    val beanToCsv = StatefulBeanToCsvBuilder<Company>(writer).build()

    val gft = Company()
    gft.name = "GFT"
    gft.income = 999_999_999

    beanToCsv.write(gft)
    writer.close()
}