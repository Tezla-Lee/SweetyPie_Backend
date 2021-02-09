package com.mip.sharebnb.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReviewDto {

    @Positive
    private long memberId;

    @Positive
    private long accommodationId;

    @Min(0)
    @Max(5)
    private float rating;

    @NotEmpty
    private String content;
}