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
@ApiModel(value="Answer对象", description="")
public class Answer implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "回答id")
    @TableId(value = "answer_id", type = IdType.AUTO)
    private Integer answerId;

    @ApiModelProperty(value = "用户id")
    private Integer userId;

    @ApiModelProperty(value = "回答的问题id")
    private Integer questionId;

    @ApiModelProperty(value = "回答的内容（html形式）")
    private String answerContent;

    @ApiModelProperty(value = "回答内容的text形式")
    private String answerText;

    @ApiModelProperty(value = "点赞数")
    private Integer like;

    @ApiModelProperty(value = "评论数")
    private Integer commentNum;

    @ApiModelProperty(value = "收藏数")
    private Integer collectNum;

    @ApiModelProperty(value = "新建时间")
    private Date createTime;

    @ApiModelProperty(value = "最后修改时间")
    private Date modifyTime;


}
