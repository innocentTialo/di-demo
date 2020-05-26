package com.ddf.mainteam.examplebeans;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by InnocentTIALO on 5/25/2020.
 */
@Getter
@Setter
@Builder
public class FakeDataSource {
    private String username;
    private String password;
    private String url;
}
