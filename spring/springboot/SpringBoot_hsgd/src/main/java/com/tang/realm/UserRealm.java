package com.tang.realm;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.tang.entity.Permission;
import com.tang.entity.Role;
import com.tang.entity.test1.User;
import com.tang.mapper.PermissionMapper;
import com.tang.mapper.RoleMapper;
import com.tang.mapper.UserMapper;

/**
 * 角色权限控制
 * 
 * @author Administrator
 * @date 2019年5月22日
 */
public class UserRealm extends AuthorizingRealm {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private RoleMapper roleMapper;
	@Autowired
	private PermissionMapper permissionMapper;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// 这里做权限控制
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		String loginname = (String) principals.getPrimaryPrincipal();
		Wrapper<User> userWrapper = new EntityWrapper<>();
		userWrapper.eq("loginname", loginname);
		User user = userMapper.selectList(userWrapper).get(0);
		// 添加角色
		Integer roleId = user.getRoleId();
		Role role = roleMapper.selectById(roleId);
		info.addRole(role.getRoleName());
		// 添加权限
		Wrapper<Permission> wrapper = new EntityWrapper<Permission>();
		wrapper.eq("role_id", role.getId());
		List<Permission> perList = permissionMapper.selectList(wrapper);
		List<String> permissionNameList = new ArrayList<String>();
		perList.forEach(perssion -> {
			permissionNameList.add(perssion.getPername());
		});
		info.addStringPermissions(permissionNameList);
		System.out.println("权限控制");
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// 这里做登录控制
		AuthenticationInfo info;
		String loginname = (String) token.getPrincipal();
		Wrapper<User> wrapper = new EntityWrapper<User>();
		wrapper.eq("loginname", loginname);
		List<User> list = userMapper.selectList(wrapper);
		if (list != null && list.size() > 0) {
			info = new SimpleAuthenticationInfo(loginname, list.get(0).getPassword(), list.get(0).getRealname());
			return info;
		}
		return null;
	}
}
