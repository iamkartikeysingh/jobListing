package com.example.jobListing.jobListing.repository;

import com.example.jobListing.jobListing.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository <Post, String>
{
}
