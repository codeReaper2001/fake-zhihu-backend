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
@ApiModel(value="Question对象", description="")
public class Question implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "问题id")
    @TableId(value = "question_id", type = IdType.AUTO)
    private Integer questionId;

    @ApiModelProperty(value = "回答问题的用户")
    private Integer userId;

    @ApiModelProperty(value = "问题标题")
    private String questionTitle;

    @ApiModelProperty(value = "问题详细描述")
    private String questionDetail;

    @ApiModelProperty(value = "问题创建时间")
    private Date createTime;

    @ApiModelProperty(value = "最后修改时间")
    private Date modifyTime;


}
