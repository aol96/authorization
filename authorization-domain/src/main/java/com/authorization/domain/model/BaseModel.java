package com.authorization.domain.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Data
@MappedSuperclass
public class BaseModel {
    @Id
    @GenericGenerator(name="idGenerator", strategy="uuid") //这个是hibernate的注解/生成32位UUID
    @GeneratedValue(generator="idGenerator")
    @Column(name = "id", updatable = false, length = 32)
    private String id;

    private Date createTime;
    private Date updateTime;
}
