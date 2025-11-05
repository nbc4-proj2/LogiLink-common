package com.sparta.logilinkcommon.common.constants;

import lombok.Getter;

@Getter
public enum MessageStatus {

    PENDING("대기"),
    SUCCESS("승인"),
    FAIL("실패");

    private final String status;

    MessageStatus(String status) {
        this.status = status;
    }
}
