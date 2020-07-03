package szu.yui.mall.portal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import szu.yui.mall.portal.domain.RatingSource;

import java.util.List;

public interface RatingSourceRepository extends MongoRepository<RatingSource, String> {
    List<RatingSource> findByUserId(Integer id);
}
