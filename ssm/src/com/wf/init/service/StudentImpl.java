package com.wf.init.service;

import java.util.List;

import org.apache.log4j.Logger;


import com.wf.init.dao.IStuDao;

public class StudentImpl implements IStudent{
	
	// 声明日志对象
	private static Logger log = Logger.getLogger(StudentImpl.class);
	
	private IStuDao  sdao;
	
	public void  setSdao(IStuDao  sdao)
	{
		this.sdao=sdao;
	}

	@Override
	public List queryPhoneDatas() {
		// TODO Auto-generated method stub
		log.info("ServiceImpl  is  queryPhoneDatas  start..");
		return this.sdao.queryPhoneDatas();
	}

	

}
