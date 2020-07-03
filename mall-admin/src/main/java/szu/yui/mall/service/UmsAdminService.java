package szu.yui.mall.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;
import szu.yui.mall.dto.UmsAdminParam;
import szu.yui.mall.dto.UpdateAdminPasswordParam;
import szu.yui.mall.model.UmsAdmin;
import szu.yui.mall.model.UmsPermission;
import szu.yui.mall.model.UmsRole;
import szu.yui.mall.model.UmsResource;

import java.util.List;

/**
 * 后台管理员Service
 */
public interface UmsAdminService {
    /**
     * 根据用户名获取后台管理员
     * @param username
     * @return
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 注册功能
     * @param umsAdminParam
     * @return
     */
    UmsAdmin register(UmsAdminParam umsAdminParam);

    /**
     * 登录功能
     * @param username
     * @param password
     * @return
     */
    String login(String username, String password);

    /**
     * 刷新token功能
     * @param oldToken
     * @return
     */
    String refreshToken(String oldToken);

    /**
     * 根据用户id获取用户
     * @param id
     * @return
     */
    UmsAdmin getItem(Long id);

    /**
     * 根据用户或昵称分页查询用户
     * @param name
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<UmsAdmin> list(String name, Integer pageSize, Integer pageNum);

    /**
     * 修改指定用户信息
     * @param id
     * @param umsAdmin
     * @return
     */
    int update(Long id, UmsAdmin umsAdmin);

    /**
     * 删除指定用户
     * @param id
     * @return
     */
    int delete(Long id);

    /**
     * 修改用户角色关系
     * @param adminId
     * @param roleIds
     * @return
     */
    @Transactional
    int updateRole(Long adminId, List<Long> roleIds);

    /**
     * 获取用户对应角色
     * @param adminId
     * @return
     */
    List<UmsRole> getRoleList(Long adminId);

    /**
     * 获取指定用户的可访问资源
     */
    List<UmsResource> getResourceList(Long adminId);

    /**
     * 修改用户权限
     * @param adminId
     * @param permissionIds
     * @return
     */
    @Transactional
    int updatePermission(Long adminId, List<Long> permissionIds);

    /**
     * 获取用户的所有权限
     * @param adminId
     * @return
     */
    List<UmsPermission> getPermissionList(Long adminId);

    /**
     * 修改密码
     * @param param
     * @return
     */
    int updatePassword(UpdateAdminPasswordParam param);

    /**
     * 获取用户信息
     * @param username
     * @return
     */
    UserDetails loadUserByUsername(String username);
}
