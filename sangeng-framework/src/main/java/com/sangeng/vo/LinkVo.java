package com.sangeng.vo;

import lombok.Data;

@Data
public class LinkVo {
    private Long id;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String logo;

    /**
     * 描述
     */
    private String description;

    /**
     * 网站地址
     */
    private String address;

}
