package net.sigmalab.jspart.dao.jpa;

import org.springframework.transaction.annotation.Transactional;

import net.sigmalab.jspart.dao.ICommentDAO;
import net.sigmalab.jspart.model.Comment;

@Transactional
public class CommentDAO extends DAO<Comment,Long> implements ICommentDAO{
	
	public CommentDAO(){
		super(Comment.class);
	}
}
