package szu.yui.mall.portal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import szu.yui.mall.portal.domain.Rating;

import java.util.ArrayList;

public interface RatingRepository extends MongoRepository<Rating, String> {
    ArrayList<Rating> findByUserId(Integer userId);
    Rating findFirstByProductIdAndScoreEquals(Integer productId, Integer score);
}
