package com.spring.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.spring.command.PageMaker;
import com.spring.dto.MemberVO;

public class SearchMemberDAOImpl extends MemberDAOImpl
                                 implements SearchMemberDAO{

	private SqlSession sqlSession;
	public void setSqlSession(SqlSession session) {
		this.sqlSession = session;
	}
	@Override
	public List<MemberVO> selectSearchMemberList(PageMaker pageMaker) throws SQLException {
		int offset = pageMaker.getStartRow(); //offset 어디서부터 어디까지
		int limit = pageMaker.getPerPageNum();
		RowBounds rows = new RowBounds(offset,limit);	
		List<MemberVO> memberList
		= sqlSession.selectList("Member-Mapper.selectSearchMemberList",pageMaker, rows);
		return memberList;
	}

}
