package com.learning.rest.services.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.rest.services.dao.PostFeed;


@Repository
public interface PostFeedRespository extends JpaRepository<PostFeed, Integer>{

}
