package com.example.api.user.repository;

import com.example.api.user.domain.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserVO, Long> {
    boolean existsByUsername(String username);
    UserVO findByUsername(String username);

    @Query("select u from UserVO u where u.username= :username and u.password= :password")
    UserVO login(@Param("username") String username, @Param("password") String password);
}
