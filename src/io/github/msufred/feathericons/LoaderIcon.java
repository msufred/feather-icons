package io.github.msufred.feathericons;

import javafx.scene.shape.SVGPath;

public class LoaderIcon extends SVGIcon {

    public LoaderIcon() {
        super();
    }

    public LoaderIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12,1c-0.552,0-1,0.448-1,1v4c0,0.552,0.448,1,1,1c0.553,0,1-0.448,1-1V2C13,1.448,12.553,1,12,1z " +
                "M12,17c-0.552,0-1,0.447-1,1v4c0,0.553,0.448,1,1,1c0.553,0,1-0.447,1-1v-4C13,17.447,12.553,17,12,17z " +
                "M5.637,4.223c-0.391-0.391-1.023-0.391-1.414,0s-0.391,1.023,0,1.414l2.83,2.83C7.248,8.662,7.504,8.76,7.76,8.76 " +
                "s0.512-0.098,0.707-0.293c0.391-0.391,0.391-1.023,0-1.414L5.637,4.223z " +
                "M16.947,15.533c-0.391-0.391-1.023-0.391-1.414,0s-0.391,1.023,0,1.414l2.83,2.83c0.195,0.195,0.451,0.293,0.707,0.293 " +
                "s0.512-0.098,0.707-0.293c0.391-0.391,0.391-1.023,0-1.414L16.947,15.533z " +
                "M7,12c0-0.552-0.448-1-1-1H2c-0.552,0-1,0.448-1,1c0,0.553,0.448,1,1,1h4C6.552,13,7,12.553,7,12z " +
                "M22,11h-4c-0.553,0-1,0.448-1,1c0,0.553,0.447,1,1,1h4c0.553,0,1-0.447,1-1C23,11.448,22.553,11,22,11z " +
                "M7.053,15.533l-2.83,2.83c-0.391,0.391-0.391,1.023,0,1.414c0.195,0.195,0.451,0.293,0.707,0.293s0.512-0.098,0.707-0.293 " +
                "l2.83-2.83c0.391-0.391,0.391-1.023,0-1.414S7.443,15.143,7.053,15.533z " +
                "M16.24,8.76c0.256,0,0.512-0.098,0.707-0.293l2.83-2.83c0.391-0.39,0.391-1.023,0-1.414s-1.023-0.391-1.414,0l-2.83,2.83 " +
                "c-0.391,0.39-0.391,1.023,0,1.414C15.729,8.662,15.984,8.76,16.24,8.76z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "loader-icon";
    }
}
