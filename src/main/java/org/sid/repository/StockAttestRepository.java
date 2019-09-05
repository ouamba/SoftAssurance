package org.sid.repository;

import org.sid.model.StockAttest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StockAttestRepository extends JpaRepository<StockAttest, Long>{

}
