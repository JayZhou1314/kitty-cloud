package com.cxytiandi.kittycloud.comment.biz.param;

import lombok.Data;

/**
 * 评论回复报错参数
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2020-02-13 20:44:04
 */
@Data
public class CommentReplySaveParam {

    /**
     * 评论ID
     */
    private String commentId;

    /**
     * 回复内容
     */
    private String content;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 回复引用的用户ID
     */
    private Long replayRefUserId;


}