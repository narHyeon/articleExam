package article.example.board;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public BoardVO getBoard(BoardVO vo) {
        System.out.println("데이터베이스 테스트");
        return sqlSessionTemplate.selectOne("BoardDAO.getBoard", vo);
    }
}
