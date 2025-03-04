// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_xfeatures2d;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_shape.*;
import static org.bytedeco.opencv.global.opencv_shape.*;

import static org.bytedeco.opencv.global.opencv_xfeatures2d.*;


/** \brief Class implementing the MSD (*Maximal Self-Dissimilarity*) keypoint detector, described in \cite Tombari14.
<p>
The algorithm implements a novel interest point detector stemming from the intuition that image patches
which are highly dissimilar over a relatively large extent of their surroundings hold the property of
being repeatable and distinctive. This concept of "contextual self-dissimilarity" reverses the key
paradigm of recent successful techniques such as the Local Self-Similarity descriptor and the Non-Local
Means filter, which build upon the presence of similar - rather than dissimilar - patches. Moreover,
it extends to contextual information the local self-dissimilarity notion embedded in established
detectors of corner-like interest points, thereby achieving enhanced repeatability, distinctiveness and
localization accuracy.
<p>
*/

@Namespace("cv::xfeatures2d") @Properties(inherit = org.bytedeco.opencv.presets.opencv_xfeatures2d.class)
public class MSDDetector extends Feature2D {
    static { Loader.load(); }
    /** Default native constructor. */
    public MSDDetector() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MSDDetector(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MSDDetector(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MSDDetector position(long position) {
        return (MSDDetector)super.position(position);
    }
    @Override public MSDDetector getPointer(long i) {
        return new MSDDetector((Pointer)this).offsetAddress(i);
    }


    public static native @Ptr MSDDetector create(int m_patch_radius/*=3*/, int m_search_area_radius/*=5*/,
                int m_nms_radius/*=5*/, int m_nms_scale_radius/*=0*/, float m_th_saliency/*=250.0f*/, int m_kNN/*=4*/,
                float m_scale_factor/*=1.25f*/, int m_n_scales/*=-1*/, @Cast("bool") boolean m_compute_orientation/*=false*/);
    public static native @Ptr MSDDetector create();
}
