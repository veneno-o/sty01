package com.example.sty01.common;

import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class WebUtils {
    static public String renderString(HttpServletResponse resp, String str) {
        try {
            resp.setStatus(200);
            resp.setContentType("application/json");
            resp.setCharacterEncoding("UTF-8");
            resp.getWriter().print(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
