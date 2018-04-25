package pl.sgorecki.kotlin

import com.opencsv.bean.CsvBindByName

class Company {

    @CsvBindByName(column = "Name")
    var name: String? = null

    @CsvBindByName(column = "Income")
    var income: Int? = null
}