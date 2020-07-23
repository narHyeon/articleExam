package article.example.board;

import java.util.List;
import java.util.Map;

public interface BoardService {
    BoardVO getBoard(BoardVO vo);
    List<Map<String,Object>> selectBoardList(Map<String,Object> map) throws Exception;

}
