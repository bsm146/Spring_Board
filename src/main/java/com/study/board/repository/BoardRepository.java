package com.study.board.repository;

import com.study.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Integer> {

//    @Query(value = "SELECT b FROM Board b WHERE b.id = 23")
    @Query(value = "SELECT * FROM board WHERE id = 23", nativeQuery = true)
    List<Board> findByFive();


    @Query(value = "SELECT * FROM board LIMIT :index1, :index2", nativeQuery = true)
    List<Board> findByFive2(@Param("index1") int index1,
                            @Param("index2") int index2);


}