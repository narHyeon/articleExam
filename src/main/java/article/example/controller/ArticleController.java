package article.example.controller;

import article.example.board.BoardService;
import article.example.board.common.ArticleVO;
import article.example.board.common.CommandMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class ArticleController {

//    private final Logger log =  Logger.getLogger();

    @Resource(name="boardService")
    private BoardService boardService;

    @RequestMapping(value="/testInterceptor.do")
    public ModelAndView testInterceptor(Map<String, Object> commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("");
//        log.debug("인터셉터 테스트");

        return mv;
    }

    @RequestMapping(value="/sample/openBoardList.do")
    public ModelAndView openBoardList(Map<String, Object> commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("/sample/boardList");

        List<Map<String,Object>> list = boardService.selectBoardList(commandMap);
        mv.addObject("list", list);

        return mv;
    }

    @RequestMapping(value="/sample/openBoardWrite.do")
    public ModelAndView openBoardWrite(CommandMap commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("/sample/boardWrite");

        return mv;
    }

    @RequestMapping(value="/sample/writeBoard.do")
    public ModelAndView writeBoard(ArticleVO vo,CommandMap commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("redirect:/sample/openBoardList.do");
        commandMap.put("TITLE",vo.getTITLE());
        commandMap.put("CONTENTS",vo.getCONTENTS());
        boardService.writeBoard(commandMap.getMap());

        return mv;
    }
}
