package com.example.departmentservicemph.Repository;

import com.example.departmentservicemph.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author MPHuy on 28/09/2021
 */
@Repository
public interface DepartmentRepository  extends JpaRepository<Department, Long> {
}
