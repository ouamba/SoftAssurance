package org.sid.repository;

import org.sid.model.StockCr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StockCrRepository extends JpaRepository<StockCr, Long>{

}
