package com.rocketseat.redirectUrlShortener;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

/* Assim retornava Internal Server Error

public class UrlData {
    private String originalUrl;
    private long expirationTime;

    public UrlData(String originalUrl, long expirationTime) {
        this.originalUrl = originalUrl;
        this.expirationTime = expirationTime;
    }
}
*/

public class UrlData {
    private String originalUrl;
    private long expirationTime;

    // Default constructor
    public UrlData() {}

    // Constructor with parameters
    public UrlData(String originalUrl, long expirationTime) {
        this.originalUrl = originalUrl;
        this.expirationTime = expirationTime;
    }

    // Getter and Setter methods
    public String getOriginalUrl() {
        return originalUrl;
    }

    public long getExpirationTime() {
        return expirationTime;
    }
}