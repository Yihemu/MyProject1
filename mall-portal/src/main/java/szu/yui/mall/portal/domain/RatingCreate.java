package szu.yui.mall.portal.domain;

import java.util.HashMap;

public class RatingCreate {
    private Long orderId;
    private HashMap<Integer, Double> ratingWithGoods;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public HashMap<Integer, Double> getRatingWithGoods() {
        return ratingWithGoods;
    }

    public void setRatingWithGoods(HashMap<Integer, Double> ratingWithGoods) {
        this.ratingWithGoods = ratingWithGoods;
    }
}
