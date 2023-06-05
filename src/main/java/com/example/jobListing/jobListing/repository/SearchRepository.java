package com.example.jobListing.jobListing.repository;

import com.example.jobListing.jobListing.models.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
