package com.puppy.joblisting.repository;

import com.puppy.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
