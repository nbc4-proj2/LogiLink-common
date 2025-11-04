package com.sparta.logilinkcommon.common.constants;

import lombok.Getter;

@Getter
public enum CompanyType {
    SUPPLIER("생산업체"),
    RECIPIENT("수령업체");

    private final String type;

    CompanyType(String type){
        this.type = type;
    }
}
