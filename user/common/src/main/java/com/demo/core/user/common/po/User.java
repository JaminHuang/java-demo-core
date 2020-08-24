package com.demo.core.user.common.po;

import com.db.ibatx.core.annotation.*;
import com.demo.sdk.page.Page;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.ToString;

/**
 * Users and global privileges
 * 
 * @author system
 * @date 2020-08-24T15:33:26.517
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
     * 性别 0未知 1男 2女
     */
    private Byte sex;

    /**
     * 中文名
     */
    private String cnName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 密码
     */
    private String password;

    /**
     * 出生日期
     */
    private Date birDate;

    /**
     * 头像
     */
    private String portrait;

    /**
     * 是否启用  0代表不可用  默认1可用
     */
    private Byte isUse;

    /**
     * 是否删除  0代表可用  未删除  1代表已删除 不可用 默认0
     */
    @LogicDelete()
    private Byte isDel;

    /**
     * 拓展信息
     */
    private String attach;

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
     * 最近登录时间
     */
    private Date lastLoginTime;

    /**
     * 数据版本号
     */
    @Version()
    private Integer versions;

    public static final String ID = "id";

    public static final String SEX = "sex";

    public static final String CN_NAME = "cnName";

    public static final String PHONE = "phone";

    public static final String PASSWORD = "password";

    public static final String BIR_DATE = "birDate";

    public static final String PORTRAIT = "portrait";

    public static final String IS_USE = "isUse";

    public static final String IS_DEL = "isDel";

    public static final String ATTACH = "attach";

    public static final String CREATOR = "creator";

    public static final String UPDATER = "updater";

    public static final String CREATE_TIME = "createTime";

    public static final String UPDATE_TIME = "updateTime";

    public static final String LAST_LOGIN_TIME = "lastLoginTime";

    public static final String VERSIONS = "versions";
}