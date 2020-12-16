package com.authorization.domain.model.po;

import com.authorization.domain.model.BaseModel;
import lombok.Data;
import lombok.experimental.FieldNameConstants;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "role")
@Data
@FieldNameConstants
public class RolePO extends BaseModel {
    private String name;
    private String code;
    private String description;
}
