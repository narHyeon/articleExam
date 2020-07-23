package article.example.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("boardService")
public class BoardServiceImpl implements BoardService{

    @Autowired
    BoardDaoEx dao;

    public BoardVO getBoard(BoardVO vo) {
        return dao.getBoard(vo);
    }

    public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception {
        return dao.selectBoardList(map);
    }

    public void writeBoard(Map<String, Object> map) throws Exception {
        dao.writeBoard(map);
    }
}
