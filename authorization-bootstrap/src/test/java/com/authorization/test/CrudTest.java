package com.authorization.test;

import com.alibaba.druid.sql.builder.UpdateBuilder;
import com.authorization.bootstrap.StartApplication;
import com.authorization.domain.model.po.RolePO;
import com.authorization.domain.repository.RoleRepository;
import org.hibernate.sql.Update;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = StartApplication.class)
public class CrudTest {
    @Resource
    private EntityManager entityManager;

    @Test
    @Transactional
    public void update(){
        RolePO rolePO = new RolePO();
//        rolePO.setName("管理员1");
        rolePO.setCode("admin");
        rolePO.setId("8a8798cd760901f90176090216140000");
        System.out.println(rolePO);
        entityManager.persist(rolePO);
        entityManager.flush();
        System.out.println(rolePO);
    }
}
