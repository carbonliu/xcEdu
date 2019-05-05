package com.xuecheng.framework.domain.cms.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author LiuK
 * @date 2019/2/23 17:30
 * @description:
 */
@Data
public class QueryPageRequest implements Serializable {
    //接受页面查询条件
    //站点id
    private String siteId;
    //页面ID
    private String pageId;
    //页面名称
    private String pageName;
    //别名
    private String pageAliase;
    //模板id
    private String templateId;
    //扩充、、、
}
