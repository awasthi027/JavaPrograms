package com.learning.rest.services.services.layers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.rest.services.dao.PostFeed;
import com.learning.rest.services.dao.UserInfo;
import com.learning.rest.services.respositories.PostFeedRespository;

@Service
public class PostFeedService {
	
	@Autowired
	PostFeedRespository postFeedRespository;
	
	public List<PostFeed> findAll() {
		return postFeedRespository.findAll();
	}
	public PostFeed savePostFeed(PostFeed postFeed) {
		return postFeedRespository.save(postFeed);
	}

}
