package szu.yui.mall.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import szu.yui.mall.model.Productwithaveragerate;
import szu.yui.mall.model.ProductwithaveragerateExample;

public interface ProductwithaveragerateMapper {
    long countByExample(ProductwithaveragerateExample example);

    int deleteByExample(ProductwithaveragerateExample example);

    int deleteByPrimaryKey(String id);

    int insert(Productwithaveragerate record);

    int insertSelective(Productwithaveragerate record);

    List<Productwithaveragerate> selectByExample(ProductwithaveragerateExample example);

    Productwithaveragerate selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Productwithaveragerate record, @Param("example") ProductwithaveragerateExample example);

    int updateByExample(@Param("record") Productwithaveragerate record, @Param("example") ProductwithaveragerateExample example);

    int updateByPrimaryKeySelective(Productwithaveragerate record);

    int updateByPrimaryKey(Productwithaveragerate record);
}