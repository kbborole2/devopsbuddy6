package com.devopsbuddy6.backend.persistence.repositories;

import com.devopsbuddy6.backend.persistence.domain.backend.Role;
import com.devopsbuddy6.backend.persistence.domain.backend.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by kb on 7/19/2017.
 */
@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {


}
