package com.multicurrency.multicurrency.repository;

import com.multicurrency.multicurrency.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    @Query(value = "SELECT * FROM tbl_user u WHERE u.npk = %:npk% AND u.role = %:role%", nativeQuery = true)
    User searchUserByNpkRole(String npk, String role);
}
