package szu.yui.mall.portal.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document(collection = "ItemCFProductRecs")
public class ItemCFProductRecs {
    private String id;
    private Integer productId;
    private ArrayList<PRate> recs;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public ArrayList<PRate> getRecs() {
        return recs;
    }

    public void setRecs(ArrayList<PRate> recs) {
        this.recs = recs;
    }
}
