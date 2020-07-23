package article.example.board;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class BoardDaoEx extends BoardDAO{
    @SuppressWarnings("unchecked")
    public List<Map<String, Object>> selectBoardList(Map<String, Object> map) {

        return (List<Map<String,Object>>)selectList("sample.selectBoardList", map);
    }
}
