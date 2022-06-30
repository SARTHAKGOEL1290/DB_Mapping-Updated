package com.DB_Mapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.DB_Mapping.Entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	
	@Modifying
	@Query("DELETE from Users u where u.Uid= :Uid")
	public void getDeleteById(@Param("Uid") int Uid);

}
