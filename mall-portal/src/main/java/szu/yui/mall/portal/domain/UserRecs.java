package szu.yui.mall.portal.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "UserRecs")
public class UserRecs {
    @Id
    private String id;
    @Indexed(name = "uid")
    private Integer userId;
    private List<PRate> recs;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<PRate> getRecs() {
        return recs;
    }

    public void setRecs(List<PRate> recs) {
        this.recs = recs;
    }
}
