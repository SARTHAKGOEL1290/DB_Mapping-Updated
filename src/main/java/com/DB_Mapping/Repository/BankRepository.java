package com.DB_Mapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.DB_Mapping.Entity.Bank;

public interface BankRepository  extends JpaRepository<Bank,Integer>{
	
	@Modifying
	@Query("DELETE from Bank b where b.Bid= :Bid")
	public void getDeleteByBId(@Param("Bid") int Bid);
	
}
