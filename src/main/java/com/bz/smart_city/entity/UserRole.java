package com.bz.smart_city.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("用户角色关系")
public class UserRole {
    @ApiModelProperty("id")
    private Integer id;

    @ApiModelProperty("用户id")
    private Integer uid;

    @ApiModelProperty("角色id")
    private Integer rid;
}
