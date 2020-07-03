package szu.yui.mall.service;

import org.springframework.transaction.annotation.Transactional;
import szu.yui.mall.dto.PmsBrandParam;
import szu.yui.mall.model.PmsBrand;

import java.util.List;

/**
 * 商品品牌服务Service
 *
 */
public interface PmsBrandService {
    /**
     * 获取所有品牌
     * @return
     */
    List<PmsBrand> listAllBrand();

    /**
     * 创建品牌
     * @param pmsBrandParam
     * @return
     */
    int createBrand(PmsBrandParam pmsBrandParam);

    /**
     * 修改品牌
     * @param id
     * @param pmsBrandParam
     * @return
     */
    @Transactional
    int updateBrand(Long id, PmsBrandParam pmsBrandParam);

    /**
     * 删除品牌
     * @param id
     * @return
     */
    int deleteBrand(Long id);

    /**
     * 批量删除品牌
     * @param ids
     * @return
     */
    int deleteBrand(List<Long> ids);

    /**
     * 分页查询品牌
     * @param keyword
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<PmsBrand> listBrand(String keyword, int pageNum, int pageSize);

    /**
     * 获取品牌
     * @param id
     * @return
     */
    PmsBrand getBrand(Long id);

    /**
     * 显示修改状态
     * @param ids
     * @param showStatus
     * @return
     */
    int updateShowStatus(List<Long> ids, Integer showStatus);

    /**
     * 修改厂商制造商状态
     * @param ids
     * @param factoryStatus
     * @return
     */
    int updateFactoryStatus(List<Long> ids, Integer factoryStatus);
}
