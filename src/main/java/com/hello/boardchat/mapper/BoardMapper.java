package com.hello.boardchat.mapper;

import com.hello.boardchat.domain.Board;
import com.hello.boardchat.dto.BoardUpdateDto;
import com.hello.boardchat.repository.BoardSearchCond;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface BoardMapper {

    void save(Board board);

    void update(@Param("boardId") Long boardId,
                @Param("updateParam") BoardUpdateDto updateParam);

    Optional<Board> findById(Long boardId);

    List<Board> findAll(BoardSearchCond cond);

    void delete(Long boardId);
}
