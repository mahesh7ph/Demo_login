package com.motiva.demo_login;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    @Query("select  u FROM User u where u.username = :username and u.password=:password")
User getUserName(@Param("username") String username,@Param("password") String password);
	
}
