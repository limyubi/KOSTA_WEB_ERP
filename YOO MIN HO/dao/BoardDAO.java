package dao;

import java.util.List;

import vo.Board;
import vo.BoardComment;

public interface BoardDAO {
	
	int getPageNum();
	
	void insertBoard(Board b);
	
	void insertBoardComment(BoardComment bc);
	
	List<Board> selectBoardAll();
	
	Board selectBoard(Board b); // 댓글을 같이 불러오기?
	
	void updateBoard(Board b);
	
	void updateBoardComment(BoardComment bc);
	
	void deleteBoard(int no);
	
	void deleteBoardComment(int no); // 현재글번호도 필요한지 모르겠음
}
