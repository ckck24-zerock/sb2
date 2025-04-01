package org.zerock.sb2.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.sb2.board.dto.PageRequestDTO;

import lombok.extern.log4j.Log4j2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
@RequestMapping("/board")
@Log4j2
public class BoardController {

  @GetMapping("list")
  public void list( @ModelAttribute("requestDTO") PageRequestDTO requestDTO ) {
  
    log.info("Board list............");

  }
  
  
}
