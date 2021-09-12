package com.learning.rest.services.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.rest.services.dao.UserInfo;


@Repository
public interface UserJPARespository extends JpaRepository<UserInfo, Integer>{

   
}
