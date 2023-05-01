package io.github.msufred.feathericons;

import javafx.scene.shape.SVGPath;

public class UsersIcon extends SVGIcon {

    public UsersIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.8);
    }

    public UsersIcon(double size) {
        super(size, size * 0.8);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M13,14H5c-2.757,0-5,2.243-5,5v2c0,0.553,0.448,1,1,1s1-0.447,1-1v-2c0-1.654,1.346-3," +
                "3-3h8c1.654,0,3,1.346,3,3v2 c0,0.553,0.447,1,1,1s1-0.447,1-1v-2C18,16.243,15.757,14,13,14z " +
                "M9,12c2.757,0,5-2.243,5-5s-2.243-5-5-5S4,4.243,4,7S6.243,12,9,12z M9,4c1.654,0,3,1.346,3," +
                "3s-1.346,3-3,3S6,8.654,6,7 S7.346,4,9,4z M20.25,14.162c-0.535-0.143-1.08,0.183-1.218,0.718c-" +
                "0.139,0.534,0.183,1.08,0.718,1.218C21.074,16.44,21.999,17.634,22,19 v2c0,0.553,0.447,1,1," +
                "1s1-0.447,1-1v-2.001C23.999,16.722,22.457,14.732,20.25,14.162z M16.248,2.161c-0.534-0.14-" +
                "1.081,0.186-1.217,0.721c-0.137,0.535,0.186,1.08,0.721,1.217 c1.603,0.41,2.572,2.048,2.162," +
                "3.65c-0.271,1.062-1.101,1.89-2.162,2.162c-0.535,0.137-0.857,0.682-0.721,1.217 c0.115,0.452," +
                "0.522,0.752,0.968,0.752c0.082,0,0.166-0.01,0.249-0.031c1.77-0.453,3.15-1.834,3.604-3.604 " +
                "C20.535,5.574,18.919,2.845,16.248,2.161z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "users-icon";
    }
}