package org.sid.repository;

import org.sid.model.Partenaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PartenaireRepository extends JpaRepository<Partenaire, Long>{

}
