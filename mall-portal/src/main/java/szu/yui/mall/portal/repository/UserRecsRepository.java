package szu.yui.mall.portal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import szu.yui.mall.portal.domain.UserRecs;

public interface UserRecsRepository extends MongoRepository<UserRecs, String> {
    UserRecs findByUserId(Integer uid);
}
