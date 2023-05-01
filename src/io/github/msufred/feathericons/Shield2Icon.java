package io.github.msufred.feathericons;

import javafx.scene.shape.SVGPath;

public class Shield2Icon extends SVGIcon {

    public Shield2Icon() {
        super();
    }

    public Shield2Icon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M9.19,4.117l2.809-1.049L19,5.693v6.3c-0.004,0.581-0.094,1.157-0.265,1.712c-0.163,0.527,0.132," +
                "1.087,0.66,1.25 C19.493,14.985,19.593,15,19.69,15c0.428,0,0.822-0.275,0.955-0.705C20.875,13.554,20.994," +
                ".783,21,12V5 c0-0.417-0.259-0.79-0.648-0.937l-8-3c-0.226-0.085-0.475-0.084-0.701,0l-3.16,1.18C7.973," +
                "2.437,7.71,3.013,7.903,3.53 C8.096,4.047,8.67,4.31,9.19,4.117z M23.707,22.293l-22-22c-0.391-0.391-" +
                "1.023-0.391-1.414,0s-0.391,1.023,0,1.414l2.832,2.832C3.051,4.68,3,4.834,3,5v7 c0,6.543,8.204,10.72," +
                "8.553,10.895C11.694,22.965,11.847,23,12,23c0.161,0,0.321-0.039,0.467-0.115 c1.917-1.012,3.64-2.313," +
                "5.159-3.845l4.667,4.667C22.488,23.902,22.744,24,23,24s0.512-0.098,0.707-0.293 C24.098,23.316,24.098," +
                "22.684,23.707,22.293z M11.999,20.861C10.389,19.948,5,16.549,5,12V6.414L16.216,17.63 C14.961,18.895," +
                "13.554,19.986,11.999,20.861z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "shield2-icon";
    }
}
