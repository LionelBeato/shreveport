package com.tts.swaggerpractice.controller;

import com.tts.swaggerpractice.model.Item;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Api(value = "menuItems", description = "Operations pertaining to Menu Items" )
@RestController
public class ItemController {

    @ApiResponses( value = {
            @ApiResponse(code = 200, message = "Successfully retrieved menu item"),
            @ApiResponse(code = 401, message = "You are not authorized to view the menu item")
    })
    @ApiOperation(value = "Get all menu items", response = Item.class,
    responseContainer = "List")
    @GetMapping("/item/all")
    public ResponseEntity<List<Item>> getAllItems() {
        return new ResponseEntity<>(new ArrayList<Item>(), HttpStatus.OK);
    }

}
