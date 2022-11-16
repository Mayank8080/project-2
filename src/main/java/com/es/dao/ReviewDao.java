package com.es.dao;

import java.util.List;

import com.es.entity.Review;

public interface ReviewDao {
Review addReview(Review r,int movieCode);
List<Review> listAllReview(int movieCode);
Review getReview(int movieCode,int revId);

Review updateReview(Review r,int revId);
Review deleteReview(int movieCode,int revId);
void deleteAllReviews(int movieCode);

}
