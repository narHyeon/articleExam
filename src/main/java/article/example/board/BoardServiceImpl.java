package article.example.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService{
    @Autowired
    BoardDAO dao;

    public BoardVO getBoard(BoardVO vo) {
        return dao.getBoard(vo);
    }
}
