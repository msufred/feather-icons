package io.github.msufred.feathericons;

import javafx.scene.shape.SVGPath;

public class DownloadCloudIcon extends SVGIcon {

    public DownloadCloudIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.85);
    }

    public DownloadCloudIcon(double size) {
        super(size, size * 0.85);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M15.293,16.293L13,18.586V12c0-0.552-0.447-1-1-1c-0.552,0-1,0.448-1,1v6.586l-2.293-2.293 " +
                "c-0.391-0.391-1.023-0.391-1.414,0s-0.391,1.023,0,1.414l3.999,3.999c0.093,0.093,0.203,0.166,0.326,0.217 " +
                "C11.74,21.973,11.87,22,12,22s0.26-0.026,0.382-0.077c0.123-0.051,0.234-0.124,0.326-0.217l3.999-3.999 " +
                "c0.391-0.391,0.391-1.023,0-1.414S15.684,15.902,15.293,16.293z " +
                "M22.912,10.549C21.79,8.953,19.956,8,18.006,8C18.004,8,18.002,8,18,8h-0.519c-1.53-4.354-6.178-6.896-10.728-5.729 " +
                "C4.425,2.868,2.469,4.337,1.245,6.406c-1.224,2.069-1.569,4.491-0.972,6.819c0.353,1.376,1.037,2.665,1.978,3.729 " +
                "c0.366,0.413,0.998,0.451,1.412,0.086c0.413-0.366,0.452-0.998,0.085-1.412c-0.731-0.826-1.263-1.829-1.538-2.899 " +
                "c-0.465-1.811-0.196-3.694,0.755-5.303C3.918,5.815,5.44,4.672,7.251,4.208c3.742-0.96,7.561,1.302,8.521,5.041 " +
                "C15.885,9.691,16.284,10,16.74,10h1.261c0.001,0,0.002,0,0.004,0c1.301,0,2.523,0.635,3.271,1.699 " +
                "c0.615,0.874,0.853,1.935,0.669,2.987s-0.766,1.971-1.64,2.585c-0.452,0.318-0.561,0.941-0.243,1.394 " +
                "c0.195,0.276,0.505,0.425,0.819,0.425c0.198,0,0.399-0.059,0.574-0.182c1.311-0.922,2.185-2.299,2.46-3.878 " +
                "S23.834,11.859,22.912,10.549z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "download-cloud-icon";
    }
}
