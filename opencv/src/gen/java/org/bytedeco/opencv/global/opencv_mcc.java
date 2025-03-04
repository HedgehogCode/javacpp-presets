// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.global;

import org.bytedeco.opencv.opencv_mcc.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
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
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;

public class opencv_mcc extends org.bytedeco.opencv.presets.opencv_mcc {
    static { Loader.load(); }

// Parsed from <opencv2/mcc.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.

/*
 * MIT License
 *
 * Copyright (c) 2018 Pedro Diamel Marrero Fernández
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

// #ifndef __OPENCV_MCC_HPP__
// #define __OPENCV_MCC_HPP__


// #include "mcc/checker_detector.hpp"
// #include "mcc/checker_model.hpp"
// #include "mcc/ccm.hpp"

/** \defgroup mcc Macbeth Chart module
\{
    \defgroup color_correction Color Correction Model
\}
<p>
<p>
\addtogroup mcc
<p>
Introduction
------------
<p>
ColorCharts are a tool for calibrating the color profile of camera, which not
only depends on the intrinsic and extrinsic parameters of camera but also on the
lighting conditions. This is done by taking the image of a chart, such that the
value of its colors present in it known, in the image the color values changes
depeding on many variables, this gives us the colors initially present and the
colors that are present in the image, based on this information we can apply any
suitable algorithm to find the actual color of all the objects present in the
image.
<p>
*/

// #endif


// Parsed from <opencv2/mcc/checker_model.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.

/*
 * MIT License
 *
 * Copyright (c) 2018 Pedro Diamel Marrero Fernández
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

// #ifndef __OPENCV_MCC_CHECKER_MODEL_HPP__
// #define __OPENCV_MCC_CHECKER_MODEL_HPP__
// #include <opencv2/core.hpp>
// #include <opencv2/imgproc.hpp>

/** \addtogroup mcc
 *  \{
<p>
/** TYPECHART
 *
 * \brief enum to hold the type of the checker
 *
 */
/** enum cv::mcc::TYPECHART */
public static final int
    /** Standard Macbeth Chart with 24 squares */
    MCC24 = 0,
    /** DigitalSG with 140 squares */
    SG140 = 1,
    /** DKK color chart with 12 squares and 6 rectangle */
    VINYL18 = 2;
// Targeting ../opencv_mcc/CChecker.java


// Targeting ../opencv_mcc/CCheckerDraw.java



/** \} mcc */
 // namespace mcc
 // namespace cv

// #endif


// Parsed from <opencv2/mcc/checker_detector.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.

/*
 * MIT License
 *
 * Copyright (c) 2018 Pedro Diamel Marrero Fernández
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

// #ifndef __OPENCV_MCC_CHECKER_DETECTOR_HPP__
// #define __OPENCV_MCC_CHECKER_DETECTOR_HPP__
// #include <opencv2/core.hpp>
// #include "checker_model.hpp"
// #include <opencv2/dnn.hpp>

//----------To view debugging output-----------------------------
//Read the tutorial on how to use debugging in this module
//It can be found in the documentation of 'mcc' modules,
//Then uncomment the following line to view debugging output
//---------------------------------------------------------------
// #define MCC_DEBUG
//---------------------------------------------------------------
// Targeting ../opencv_mcc/DetectorParameters.java


// Targeting ../opencv_mcc/CCheckerDetector.java



/** \} mcc */

 // namespace mcc
 // namespace cv

// #endif


}
