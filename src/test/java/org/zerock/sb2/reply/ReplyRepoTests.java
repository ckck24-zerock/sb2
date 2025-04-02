package org.zerock.sb2.reply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.sb2.reply.repository.ReplyRepository;

import lombok.extern.log4j.Log4j2;



@SpringBootTest
@Log4j2
public class ReplyRepoTests {
  
  @Autowired(required = false)
  private ReplyRepository repository;

}
