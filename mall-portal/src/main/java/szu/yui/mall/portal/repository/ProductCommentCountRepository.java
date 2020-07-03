package szu.yui.mall.portal.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import szu.yui.mall.portal.domain.ProductComments;

import java.util.ArrayList;

public interface ProductCommentCountRepository extends MongoRepository<ProductComments, String> {
}
