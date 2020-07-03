package szu.yui.mall.dao;

import org.apache.ibatis.annotations.Param;
import szu.yui.mall.model.UmsAdminPermissionRelation;

import java.util.List;

/**
 * 用户权限自定义DAO
 */
public interface UmsAdminPermissionRelationDao {
    int insertList(@Param("list")List<UmsAdminPermissionRelation> list);
}
