package com.pricesearch.controller;

import com.pricesearch.entity.Game;
import com.pricesearch.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Reverside on 10/Apr/17.
 */
@CrossOrigin
@Controller
@RequestMapping(value = "/game")
public class GameController {
    @Autowired
    private GameService gameService;

    @RequestMapping(value = "/{search}", method = RequestMethod.GET)
    public ResponseEntity<List<Game>> getGameSearches(@PathVariable String search) throws Exception{

        List<Game> searchList = gameService.getGameResults(search);

        if(searchList != null) {
            return new ResponseEntity<>(searchList, HttpStatus.OK);
        }else{
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "games/{page}", method = RequestMethod.GET)
    public ResponseEntity<List<Game>> getGames(@PathVariable String page) throws Exception{

        List<Game> searchList = gameService.getGameGames(page);

        if(searchList != null) {
            return new ResponseEntity<>(searchList, HttpStatus.OK);
        }else{
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "computers/{page}", method = RequestMethod.GET)
    public ResponseEntity<List<Game>> getComputers (@PathVariable String page) throws Exception{

        List<Game> searchList = gameService.getGameComputers(page);

        if(searchList != null) {
            return new ResponseEntity<>(searchList, HttpStatus.OK);
        }else{
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "cameras/{page}", method = RequestMethod.GET)
    public ResponseEntity<List<Game>> getCameras(@PathVariable String page) throws Exception{

        List<Game> searchList = gameService.getGameCameras(page);

        if(searchList != null) {
            return new ResponseEntity<>(searchList, HttpStatus.OK);
        }else{
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "cellphones/{page}", method = RequestMethod.GET)
    public ResponseEntity<List<Game>> getCellphones(@PathVariable String page) throws Exception{

        List<Game> searchList = gameService.getGameCellphones(page);

        if(searchList != null) {
            return new ResponseEntity<>(searchList, HttpStatus.OK);
        }else{
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "audio/{page}", method = RequestMethod.GET)
    public ResponseEntity<List<Game>> getAudio(@PathVariable String page) throws Exception{

        List<Game> searchList = gameService.getGameAudio(page);

        if(searchList != null) {
            return new ResponseEntity<>(searchList, HttpStatus.OK);
        }else{
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
