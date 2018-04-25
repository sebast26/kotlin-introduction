package pl.sgorecki.kotlin

import com.opencsv.bean.CsvBindByPosition

class Company {

    @CsvBindByPosition(position = 0)
    var name: String? = null

    @CsvBindByPosition(position = 1)
    var income: Int? = null

}