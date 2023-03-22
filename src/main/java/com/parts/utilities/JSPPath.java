package com.parts.utilities;

public enum JSPPath {
    INDEX("/index.jsp"),
    REG("/WEB-INF/quest/registration.jsp"),
    QUEST("/WEB-INF/quest/quest.jsp"),
    GOOD_END("/WEB-INF/quest/goodEnd.jsp"),
    BAD_END("/WEB-INF/quest/badEnd.jsp");

    private final String path;

    JSPPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
