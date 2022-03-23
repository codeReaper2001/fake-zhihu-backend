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
@ApiModel(value="City对象", description="")
public class City implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "城市id")
    @TableId(value = "city_id", type = IdType.ID_WORKER_STR)
    private Integer cityId;

    @ApiModelProperty(value = "城市名")
    private String name;

    private Integer provinceId;


}
