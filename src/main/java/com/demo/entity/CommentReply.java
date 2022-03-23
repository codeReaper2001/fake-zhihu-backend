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
@ApiModel(value="CommentReply对象", description="")
public class CommentReply implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "评论回复id")
    @TableId(value = "cm_reply_id", type = IdType.AUTO)
    private Integer cmReplyId;

    @ApiModelProperty(value = "评论id")
    private Integer commentId;

    @ApiModelProperty(value = "回复发起用户")
    private Integer userFrom;

    @ApiModelProperty(value = "要回复的用户")
    private Integer userTo;

    @ApiModelProperty(value = "回复内容")
    private String cmReplyContent;

    @ApiModelProperty(value = "回复时间")
    private Date createTime;


}
