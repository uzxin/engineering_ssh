package com.service.impl;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.dao.TestDao;
import com.domain.Student;
import com.service.TestService;

@Transactional(isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,readOnly=true)
public class TestServiceImpl implements TestService{
	private TestDao ud;
	
	public Student getUserByUsernamePassword(Student user) {
			//1 根据登陆名称查询登陆用户
			Student existU = ud.getUserByUsername(user.getUsername());
			//2 判断用户是否存在.不存在=>抛出异常,提示用户名不存在
			if(existU==null){
				throw new RuntimeException("用户名不存在!");
			}
			//3 判断用户密码是否正确=>不正确=>抛出异常,提示密码错误
			if(!existU.getPassword().equals(user.getPassword())){
				throw new RuntimeException("密码错误!");
			}
			//4 返回查询到的用户对象
		return existU;
	}

	
	@Transactional(isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,readOnly=false)
	public void saveUser(Student u) {
		ud.save(u);
	}

	public void setUd(TestDao ud) {
		this.ud = ud;
	}

}
