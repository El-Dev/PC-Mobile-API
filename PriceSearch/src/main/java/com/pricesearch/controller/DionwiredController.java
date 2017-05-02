package com.pricesearch.controller;

/**
 * Created by Reverside on 11/Apr/17.
 */

import com.pricesearch.entity.Dionwired;
import com.pricesearch.service.DionwiredService;
import org.apache.tomcat.util.buf.UEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.logging.Logger;

@CrossOrigin
@Controller
@RequestMapping(value = "/dionwired")
public class DionwiredController {
    @Autowired
    private DionwiredService dionwiredService;

    private static final Logger LOGGER = Logger.getLogger(DionwiredController.class.getName());

    @RequestMapping(value = "/{search}", method = RequestMethod.GET)
    public ResponseEntity<List<Dionwired>> getGameSearches(@PathVariable String search) throws Exception{

        List<Dionwired> searchList = dionwiredService.getDionwiredResults(search);

        if(searchList != null) {
            return new ResponseEntity<>(searchList, HttpStatus.OK);
        }else{
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "games/{page}", method = RequestMethod.GET)
    public ResponseEntity<List<Dionwired>> getGames(@PathVariable String page) throws Exception{

        List<Dionwired> searchList = dionwiredService.getDionwiredGames(page);

        if(searchList != null) {
            return new ResponseEntity<>(searchList, HttpStatus.OK);
        }else{
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "computers/{page}", method = RequestMethod.GET)
    public ResponseEntity<List<Dionwired>> getComp(@PathVariable String page) throws Exception{

        List<Dionwired> searchList = dionwiredService.getDionwiredComputers(page);

        if(searchList != null) {
            return new ResponseEntity<>(searchList, HttpStatus.OK);
        }else{
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "tablets/{page}", method = RequestMethod.GET)
    public ResponseEntity<List<Dionwired>> getTablets(@PathVariable String page) throws Exception{

        List<Dionwired> searchList = dionwiredService.getDionwiredTablets(page);

        if(searchList != null) {
            return new ResponseEntity<>(searchList, HttpStatus.OK);
        }else{
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "audio/{page}", method = RequestMethod.GET)
    public ResponseEntity<List<Dionwired>> getAudio(@PathVariable String page) throws Exception{

        List<Dionwired> searchList = dionwiredService.getDionwiredAudio(page);

        if(searchList != null) {
            return new ResponseEntity<>(searchList, HttpStatus.OK);
        }else{
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "cellphones/{page}", method = RequestMethod.GET)
    public ResponseEntity<List<Dionwired>> getCellphones(@PathVariable String page) throws Exception{

        List<Dionwired> searchList = dionwiredService.getDionwiredCellphones(page);

        if(searchList != null) {
            return new ResponseEntity<>(searchList, HttpStatus.OK);
        }else{
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "details/{link}", method = RequestMethod.GET)
    public ResponseEntity<List<String>> getDetails(@PathVariable String link) throws Exception{
        LOGGER.info("This is the sent URL: "+link);
        List<String> searchList = dionwiredService.getDionwiredDetails(link);

        if(searchList != null) {
            return new ResponseEntity<>(searchList, HttpStatus.OK);
        }else{
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
