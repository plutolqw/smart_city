package com.bz.smart_city.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("角色菜单关系")
public class RoleMenu {
    @ApiModelProperty("id")
    private Integer id;

    @ApiModelProperty("角色id")
    private Integer rid;

    @ApiModelProperty("菜单id")
    private Integer mid;
}
