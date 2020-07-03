package szu.yui.mall.portal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import szu.yui.mall.portal.domain.ItemCFProductRecs;


public interface CFItemRecsRepository extends MongoRepository<ItemCFProductRecs, String> {
    ItemCFProductRecs findByProductId(Integer productId);
}
