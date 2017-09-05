package com.wf.init.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.alibaba.fastjson.JSONArray;
import com.wf.init.pojo.Yy;
import com.wf.init.service.IStudent;

public class PageInitAction {

	// 声明日志对象
	private static Logger log = Logger.getLogger(PageInitAction.class);

	// 声明接口对象
	private IStudent student;

	public void setStudent(IStudent student) {

		this.student = student;

	}

	public String queryDatas() {
		log.info("PageInitAction  is  queryDatas  start...");

		List<Yy> lists = this.student.queryPhoneDatas();

		String jsonArray = JSONArray.toJSONString(lists);

		log.info(jsonArray);
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("UTF-8");
		PrintWriter pw =null;
		try {
			pw = response.getWriter();
			pw.print(jsonArray);
			pw.flush();
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	


		return null;
	}



}
