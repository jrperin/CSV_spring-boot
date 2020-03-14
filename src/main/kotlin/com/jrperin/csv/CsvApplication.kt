package com.jrperin.csv

import com.jrperin.csv.model.Customer
import com.jrperin.csv.repository.CustomerRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class CsvApplication{

	@Bean
	fun initial(repository: CustomerRepository) = CommandLineRunner{
		repository.saveAll(
			listOf(
				Customer("Jack Smith", "Massachussetts", 23),
				Customer("Adam Johnson", "New York", 27),
				Customer("Katherin Carter", "Washington DC", 26),
				Customer("Jack London", "Nevada", 33),
				Customer("Jason Bourne", "California", 36)
			)
		)
	}
}

fun main(args: Array<String>) {
	runApplication<CsvApplication>(*args)
}
