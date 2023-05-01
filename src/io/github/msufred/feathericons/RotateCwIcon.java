package io.github.msufred.feathericons;

import javafx.scene.shape.SVGPath;

public class RotateCwIcon extends SVGIcon {

    public RotateCwIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.9);
    }

    public RotateCwIcon(double size) {
        super(size, size * 0.9);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M23.971,10.144C23.978,10.095,24,10.051,24,10V4c0-0.552-0.447-1-1-1s-1,0.448-1,1v3.685l-2.923-2.752 " +
                "c-1.049-1.05-2.343-1.866-3.742-2.36C10.137,0.736,4.412,3.472,2.575,8.671c-1.837,5.198,0.898,10.923,6.098,12.761 " +
                "c1.098,0.388,2.218,0.571,3.321,0.571c4.121,0,7.989-2.568,9.438-6.67c0.185-0.521-0.089-1.092-0.609-1.275 " +
                "c-0.523-0.185-1.093,0.089-1.275,0.609c-1.47,4.159-6.047,6.348-10.209,4.879c-4.159-1.471-6.347-6.05-4.878-10.209 " +
                "c0.712-2.015,2.166-3.632,4.094-4.553s4.1-1.037,6.114-0.325c1.119,0.396,2.154,1.048,3.016,1.909L20.479," +
                "9H17c-0.553,0-1,0.448-1,1 s0.447,1,1,1h6c0.005,0,0.01-0.003,0.015-0.003c0.083-0.001,0.162-0.027," +
                "0.242-0.049c0.046-0.012,0.096-0.013,0.139-0.031 c0.037-0.016,0.067-0.048,0.103-0.069c0.077-0.046," +
                "0.155-0.09,0.218-0.154c0.003-0.003,0.008-0.004,0.011-0.008 c0.031-0.033,0.043-0.075,0.069-0.111c0.048-0.067," +
                "0.099-0.13,0.129-0.208C23.955,10.295,23.96,10.219,23.971,10.144z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "rotate-cw-icon";
    }
}
