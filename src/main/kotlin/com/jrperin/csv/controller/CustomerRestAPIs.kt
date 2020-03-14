package com.jrperin.csv.controller

import com.jrperin.csv.repository.CustomerRepository
import com.jrperin.csv.util.CSVHandler
import javax.servlet.http.HttpServletResponse

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/csv")
class CustomerRestAPIs {

    @Autowired
    lateinit var customerRepository: CustomerRepository;

    @GetMapping("/customers.csv")
    fun downloadCSV(response: HttpServletResponse) {
        val customers = customerRepository.findAll();

        response.setContentType("text/csv");
        response.setHeader("Content-Disposition", "attachment; file=customers.csv");
        CSVHandler.customersToCSV(response.getWriter(), customers);
    }
}