package org.hdcd.service;

import org.hdcd.domain.Board;
import org.hdcd.repository.BoardRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

	private final BoardRepository repository;
	
	@Override
	public void register(Board board) throws Exception {
		repository.save(board);
	}
}
