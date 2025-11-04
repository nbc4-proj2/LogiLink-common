package com.sparta.logilinkcommon.common.constants;

import lombok.Getter;

@Getter
public enum UserStatus {

    PENDING("승인 대기"),
    APPROVED("승인"),
    REJECTED("승인 거절");

    private final String type;

    UserStatus(String type){
        this.type = type;
    }
}
