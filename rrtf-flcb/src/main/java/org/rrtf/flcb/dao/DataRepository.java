package org.rrtf.flcb.dao;


import org.rrtf.flcb.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Data, Long> {
	
}
