package com.work.leavemanagement.controllers;

import com.work.leavemanagement.dto.SearchDto;
import com.work.leavemanagement.entities.Leave;
import com.work.leavemanagement.services.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private LeaveService leaveService;

    @GetMapping
    public @ResponseBody List<Leave> search(@RequestBody SearchDto searchDto){
        return leaveService.search(searchDto);
    }
}
