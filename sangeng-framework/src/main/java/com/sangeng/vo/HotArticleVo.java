package com.sangeng.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotArticleVo {
    //文章id
    private Long id;
    //标题
    private String title;

    //访问量
    private Long viewCount;
}

