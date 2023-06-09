package com.ssafy.b102.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.b102.request.dto.GameRequestDto;
import com.ssafy.b102.response.dto.GameResponseDto;
import com.ssafy.b102.response.dto.MatchingResponseDto;
import com.ssafy.b102.response.dto.UserGamesResponseDto;
import com.ssafy.b102.response.dto.WinRate;
import com.ssafy.b102.service.GameService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class GameController {
	
	@Autowired
	public GameService gameService;

	@GetMapping("/games/all/{nickname}")
	public ResponseEntity<?> getUserGamesAll(@PathVariable String nickname){
		UserGamesResponseDto userGamesResponseDtos = gameService.getUserGames(nickname, 0);
		return new ResponseEntity<UserGamesResponseDto>(userGamesResponseDtos, HttpStatus.OK);
	}
	
	@GetMapping("/games/online/{nickname}")
	public ResponseEntity<?> getUserGamesOnline(@PathVariable String nickname){
		UserGamesResponseDto userGamesResponseDtos = gameService.getUserGames(nickname, 1);
		return new ResponseEntity<UserGamesResponseDto>(userGamesResponseDtos, HttpStatus.OK);
	}
	
	@GetMapping("/games/offline/{nickname}")
	public ResponseEntity<?> getUserGames(@PathVariable String nickname){
		UserGamesResponseDto userGamesResponseDtos = gameService.getUserGames(nickname, 2);
		return new ResponseEntity<UserGamesResponseDto>(userGamesResponseDtos, HttpStatus.OK);
	}
	
	@PostMapping("/game")
	public ResponseEntity<?> createGame(@RequestBody GameRequestDto gameRequestDto){
		GameResponseDto gameResponseDto = gameService.createGame(gameRequestDto);
		return new ResponseEntity<GameResponseDto>(gameResponseDto, HttpStatus.OK);
	}
	
	@GetMapping("/matching/{pinNumber}")
	public ResponseEntity<?> getMatchingProfile(@PathVariable Integer pinNumber){
		MatchingResponseDto matchingResponseDto = gameService.getMatchingProfile(pinNumber);
		return new ResponseEntity<MatchingResponseDto>(matchingResponseDto, HttpStatus.OK);
	}
	
}

