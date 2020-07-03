package szu.yui.mall.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

/**
 * 修改用户密码参数
 */
@Getter
@Setter
public class UpdateAdminPasswordParam {
    @NotEmpty(message = "用户名不能为空")
    private String username;
    @NotEmpty(message = "旧密码不能为空")
    private String oldPassword;
    @NotEmpty(message = "新密码不能为空")
    private String newPassword;
}
