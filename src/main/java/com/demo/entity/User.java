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
@ApiModel(value="User对象", description="")
public class User implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "用户id，主键")
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    @ApiModelProperty(value = "用户昵称，不同用户的昵称可以相同")
    private String nickname;

    @ApiModelProperty(value = "手机号码,登陆凭证")
    private String phoneNum;

    @ApiModelProperty(value = "头像图片url")
    private String avatarUrl;

    @ApiModelProperty(value = "所在城市id")
    private Integer cityId;

    @ApiModelProperty(value = "行业id")
    private Integer industryId;

    @ApiModelProperty(value = "个性签名")
    private String signature;

    @ApiModelProperty(value = "男为1，女为0")
    private Integer sex;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "粉丝数")
    private Integer fansNum;

    @ApiModelProperty(value = "是否已登录")
    private Boolean isLogin;

    @ApiModelProperty(value = "编写回答数")
    private Integer answerNum;


}
