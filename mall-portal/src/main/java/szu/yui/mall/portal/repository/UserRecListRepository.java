package szu.yui.mall.portal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import szu.yui.mall.portal.domain.UserRecList;

import java.util.ArrayList;

public interface UserRecListRepository extends MongoRepository<UserRecList, String> {
    UserRecList findByMemberId(Integer memberId);
}
