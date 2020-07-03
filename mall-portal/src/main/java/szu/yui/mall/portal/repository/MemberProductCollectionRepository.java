package szu.yui.mall.portal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import szu.yui.mall.portal.domain.MemberProductCollection;

import java.util.List;

/**
 * 商品收藏Repository
 */
public interface MemberProductCollectionRepository extends MongoRepository<MemberProductCollection,String> {
    MemberProductCollection findByMemberIdAndProductId(Integer memberId, Integer productId);
    int deleteByMemberIdAndProductId(Integer memberId,Integer productId);
    List<MemberProductCollection> findByMemberId(Integer memberId);
}
