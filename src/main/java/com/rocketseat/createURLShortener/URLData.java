package com.rocketseat.createURLShortener;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class URLData {
    private String originalUrl;
    private long expirationTime;

}
