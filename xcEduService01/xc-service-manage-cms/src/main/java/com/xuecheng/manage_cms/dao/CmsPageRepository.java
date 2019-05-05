package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author LiuK
 * @date 2019/2/23 20:49
 * @description: 创建Dao，继承MongoRepository，并指定实体类型和主键类型
 */
public interface CmsPageRepository extends MongoRepository<CmsPage,String>{
}
