package com.DB_Mapping.Repository;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.DB_Mapping.DTO.Bankdto;
import com.DB_Mapping.Entity.UserDetail;

public interface UserDetailRepository extends JpaRepository<UserDetail,Integer> {
	
	//@Query("select u.city as UserDetail u and b.Bname as Bank b where u.UDid = b.Bid")
	@Query("SELECT new com.DB_Mapping.DTO.Bankdto (u.city,b.Bname) from UserDetail u JOIN u.bankdetail b where u.UDid= :UDid")
	public List<Bankdto> getBankDtoInfo(@PathParam("UDid") int UDid);
	
	@Modifying
	@Query("DELETE from UserDetail u where u.UDid= :UDid")
	public void getDeleteByUDId(@Param("UDid") int UDid);
	
	@Modifying
	@Query("UPDATE UserDetail set city= :c where UDid= :id")
	public void getUpdateByUDId( @Param("c") String c,@Param("id") int id);

}
