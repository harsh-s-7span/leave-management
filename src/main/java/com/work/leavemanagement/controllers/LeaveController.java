package com.work.leavemanagement.controllers;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.work.leavemanagement.dto.TestLeaveDto;
import com.work.leavemanagement.entities.Leave;
import com.work.leavemanagement.mapper.LeaveMapper;
import com.work.leavemanagement.request.LeaveRequest;
import com.work.leavemanagement.response.LeaveResponse;
import com.work.leavemanagement.services.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/leave")
public class LeaveController {

    @Autowired
    private LeaveService leaveService;

    public LeaveMapper leaveMapper;

    @PostMapping
    public String save(@Validated @RequestBody LeaveRequest leaveRequest){
        return leaveService.save(leaveRequest);
    }

    @GetMapping
    public List<Leave> getAll(){
        return leaveService.getAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody LeaveResponse getById(@PathVariable Long id){
        return leaveService.findById(id);
    }

    @PutMapping
    public boolean update(@Validated @RequestBody LeaveRequest leaveRequest){
        return leaveService.update(leaveRequest);
    }

    @DeleteMapping("/{uuid}")
    public void deleteById(@PathVariable UUID uuid){
        leaveService.deleteById(uuid);
    }
}
