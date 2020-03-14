package com.jrperin.csv.model

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
data class Customer(
    @Column(name = "name")
    var name: String = "",

    @Column(name = "address")
    var address: String = "",

    @Column(name = "age")
    var age: Int = 0,

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = -1
) {}