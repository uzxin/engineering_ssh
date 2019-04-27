package com.dao;

import com.domain.Admin;;

public interface AdminDao {
	//查找管理员
	Admin getAdminByUsername(String username);
}
