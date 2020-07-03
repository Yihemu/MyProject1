package szu.yui.mall.portal.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;
import szu.yui.mall.common.api.CommonResult;
import szu.yui.mall.model.UmsMember;
import szu.yui.mall.portal.domain.RatedProduct;

import java.util.List;

/**
 * 会员管理Service
 */
public interface UmsMemberService {
    /**
     * 根据用户名获取会员
     */
    UmsMember getByUsername(String username);

    /**
     * 根据会员编号获取会员
     */
    UmsMember getById(Integer id);

    /**
     * 用户注册
     * String telephone, String authCode
     */
    @Transactional
    void register(String username, String password, String phone);

    /**
     * 生成验证码
     */
    String generateAuthCode(String telephone);

    /**
     * 修改密码
     */
    @Transactional
    void updatePassword(String telephone, String password, String authCode);

    /**
     * 获取当前登录会员
     */
    UmsMember getCurrentMember();

    /**
     * 根据会员id修改会员积分
     */
    void updateIntegration(Integer id,Integer integration);


    /**
     * 获取用户信息
     */
    UserDetails loadUserByUsername(String username);

    /**
     * 登录后获取token
     */
    String login(String username, String password);

    /**
     * 刷新token
     */
    String refreshToken(String token);

    /**
     *
     */
    List<RatedProduct> getBoughtProducts();
}
