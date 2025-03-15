package me.dimitri.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserScoreEpisode {

    private long id;
    private long episodeId;
    private long userId;
    private boolean liked;

}
