package szu.yui.mall.portal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import szu.yui.mall.portal.domain.Product;

import java.util.ArrayList;
import java.util.List;

public interface ProductRepository extends MongoRepository<Product,String> {
    ArrayList<Product> findByProductIdIn(List<Integer> list);
    Product findProductByProductId(Integer productId);
    ArrayList<Product> findTop4ByAvgGreaterThanEqual(Double line);
}
