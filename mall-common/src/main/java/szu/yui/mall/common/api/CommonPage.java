package szu.yui.mall.common.api;

import com.github.pagehelper.PageInfo;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * 分页数据封装对象
 * @param <T>
 */
public class CommonPage<T> {
    private Integer pageNum;
    private Integer pageSize;
    private Integer pageTotal;
    private Long total;
    private List<T> list;

    public static <T> CommonPage<T> restPage(List<T> list){
        CommonPage<T> result = new CommonPage<T>();
        PageInfo<T> pageInfo = new PageInfo<T>(list);
        result.setPageTotal(pageInfo.getPages());
        result.setPageNum(pageInfo.getPageNum());
        result.setPageSize(pageInfo.getPageSize());
        result.setList(pageInfo.getList());
        result.setTotal(pageInfo.getTotal());
        return result;
    }

    public static <T> CommonPage<T> restPage(Page<T> pageInfo){
        CommonPage<T> result = new CommonPage<T>();
        result.setTotal(pageInfo.getTotalElements());
        result.setList(pageInfo.getContent());
        result.setPageSize(pageInfo.getSize());
        result.setPageNum(pageInfo.getNumber());
        result.setPageTotal(pageInfo.getTotalPages());
        return result;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Integer pageTotle) {
        this.pageTotal = pageTotle;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
