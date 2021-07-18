module com.kitfox.svg {
    requires java.logging;
    requires java.xml;
    requires java.desktop;

    requires static ant;

    exports com.kitfox.svg;
    exports com.kitfox.svg.animation;
    exports com.kitfox.svg.app;
    exports com.kitfox.svg.app.ant;
    exports com.kitfox.svg.app.beans;
    exports com.kitfox.svg.app.data;
    exports com.kitfox.svg.xml;
}
