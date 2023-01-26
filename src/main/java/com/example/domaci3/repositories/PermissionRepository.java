package com.example.domaci3.repositories;

import com.example.domaci3.model.Permission;
import com.example.domaci3.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Integer> {

    public Permission findByPermissionId(Integer permissionId);
    public Permission findByPermission(String permission);

}
