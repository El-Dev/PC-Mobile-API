package com.pricesearch.controller;

import com.pricesearch.entity.CaCell;
import com.pricesearch.entity.Game;
import com.pricesearch.service.CaCellService;
import com.pricesearch.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Reverside on 29/Mar/17.
 */
@CrossOrigin
@Controller
@RequestMapping(value = "/cacell")
public class CaCellController {
    @Autowired
    private CaCellService caCellService;

    @RequestMapping(value = "/{search}", method = RequestMethod.GET)
    public ResponseEntity<List<CaCell>> getCaCellSearches(@PathVariable String search) throws Exception{

        List<CaCell> searchList = caCellService.getCaCellResults(search);;

        if(searchList != null) {
            return new ResponseEntity<>(searchList, HttpStatus.OK);
        }else{
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
