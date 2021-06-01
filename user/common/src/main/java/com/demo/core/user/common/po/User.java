package com.demo.core.user.common.po;

import com.demo.ibatx.core.annotation.*;
import com.demo.sdk.page.Page;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.ToString;

/**
 * 用户表
 * 
 * @author system
 * @date 2021-06-01T13:33:21.799
 */
@Data
@ToString
@Table(name = "user")
public class User extends Page implements Serializable {
    private static final long serialVersionUID = -1404226781184L;

    /**
     * 主键ID
     */
    @Id()
    private Integer id;

    /**
     * 用户类型 0-未知 1-管理员 2-用户
     */
    private Byte type;

    /**
     *  性别 0-未知 1-男 2-女
     */
    private Byte sex;

    /**
     * 中文名
     */
    private String cnName;

    /**
     * 英文名
     */
    private String enName;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * 出生年月
     */
    private Date birDate;

    /**
     * 头像
     */
    private String portrait;

    /**
     * 扩展字段
     */
    private String attach;

    /**
     * 是否删除 0-未删除 1-已删除
     */
    @LogicDelete()
    private Byte isDel;

    /**
     * 创建人姓名
     */
    private String creator;

    /**
     * 修改人姓名
     */
    private String updater;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最近一次修改时间
     */
    private Date updateTime;

    /**
     * 数据版本号
     */
    @Version()
    private Integer versions;

    public static final String ID = "id";

    public static final String TYPE = "type";

    public static final String SEX = "sex";

    public static final String CN_NAME = "cnName";

    public static final String EN_NAME = "enName";

    public static final String PHONE = "phone";

    public static final String EMAIL = "email";

    public static final String BIR_DATE = "birDate";

    public static final String PORTRAIT = "portrait";

    public static final String ATTACH = "attach";

    public static final String IS_DEL = "isDel";

    public static final String CREATOR = "creator";

    public static final String UPDATER = "updater";

    public static final String CREATE_TIME = "createTime";

    public static final String UPDATE_TIME = "updateTime";

    public static final String VERSIONS = "versions";
}