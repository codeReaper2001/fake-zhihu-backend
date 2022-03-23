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
@ApiModel(value="Province对象", description="")
public class Province implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "省id")
    @TableId(value = "province_id", type = IdType.ID_WORKER_STR)
    private Integer provinceId;

    @ApiModelProperty(value = "省名")
    private String provinceName;


}
