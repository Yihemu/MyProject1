package szu.yui.mall.portal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import szu.yui.mall.portal.domain.MemberBrandAttention;

import java.util.List;

/**
 * 会员关注Repository
 */
public interface MemberBrandAttentionRepository extends MongoRepository<MemberBrandAttention,String> {
    MemberBrandAttention findByMemberIdAndBrandId(Long memberId, Long brandId);
    int deleteByMemberIdAndBrandId(Long memberId,Long brandId);
    List<MemberBrandAttention> findByMemberId(Long memberId);
}
