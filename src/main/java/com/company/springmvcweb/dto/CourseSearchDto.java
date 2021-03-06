package com.company.springmvcweb.dto;

import com.company.springmvcweb.data.Industry;
import com.company.springmvcweb.data.Level;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CourseSearchDto {
    @JsonProperty("industry")
    private Industry industry;

    @JsonProperty("level")
    private Level level;


}
