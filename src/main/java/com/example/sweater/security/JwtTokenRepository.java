package com.example.sweater.security;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.security.web.csrf.CsrfTokenRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.UUID;

public class JwtTokenRepository implements CsrfTokenRepository {
    @Override
    public CsrfToken generateToken(HttpServletRequest request) {
        String id = UUID.randomUUID().toString().replaceAll("-", "");
        Date now = new Date();
        Date exp = Date.from(LocalDateTime.now().plusMinutes(30).atZone(ZoneId.systemDefault()).toInstant());
        String token = "";

        try{

        } catch (Exception  e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void saveToken(CsrfToken token, HttpServletRequest request, HttpServletResponse response) {

    }

    @Override
    public CsrfToken loadToken(HttpServletRequest request) {
        return null;
    }
}
