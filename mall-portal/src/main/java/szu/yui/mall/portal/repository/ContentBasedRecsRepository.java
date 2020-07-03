package szu.yui.mall.portal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import szu.yui.mall.portal.domain.ContentBasedProductRecs;

import java.util.ArrayList;
import java.util.List;

public interface ContentBasedRecsRepository extends MongoRepository<ContentBasedProductRecs, String> {
    ContentBasedProductRecs findByProductId(Integer productId);
    ArrayList<ContentBasedProductRecs> findByProductIdIn(List<Integer> ids);
}
