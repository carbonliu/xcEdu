package com.xuecheng.manage_cms.test;

import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.manage_cms.dao.CmsPageRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author LiuK
 * @date 2019/2/23 20:50
 * @description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CmsPageRepositoryTest {
    @Autowired
    CmsPageRepository cmsPageRepository;
    @Test
    public void testFinaAll(){
        List<CmsPage> all = cmsPageRepository.findAll();
        System.out.println(all);
    }

    //分页测试
    @Test
    public void testFindPage(){
        int page=0;//从0开始
        int size=10;//每页记录数
        Pageable pageable= PageRequest.of(page, size);
        Page<CmsPage> all = cmsPageRepository.findAll(pageable);
        System.out.println(all);

    }
}
