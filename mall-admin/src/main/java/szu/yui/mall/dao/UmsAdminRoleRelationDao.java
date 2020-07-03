package szu.yui.mall.dao;

import org.apache.ibatis.annotations.Param;
import szu.yui.mall.model.UmsAdminRoleRelation;
import szu.yui.mall.model.UmsPermission;
import szu.yui.mall.model.UmsResource;
import szu.yui.mall.model.UmsRole;

import java.util.List;

public interface UmsAdminRoleRelationDao {
    /**
     * 批量插入用户角色关系
     * @param adminRoleRelations
     * @return
     */
    int insertList(@Param("list")List<UmsAdminRoleRelation> adminRoleRelations);

    /**
     * 获取用户所有角色表
     * @param adminId
     * @return
     */
    List<UmsRole> getRoleList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有角色权限
     * @param adminId
     * @return
     */
    List<UmsPermission> getRolePermissionList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有权限+-
     * @param adminId
     * @return
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有可访问资源
     */
    List<UmsResource> getResourceList(@Param("adminId") Long adminId);
}
