package szu.yui.mall.portal.service;

import szu.yui.mall.portal.domain.MemberProductCollection;

import java.util.List;

/**
 * 会员收藏Service
 */
public interface MemberCollectionService {
    int addProduct(MemberProductCollection productCollection);

    int deleteProduct(List<String> ids);

    List<MemberProductCollection> listProduct(Integer memberId);
}
