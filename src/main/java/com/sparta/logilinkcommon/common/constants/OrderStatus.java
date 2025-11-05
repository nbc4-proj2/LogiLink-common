package com.sparta.logilinkcommon.common.constants;

import lombok.Getter;

@Getter
public enum OrderStatus {

    ORDER_PENDING("주문 대기"),
    ORDER_SUCCESSED("주문 완료"),
    ORDER_CANCELED("주문 취소"),
    ORDER_REJECTED("주문 거절");

    private final String status;

    OrderStatus(String status) {
        this.status = status;
    }
}
