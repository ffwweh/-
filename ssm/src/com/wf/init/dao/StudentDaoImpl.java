package com.wf.init.dao;


import java.util.List;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import com.wf.init.pojo.Yy;


public class StudentDaoImpl implements IStuDao {

	// ������־����
	private static Logger log = Logger.getLogger(StudentDaoImpl.class);

	// ����mybatis�������ݿ�ĻỰ����
	private SqlSessionTemplate sqlSessionTemplate;

	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}


	@Override
	public List queryPhoneDatas() {
		// TODO Auto-generated method stub
		log.info("StudentDaoImpl  is   queryPhoneDatas  start...");

		List<Yy> lists = null;
		try {

			lists = this.sqlSessionTemplate
					.selectList("yydao.queryPhoneData");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return lists;
	}
}
