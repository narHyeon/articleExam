package article.example.board;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public abstract class BoardDAO {
    protected Log log = LogFactory.getLog(BoardDAO.class);

    @Autowired
    private SqlSessionTemplate sqlSession;

    // 테스트
    public BoardVO getBoard(BoardVO vo) {
        System.out.println("데이터베이스 테스트");
        return sqlSession.selectOne("BoardDAO.getBoard",vo);
    }

    protected void printQueryId(String queryId) {
        if(log.isDebugEnabled()){
            log.debug("\t QueryId  \t:  " + queryId);
        }
    }

    public Object insert(String queryId, Object params){
        printQueryId(queryId);
        Map<String,Object> map =  (Map) params;
        System.out.println(map.get("TITLE"));
        System.out.println(map.get("CONTENTS"));
        return sqlSession.insert(queryId, params);
    }

    public Object update(String queryId, Object params){
        printQueryId(queryId);
        return sqlSession.update(queryId, params);
    }

    public Object delete(String queryId, Object params){
        printQueryId(queryId);
        return sqlSession.delete(queryId, params);
    }

    public Object selectOne(String queryId){
        printQueryId(queryId);
        return sqlSession.selectOne(queryId);
    }

    public Object selectOne(String queryId, Object params){
        printQueryId(queryId);
        return sqlSession.selectOne(queryId, params);
    }

    @SuppressWarnings("rawtypes") // 경고 억제
    public List selectList(String queryId){
        printQueryId(queryId);
        return sqlSession.selectList(queryId);
    }

    @SuppressWarnings("rawtypes")
    public List selectList(String queryId, Object params){
        printQueryId(queryId);
        return sqlSession.selectList(queryId,params);
    }
}
