package io.github.msufred.feathericons;

import javafx.scene.shape.SVGPath;

public class RotateCcwIcon extends SVGIcon {

    public RotateCcwIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.9);
    }

    public RotateCcwIcon(double size) {
        super(size, size * 0.9);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M21.431,8.687c-0.888-2.52-2.703-4.542-5.112-5.696c-2.409-1.153-5.124-1.3-7.643-0.413C7.277," +
                "3.07,5.983,3.884,4.956,4.911 L2,7.688V4c0-0.552-0.448-1-1-1S0,3.448,0,4v6c0,0.049,0.021,0.091,0.028," +
                "0.138c0.011,0.078,0.017,0.155,0.046,0.229 c0.028,0.072,0.076,0.131,0.12,0.193c0.028,0.041,0.042,0.087," +
                "0.077,0.124c0.004,0.004,0.009,0.005,0.013,0.009 c0.061,0.063,0.137,0.105,0.213,0.151c0.037,0.022," +
                "0.067,0.055,0.106,0.072c0.047,0.021,0.102,0.022,0.153,0.035 c0.076,0.019,0.15,0.045,0.228," +
                "0.046C0.989,10.997,0.994,11,1,11h6c0.552,0,1-0.448,1-1S7.552,9,7,9H3.524l2.822-2.652 " +
                "c0.839-0.838,1.875-1.49,2.994-1.883c2.014-0.711,4.187-0.594,6.114,0.33c1.928,0.923,3.38," +
                "2.541,4.09,4.556 c0.71,2.016,0.593,4.188-0.33,6.114c-0.923,1.928-2.541,3.38-4.557," +
                "4.09c-4.162,1.466-8.738-0.726-10.204-4.887 c-0.184-0.521-0.756-0.792-1.276-0.611c-0.521," +
                "0.184-0.794,0.755-0.611,1.275c1.447,4.105,5.317,6.678,9.441,6.678 c1.101,0,2.219-0.183," +
                "3.313-0.568c2.52-0.888,4.543-2.703,5.696-5.112S22.318,11.206,21.431,8.687z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "rotate-ccw-icon";
    }
}
