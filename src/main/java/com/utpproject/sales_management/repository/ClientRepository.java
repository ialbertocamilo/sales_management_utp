package com.utpproject.sales_management.repository;

import com.utpproject.sales_management.models.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository  extends JpaRepository<Clients, Integer> {
}
