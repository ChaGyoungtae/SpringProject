package org.hdcd.controller;

import org.hdcd.domain.Board;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@GetMapping("/register")
	public void registerForm(Board board, Model model) throws Exception {
		
	}
}
