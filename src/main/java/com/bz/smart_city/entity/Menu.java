package com.bz.smart_city.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel
public class Menu {
    @ApiModelProperty("id")
    private Integer id;

    @ApiModelProperty("父类id")
    private Integer pid;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("code")
    private String code;

    @ApiModelProperty("url")
    private String url;

    @ApiModelProperty("图标")
    private String icon;

    @ApiModelProperty("路径")
    private String path;

    @ApiModelProperty("排序")
    private Integer sort;

    @ApiModelProperty("是否是菜单")
    private Integer isMenu;

    @ApiModelProperty("启用 0:禁用 1:正常")
    private Integer enable;

    private List<Role> roles;
    private List<Menu> children;

}
