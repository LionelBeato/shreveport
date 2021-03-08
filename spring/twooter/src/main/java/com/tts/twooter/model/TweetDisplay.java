package com.tts.twooter.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TweetDisplay {

    private User user;
    private String message;
    private String date;
    private List<Tag> tags;

}
