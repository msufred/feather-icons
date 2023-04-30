package io.github.msufred.feathericons;

import javafx.scene.shape.SVGPath;

public class GithubIcon extends SVGIcon {

    public GithubIcon() {
        super(DEFAULT_SIZE * 0.95, DEFAULT_SIZE);
    }

    public GithubIcon(double size) {
        super(size * 0.95, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M22.5,9.035c0-1.457-0.485-2.85-1.379-3.981c0.345-1.304,0.245-2.679-0.292-3.933c-0.117-0.273-0.35-0.48-0.635-0.564 " +
                "c-0.366-0.108-1.729-0.313-4.373,1.361c-2.182-0.518-4.46-0.518-6.643,0c-2.646-1.675-4.01-1.47-4.373-1.361 " +
                "C4.521,0.641,4.288,0.848,4.171,1.121C3.633,2.374,3.535,3.749,3.878,5.053C2.978,6.194,2.492,7.599,2.5,9.064 " +
                "c0,5.363,2.979,7.09,5.797,7.732C8.06,17.39,7.955,18.024,8,18.644v0.096c-2.086,0.437-2.766-0.424-3.603-1.487 " +
                "c-0.538-0.683-1.147-1.457-2.154-1.708c-0.533-0.135-1.079,0.19-1.213,0.728c-0.134,0.535,0.192,1.078,0.728,1.212 " +
                "c0.344,0.086,0.68,0.513,1.068,1.006C3.705,19.606,4.982,21.226,8,20.768v1.747c0,0.553,0.448,1,1,1s1-0.447,1-1l-0.002-2.936 " +
                "c0.003-0.043,0.003-0.086,0-0.13l0-0.875c-0.047-0.67,0.194-1.332,0.661-1.814c0.264-0.272,0.351-0.67,0.225-1.028 " +
                "c-0.126-0.357-0.443-0.612-0.82-0.659C7.174,14.714,4.5,13.737,4.5,9.059C4.494,7.905,4.929,6.81,5.724,5.974 " +
                "c0.264-0.277,0.347-0.681,0.213-1.039C5.648,4.161,5.602,3.332,5.796,2.544c0.49,0.107,1.355,0.415,2.647,1.281 " +
                "c0.24,0.162,0.538,0.209,0.818,0.135c2.118-0.574,4.358-0.574,6.477,0c0.278,0.075,0.578,0.027,0.818-0.135 " +
                "c1.305-0.874,2.175-1.18,2.646-1.288c0.196,0.79,0.15,1.622-0.139,2.398c-0.134,0.358-0.052,0.762,0.212,1.039 " +
                "C20.065,6.803,20.5,7.89,20.5,9.035c0,4.735-2.668,5.685-5.551,6.005c-0.38,0.043-0.701,0.297-0.831,0.656 " +
                "c-0.129,0.358-0.042,0.76,0.224,1.034c0.474,0.488,0.715,1.158,0.658,1.914v3.87c0,0.553,0.447,1,1,1s1-0.447,1-1l-0.003-3.791 " +
                "c0.053-0.665-0.049-1.325-0.286-1.933C19.051,16.281,22.5,14.71,22.5,9.035z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "github-icon";
    }
}
