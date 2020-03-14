package com.jrperin.csv.util

import java.io.PrintWriter;
import java.io.IOException;
import com.jrperin.csv.model.Customer
import java.util.Arrays
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser
import org.apache.commons.csv.CSVPrinter
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths

class CSVHandler {

  companion object {
    fun customersToCSV(writer: PrintWriter, customers: List<Customer> ) {
      var csvPrinter: CSVPrinter? = null

      try {
        csvPrinter = CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("Id", "Name", "Address", "Age"))

        for (customer in customers) {
          val data = Arrays.asList(
              customer.id,
              customer.name,
              customer.address,
              customer.age)

          csvPrinter.printRecord(data)
        }

        println("Write CSV successfully!")
      } catch (e: Exception) {
        println("Writing CSV error!")
        e.printStackTrace()
      } finally {
        try {
          csvPrinter!!.close()
        } catch (e: IOException) {
          println("Flushing/closing error!")
          e.printStackTrace()
        }
      }
    }


    fun loadCustomersCSV(fileName : String) : List<Customer>{

      val reader = Files.newBufferedReader(Paths.get(fileName))

      val csvParser = CSVParser(reader, CSVFormat.EXCEL.withDelimiter(';'))

      for (csvRecord in csvParser){
        print
      }
      return customers
    }
  }
}