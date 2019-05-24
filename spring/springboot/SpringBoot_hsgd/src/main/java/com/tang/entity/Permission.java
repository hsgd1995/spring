package com.tang.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * mybatis-plus代码生成工具测试类-权限
 * </p>
 *
 * @author tang
 * @since 2019-05-22
 */
public class Permission extends Model<Permission> {

	private static final long serialVersionUID = 1L;

	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	private String pername;
	@TableField("role_id")
	private Integer roleId;

	public Integer getId() {
		return id;
	}

	public Permission setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getPername() {
		return pername;
	}

	public Permission setPername(String pername) {
		this.pername = pername;
		return this;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public Permission setRoleId(Integer roleId) {
		this.roleId = roleId;
		return this;
	}

	public static final String ID = "id";

	public static final String PERNAME = "pername";

	public static final String ROLE_ID = "role_id";

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Permission{" + ", id=" + id + ", pername=" + pername + ", roleId=" + roleId + "}";
	}
}
