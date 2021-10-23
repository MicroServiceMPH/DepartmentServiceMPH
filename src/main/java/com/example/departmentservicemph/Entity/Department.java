package com.example.departmentservicemph.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author MPHuy on 28/09/2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Department {
    @Id
    @GeneratedValue
    private long Id;
    private String deparmentName;
    private String deparmentAddress;
    private String deparmentCode;
}
