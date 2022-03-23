package com.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Zeng
 * @since 2022-03-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="UserCollect对象", description="")
public class UserCollect implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "收藏信息id")
    @TableId(value = "collect_id", type = IdType.AUTO)
    private Integer collectId;

    @ApiModelProperty(value = "用户id")
    private Integer userId;

    @ApiModelProperty(value = "回答id")
    private Integer answerId;

    @ApiModelProperty(value = "添加收藏时间")
    private Date createTime;


}
