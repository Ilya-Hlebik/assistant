package com.web.assistant.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.web.assistant.dbo.User;
import com.web.assistant.dto.AbstractRequestDTO;
import com.web.assistant.enumerated.Status;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WorkerRequestDTO extends AbstractRequestDTO {
    private String name;
    private String sureName;
    private List<PositionRequestDto> position;
    private List<TechnologyRequestDto> technologies;
    private List<SkillRequestDto> skills;
    private Status status;
    private String photo;
    @JsonIgnore
    private User user;
}
