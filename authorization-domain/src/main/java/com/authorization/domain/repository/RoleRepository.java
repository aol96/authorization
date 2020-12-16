package com.authorization.domain.repository;

import com.authorization.domain.model.po.RolePO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<RolePO,String> {

}
