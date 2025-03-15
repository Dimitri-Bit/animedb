package me.dimitri.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Anime {

    private long id;
    private String name;
    private String description;
    private LocalDate airDate;
    private LocalDate endDate;
    private String type;
    private boolean dub;

}
