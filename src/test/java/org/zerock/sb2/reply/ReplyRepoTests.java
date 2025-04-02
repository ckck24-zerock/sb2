package org.zerock.sb2.reply;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.sb2.board.entities.BoardEntity;
import org.zerock.sb2.reply.entities.ReplyEntity;
import org.zerock.sb2.reply.repository.ReplyRepository;

import lombok.extern.log4j.Log4j2;



@SpringBootTest
@Log4j2
public class ReplyRepoTests {
  
  @Autowired(required = false)
  private ReplyRepository repository;

  @Test
  public void testInsert() {

    for(int i = 0; i < 25; i++){
      //가짜 BoardEntity 필요 
      BoardEntity board = BoardEntity.builder().bno(123L).build();

      ReplyEntity replyEntity = ReplyEntity.builder()
      .replyText("댓글입니다. 댓글입니다.")
      .replyer("user00")
      .board(board)
      .build();

      repository.save(replyEntity);
    }//end for

  }

  @Test
  public void testRead(){

    Long rno = 1L;

    Optional<ReplyEntity> result = repository.findById(rno);

    ReplyEntity reply = result.orElseThrow();

    log.info(reply);

  }


}
