package article.example.board;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDAO {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    // 테스트
    public BoardVO getBoard(BoardVO vo) {
        System.out.println("데이터베이스 테스트");
        return sqlSessionTemplate.selectOne("BoardDAO.getBoard",vo);
    }

    // 게시물 목록 조회
    public List<BoardVO> getBoardList(BoardVO vo) {
        System.out.println("보드 리스트 나열");
        return sqlSessionTemplate.
    }
}
