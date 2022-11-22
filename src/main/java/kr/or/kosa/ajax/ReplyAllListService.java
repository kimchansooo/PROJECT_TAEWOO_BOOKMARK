package kr.or.kosa.ajax;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosa.dao.BookMarkDao;
import kr.or.kosa.dto.Blog_Board;
import kr.or.kosa.dto.ReplyInterface;
import kr.or.kosa.utils.DaoFactory;

@WebServlet("/ReplyAll")
public class ReplyAllListService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ReplyAllListService() {
    }
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<ReplyInterface> list = null;
//		BookMarkDao dao = null;
		try {
			//request에 type이라는 이름으로 블로그/책 댓글 구분됨
//			if() {
//				dao = new DaoFactory().getDao(""); //dao 팩토리. 이름만 넣으면 됨
//				list = dao.get...();
//			} else {
//				dao = new DaoFactory().getDao(""); //dao 팩토리. 이름만 넣으면 됨
//				list = dao.get...();
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//댓글 리스트를 dao로 받아서 저장
		request.setAttribute("replylist", list);

		//forward 작업?
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
}