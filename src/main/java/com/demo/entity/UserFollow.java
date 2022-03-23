package com.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
@ApiModel(value="UserFollow对象", description="")
public class UserFollow implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "关注id")
    @TableId(value = "follow_id", type = IdType.AUTO)
    private Integer followId;

    @ApiModelProperty(value = "关注人，粉丝")
    private Integer follower;

    @ApiModelProperty(value = "被关注人")
    private Integer target;


}
