package com.example.polls.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.polls.model.Role;
import com.example.polls.model.RoleName;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public class RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(RoleName roleName);
}

