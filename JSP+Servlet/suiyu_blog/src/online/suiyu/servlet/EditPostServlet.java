package online.suiyu.servlet;

import online.suiyu.domain.Astate;
import online.suiyu.domain.Classify;
import online.suiyu.service.AstateService;
import online.suiyu.service.impl.AstateServiceImpl;
import online.suiyu.service.impl.ClassifyServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/admin/post/edit"})
public class EditPostServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        List<Astate> astate = new AstateServiceImpl().getAllState();
        req.setAttribute("state", astate);
        List<Classify> classifies = new ClassifyServiceImpl().getAllClassify();
        req.setAttribute("classify", classifies);
//        req.setAttribute();
        req.getRequestDispatcher("/admin/edit-article.jsp").forward(req, resp);
    }
}
