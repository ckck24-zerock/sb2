package org.zerock.sb2.reply.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.zerock.sb2.reply.entities.ReplyEntity;

public interface ReplyRepository extends JpaRepository<ReplyEntity, Long>{
  

  Page<ReplyEntity> listOfBoard(@Param("bno") Long bno, Pageable pageable );

}
