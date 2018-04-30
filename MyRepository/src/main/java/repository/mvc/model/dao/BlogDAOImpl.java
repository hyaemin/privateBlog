package repository.mvc.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BlogDAOImpl implements BlogDAO {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public String login() {
		// TODO Auto-generated method stub
		
		return sqlSession.selectOne("WriteMapper.test");
	}

	@Override
	public void insertPost() {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectAllPost() {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectOnePost() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePost() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePost() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchByCategory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchByDivision() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchByKeyword() {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertCategory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectCategory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCategory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCategory() {
		// TODO Auto-generated method stub

	}

}
