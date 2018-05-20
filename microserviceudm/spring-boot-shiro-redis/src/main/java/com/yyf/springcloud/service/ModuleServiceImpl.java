package com.yyf.springcloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yyf.springcloud.domain.ModuleInfo;
import com.yyf.springcloud.mapper.ModuleMapper;

@Service
public class ModuleServiceImpl implements ModuleService{
	@Autowired
	private ModuleMapper moduleMapper;

	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	public List<ModuleInfo> findModuleByUserId(int userId) {
		return moduleMapper.findModuleByUserId(userId);
	}
}
