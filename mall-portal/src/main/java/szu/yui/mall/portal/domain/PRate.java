package szu.yui.mall.portal.domain;

public class PRate {
    private Integer productId;
    private Double score;

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (productId == null ? 0 : productId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(obj instanceof PRate){
            PRate other = (PRate) obj;
            if(this.productId.equals(other.productId)){
                return true;
            }
        }
        return false;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
