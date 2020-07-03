package szu.yui.mall.portal.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class UserRecList {
    @Id
    private String id;
    @Indexed
    private Integer memberId;
    private List<Product> recList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public List<Product> getRecList() {
        return recList;
    }

    public void setRecList(List<Product> recList) {
        this.recList = recList;
    }
}
