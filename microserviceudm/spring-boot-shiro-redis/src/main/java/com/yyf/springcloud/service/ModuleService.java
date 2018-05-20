package com.yyf.springcloud.service;

import java.util.List;

import com.yyf.springcloud.domain.ModuleInfo;

public interface ModuleService {
	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	List<ModuleInfo> findModuleByUserId(int userId);
}
