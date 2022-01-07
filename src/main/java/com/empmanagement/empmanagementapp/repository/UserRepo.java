package com.empmanagement.empmanagementapp.repository;

import com.empmanagement.empmanagementapp.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<user, Long> {
}
