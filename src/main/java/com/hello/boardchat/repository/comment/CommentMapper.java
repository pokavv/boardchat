package com.hello.boardchat.repository.comment;

import com.hello.boardchat.domain.Comment;
import com.hello.boardchat.dto.CommentUpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface CommentMapper {

    int countComment(Comment comment);

    List<Comment> commentList(CommentSearchCond cond);

    void insertComment(Comment comment);

    void updateComment(@Param("commentId") Long commentId,
                       @Param("updateParam") CommentUpdateDto updateParam);

    void deleteComment(Long commentId);
}
