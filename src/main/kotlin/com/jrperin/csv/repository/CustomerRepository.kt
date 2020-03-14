package com.jrperin.csv.repository

import com.jrperin.csv.model.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

interface CustomerRepository : JpaRepository<Customer, Long> {
}