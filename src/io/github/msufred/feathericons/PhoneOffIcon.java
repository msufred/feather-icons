package io.github.msufred.feathericons;

import javafx.scene.shape.SVGPath;

public class PhoneOffIcon extends SVGIcon {

    public PhoneOffIcon() {
        super();
    }

    public PhoneOffIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M5.191,13.81c0.187,0,0.375-0.052,0.543-0.161c0.463-0.301,0.596-0.92,0.295-1.383C4.438," +
                "9.813,3.43,6.979,3.116,4.09 c-0.024-0.266,0.057-0.525,0.228-0.73C3.515,3.154,3.756,3.028,4.11," +
                "3h3.01c0.52,0.001,0.93,0.364,0.999,0.852 c0.136,1.033,0.39,2.051,0.755,3.03C9.011,7.246,8.923," +
                "7.66,8.653,7.933l-1.27,1.27c-0.391,0.391-0.391,1.023,0,1.414 s1.023,0.391,1.414,0l1.274-" +
                "1.274c0.821-0.83,1.086-2.072,0.676-3.163c-0.312-0.835-0.529-1.707-0.647-2.6 C9.891,2.095,8.632," +
                "0.956,7.11,1h-3C4.021,1,3.932,1.004,3.842,1.012c-0.798,0.072-1.52,0.451-2.034,1.066 c-0.513," +
                "0.616-0.756,1.394-0.682,2.21c0.35,3.217,1.465,6.352,3.225,9.065C4.542,13.649,4.863,13.81,5.191," +
                "13.81z M23.707,0.293c-0.391-0.391-1.023-0.391-1.414,0L10.005,12.581c-0.01,0.009-0.022,0.012-0.032," +
                "0.021 c-0.01,0.009-0.012,0.022-0.021,0.032l-9.659,9.659c-0.391,0.391-0.391,1.023,0,1.414C0.488," +
                "23.902,0.744,24,1,24 s0.512-0.098,0.707-0.293l6.186-6.186c0.864,0.784,1.775,1.517,2.753,2.138c2.715," +
                "1.761,5.851,2.876,9.081,3.227 c0.094,0.009,0.188,0.013,0.286,0.013c0.801-0.004,1.553-0.318," +
                "2.117-0.888s0.874-1.324,0.87-2.121v-2.99 c0.015-1.5-1.095-2.79-2.59-3.001c-0.881-0.116-1.753-" +
                "0.333-2.588-0.644c-1.095-0.412-2.336-0.147-3.169,0.678l-0.718,0.718 c-0.638-0.407-1.23-0.877-" +
                "1.798-1.374L23.707,1.707C24.098,1.316,24.098,0.684,23.707,0.293z M13.596,16.779 c0.388,0.222," +
                "0.882,0.156,1.201-0.162l1.267-1.267c0.276-0.274,0.688-0.362,1.058-0.223c0.979,0.364,1.998,0.618," +
                "3.02,0.752 c0.495,0.07,0.864,0.5,0.859,1.01v3.005c0.001,0.267-0.102,0.518-0.29,0.708c-0.188," +
                "0.189-0.414,0.318-0.782,0.293 c-2.906-0.315-5.739-1.323-8.201-2.919c-0.861-0.547-1.659-1.187-" +
                "2.419-1.87l1.401-1.401 C11.595,15.494,12.561,16.191,13.596,16.779z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "phone-off-icon";
    }
}
