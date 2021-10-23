package com.example.departmentservicemph.Service;

import com.example.departmentservicemph.Entity.Department;
import com.example.departmentservicemph.Repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author MPHuy on 28/09/2021
 */

@Service
@Slf4j
//@RequiredArgsConstructor
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department derpartment) {
        log.info("Inside saveDepartment of Service! ");
        return departmentRepository.save(derpartment);
    }

    public Department findDeparmentById(Long departmentId) {
        log.info("inside findDeparmentById ");
        return departmentRepository.findById(departmentId).get();
    }
}