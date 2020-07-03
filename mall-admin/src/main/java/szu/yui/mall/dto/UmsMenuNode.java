package szu.yui.mall.dto;

import lombok.Getter;
import lombok.Setter;
import szu.yui.mall.model.UmsMenu;

import java.util.List;

/**
 * Created by macro on 2020/2/4.
 */
@Getter
@Setter
public class UmsMenuNode extends UmsMenu {
    private List<UmsMenuNode> children;
}
