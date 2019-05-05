package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;

/**
 * @author LiuK
 * @date 2019/2/23 17:36
 * @description:
 */
public interface CmsPageControllerApi {
    //页面查询
    public QueryResponseResult  findList(int page, int size, QueryPageRequest queryPageRequest);
}
