package com.bz.smart_city.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class MenusEntity {
    @ApiModelProperty("id")
    private Integer id;

    @ApiModelProperty("父类id")
    private Integer pid;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("code")
    private String code;

    @ApiModelProperty("href")
    private String href;

    @ApiModelProperty("图标")
    private String icon;

    @ApiModelProperty("路径")
    private String path;

    @ApiModelProperty("排序")
    private Integer sort;

}
