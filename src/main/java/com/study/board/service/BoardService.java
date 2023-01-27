package com.study.board.service;

import com.study.board.entity.Board;
import com.study.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    // 글 작성 처리
    public void write(Board board) {

        boardRepository.save(board);
    }

    // 게시글 리스트 처리
    public List<Board> boardList() {

        return boardRepository.findAll();
    }

    // 페이징
    public Page<Board> boardList2(Pageable pageable) {

        return boardRepository.findAll(pageable);
    }

    // 특정 게시글 불러오기
    public Board boardView(Integer id) {

        return boardRepository.findById(id).get();
    }

    // 특정 게시글 삭제하기
    public void boardDelete(Integer id) {

        boardRepository.deleteById(id);
    }

    // 게시글 리스트 처리
//    public List<Board> boardListFive() {
    public List<Board> boardListFive() {


//        return boardRepository.findByFive();
//        return boardRepository.findByFive2(2, 4);
        return boardRepository.findByFive();
    }
}
