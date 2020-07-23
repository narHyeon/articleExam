package article.example.controller;

import article.example.board.BoardDAO;
import article.example.board.BoardService;
import article.example.board.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ArticleController {

    @Autowired
    BoardService dao;

    @RequestMapping("/test.do")
    public ModelAndView test(BoardVO vo){
        System.out.println(vo.getWriter());
        vo.setSeq(0);
        vo = dao.getBoard(vo);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/test2");
        mav.addObject("vo",vo);
        return mav;
    }
}
