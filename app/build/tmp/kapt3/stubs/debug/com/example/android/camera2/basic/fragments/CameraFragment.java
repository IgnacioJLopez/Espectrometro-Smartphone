package com.example.android.camera2.basic.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00de\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u0090\u00012\u00020\u0001:\u0002\u0090\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J3\u0010o\u001a\u00020c2\u0006\u0010p\u001a\u00020\"2\f\u0010q\u001a\b\u0012\u0004\u0012\u00020s0r2\n\b\u0002\u0010t\u001a\u0004\u0018\u00010$H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010uJ\b\u0010v\u001a\u00020wH\u0002J&\u0010x\u001a\u0004\u0018\u00010[2\u0006\u0010y\u001a\u00020z2\b\u0010{\u001a\u0004\u0018\u00010|2\b\u0010}\u001a\u0004\u0018\u00010~H\u0016J\t\u0010\u007f\u001a\u00030\u0080\u0001H\u0016J\n\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0016J\u001d\u0010\u0082\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0083\u0001\u001a\u00020[2\b\u0010}\u001a\u0004\u0018\u00010~H\u0017J2\u0010\u0084\u0001\u001a\u00020\"2\u0007\u0010\u0085\u0001\u001a\u00020&2\b\u0010\u0086\u0001\u001a\u00030\u0087\u00012\n\b\u0002\u0010t\u001a\u0004\u0018\u00010$H\u0083@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0088\u0001J\u001e\u0010\u0089\u0001\u001a\u00030\u008a\u00012\b\u0010\u008b\u0001\u001a\u00030\u008c\u0001H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u008d\u0001J\u0014\u0010\u008e\u0001\u001a\u00030\u008c\u0001H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u008f\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\u0014\u001a\u0004\b\'\u0010(R\u000e\u0010*\u001a\u00020+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b0\u0010\u0014\u001a\u0004\b.\u0010/R\u001a\u00101\u001a\u000202X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u000202X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00104\"\u0004\b9\u00106R\u001a\u0010:\u001a\u000202X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u00104\"\u0004\b<\u00106R\u001a\u0010=\u001a\u000202X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u00104\"\u0004\b?\u00106R\u001a\u0010@\u001a\u00020AX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010F\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\f\"\u0004\bH\u0010\u000eR\u0014\u0010I\u001a\u00020JX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u000e\u0010M\u001a\u00020NX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010Q\u001a\u00020JX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010LR\u0014\u0010S\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010\fR\u001b\u0010U\u001a\u00020V8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bY\u0010\u0014\u001a\u0004\bW\u0010XR\u000e\u0010Z\u001a\u00020[X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\\\u001a\u00020JX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010L\"\u0004\b^\u0010_R\u000e\u0010`\u001a\u00020aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020cX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\f\"\u0004\bh\u0010\u000eR\u001a\u0010i\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\f\"\u0004\bk\u0010\u000eR\u001a\u0010l\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\f\"\u0004\bn\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0091\u0001"}, d2 = {"Lcom/example/android/camera2/basic/fragments/CameraFragment;", "Landroidx/fragment/app/Fragment;", "()V", "D", "", "getD", "()F", "setD", "(F)V", "aargb", "", "getAargb", "()I", "setAargb", "(I)V", "animationTask", "Ljava/lang/Runnable;", "getAnimationTask", "()Ljava/lang/Runnable;", "animationTask$delegate", "Lkotlin/Lazy;", "args", "Lcom/example/android/camera2/basic/fragments/CameraFragmentArgs;", "getArgs", "()Lcom/example/android/camera2/basic/fragments/CameraFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "bitmapRotado", "Landroid/graphics/Bitmap;", "getBitmapRotado", "()Landroid/graphics/Bitmap;", "setBitmapRotado", "(Landroid/graphics/Bitmap;)V", "camera", "Landroid/hardware/camera2/CameraDevice;", "cameraHandler", "Landroid/os/Handler;", "cameraManager", "Landroid/hardware/camera2/CameraManager;", "getCameraManager", "()Landroid/hardware/camera2/CameraManager;", "cameraManager$delegate", "cameraThread", "Landroid/os/HandlerThread;", "characteristics", "Landroid/hardware/camera2/CameraCharacteristics;", "getCharacteristics", "()Landroid/hardware/camera2/CameraCharacteristics;", "characteristics$delegate", "datosB", "", "getDatosB", "()[F", "setDatosB", "([F)V", "datosG", "getDatosG", "setDatosG", "datosL", "getDatosL", "setDatosL", "datosR", "getDatosR", "setDatosR", "datosX", "", "getDatosX", "()[I", "setDatosX", "([I)V", "delta", "getDelta", "setDelta", "exposureTime", "", "getExposureTime", "()J", "imageReader", "Landroid/media/ImageReader;", "imageReaderHandler", "imageReaderThread", "interval", "getInterval", "n", "getN", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "navController$delegate", "overlay", "Landroid/view/View;", "previousMillis", "getPreviousMillis", "setPreviousMillis", "(J)V", "relativeOrientation", "Lcom/example/android/camera/utils/OrientationLiveData;", "session", "Landroid/hardware/camera2/CameraCaptureSession;", "viewFinder", "Lcom/example/android/camera/utils/AutoFitSurfaceView;", "x", "getX", "setX", "yf", "getYf", "setYf", "yi", "getYi", "setYi", "createCaptureSession", "device", "targets", "", "Landroid/view/Surface;", "handler", "(Landroid/hardware/camera2/CameraDevice;Ljava/util/List;Landroid/os/Handler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializeCamera", "Lkotlinx/coroutines/Job;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "", "onStop", "onViewCreated", "view", "openCamera", "manager", "cameraId", "", "(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;Landroid/os/Handler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveResult", "Ljava/io/File;", "result", "Lcom/example/android/camera2/basic/fragments/CameraFragment$Companion$CombinedCaptureResult;", "(Lcom/example/android/camera2/basic/fragments/CameraFragment$Companion$CombinedCaptureResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "takePhoto", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class CameraFragment extends androidx.fragment.app.Fragment {
    
    /**
     * Declaracion de variables a utilizar
     */
    private int x = 0;
    private final long interval = 1000L;
    private long previousMillis = 0L;
    private final int n = 20;
    private final long exposureTime = 5000000L;
    private int aargb = 0;
    public android.graphics.Bitmap bitmapRotado;
    
    /**
     * AndroidX navigation arguments
     */
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private int yi = 0;
    private int yf = 10;
    private int delta = 10;
    @org.jetbrains.annotations.NotNull()
    private int[] datosX;
    @org.jetbrains.annotations.NotNull()
    private float[] datosL;
    @org.jetbrains.annotations.NotNull()
    private float[] datosR;
    @org.jetbrains.annotations.NotNull()
    private float[] datosG;
    @org.jetbrains.annotations.NotNull()
    private float[] datosB;
    private float D = 4000.0F;
    
    /**
     * Host's navigation controller
     */
    private final kotlin.Lazy navController$delegate = null;
    
    /**
     * Detects, characterizes, and connects to a CameraDevice (used for all camera operations)
     */
    private final kotlin.Lazy cameraManager$delegate = null;
    
    /**
     * [CameraCharacteristics] corresponding to the provided Camera ID
     */
    private final kotlin.Lazy characteristics$delegate = null;
    
    /**
     * Readers used as buffers for camera still shots
     */
    private android.media.ImageReader imageReader;
    
    /**
     * [HandlerThread] where all camera operations run
     */
    private final android.os.HandlerThread cameraThread = null;
    
    /**
     * [Handler] corresponding to [cameraThread]
     */
    private final android.os.Handler cameraHandler = null;
    
    /**
     * Performs recording animation of flashing screen
     */
    private final kotlin.Lazy animationTask$delegate = null;
    
    /**
     * [HandlerThread] where all buffer reading operations run
     */
    private final android.os.HandlerThread imageReaderThread = null;
    
    /**
     * [Handler] corresponding to [imageReaderThread]
     */
    private final android.os.Handler imageReaderHandler = null;
    
    /**
     * Where the camera preview is displayed
     */
    private com.example.android.camera.utils.AutoFitSurfaceView viewFinder;
    
    /**
     * Overlay on top of the camera preview
     */
    private android.view.View overlay;
    
    /**
     * The [CameraDevice] that will be opened in this fragment
     */
    private android.hardware.camera2.CameraDevice camera;
    
    /**
     * Internal reference to the ongoing [CameraCaptureSession] configured with our parameters
     */
    private android.hardware.camera2.CameraCaptureSession session;
    
    /**
     * Live data listener for changes in the device orientation relative to the camera
     */
    private com.example.android.camera.utils.OrientationLiveData relativeOrientation;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.android.camera2.basic.fragments.CameraFragment.Companion Companion = null;
    private static final java.lang.String TAG = null;
    
    /**
     * Maximum number of images that will be held in the reader's buffer
     */
    private static final int IMAGE_BUFFER_SIZE = 3;
    
    /**
     * Maximum time allowed to wait for the result of an image capture
     */
    private static final long IMAGE_CAPTURE_TIMEOUT_MILLIS = 5000L;
    private java.util.HashMap _$_findViewCache;
    
    public CameraFragment() {
        super();
    }
    
    public final int getX() {
        return 0;
    }
    
    public final void setX(int p0) {
    }
    
    public final long getInterval() {
        return 0L;
    }
    
    public final long getPreviousMillis() {
        return 0L;
    }
    
    public final void setPreviousMillis(long p0) {
    }
    
    public final int getN() {
        return 0;
    }
    
    public final long getExposureTime() {
        return 0L;
    }
    
    public final int getAargb() {
        return 0;
    }
    
    public final void setAargb(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap getBitmapRotado() {
        return null;
    }
    
    public final void setBitmapRotado(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap p0) {
    }
    
    /**
     * AndroidX navigation arguments
     */
    private final com.example.android.camera2.basic.fragments.CameraFragmentArgs getArgs() {
        return null;
    }
    
    public final int getYi() {
        return 0;
    }
    
    public final void setYi(int p0) {
    }
    
    public final int getYf() {
        return 0;
    }
    
    public final void setYf(int p0) {
    }
    
    public final int getDelta() {
        return 0;
    }
    
    public final void setDelta(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final int[] getDatosX() {
        return null;
    }
    
    public final void setDatosX(@org.jetbrains.annotations.NotNull()
    int[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final float[] getDatosL() {
        return null;
    }
    
    public final void setDatosL(@org.jetbrains.annotations.NotNull()
    float[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final float[] getDatosR() {
        return null;
    }
    
    public final void setDatosR(@org.jetbrains.annotations.NotNull()
    float[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final float[] getDatosG() {
        return null;
    }
    
    public final void setDatosG(@org.jetbrains.annotations.NotNull()
    float[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final float[] getDatosB() {
        return null;
    }
    
    public final void setDatosB(@org.jetbrains.annotations.NotNull()
    float[] p0) {
    }
    
    public final float getD() {
        return 0.0F;
    }
    
    public final void setD(float p0) {
    }
    
    /**
     * Host's navigation controller
     */
    private final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    /**
     * Detects, characterizes, and connects to a CameraDevice (used for all camera operations)
     */
    private final android.hardware.camera2.CameraManager getCameraManager() {
        return null;
    }
    
    /**
     * [CameraCharacteristics] corresponding to the provided Camera ID
     */
    private final android.hardware.camera2.CameraCharacteristics getCharacteristics() {
        return null;
    }
    
    /**
     * Performs recording animation of flashing screen
     */
    private final java.lang.Runnable getAnimationTask() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Begin all camera operations in a coroutine in the main thread. This function:
     * - Opens the camera
     * - Configures the camera session
     * - Starts the preview by dispatching a repeating capture request
     * - Sets up the still image capture listeners
     */
    private final kotlinx.coroutines.Job initializeCamera() {
        return null;
    }
    
    /**
     * Opens the camera and returns the opened device (as the result of the suspend coroutine)
     */
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final java.lang.Object openCamera(android.hardware.camera2.CameraManager manager, java.lang.String cameraId, android.os.Handler handler, kotlin.coroutines.Continuation<? super android.hardware.camera2.CameraDevice> continuation) {
        return null;
    }
    
    /**
     * Starts a [CameraCaptureSession] and returns the configured session (as the result of the
     * suspend coroutine
     */
    private final java.lang.Object createCaptureSession(android.hardware.camera2.CameraDevice device, java.util.List<? extends android.view.Surface> targets, android.os.Handler handler, kotlin.coroutines.Continuation<? super android.hardware.camera2.CameraCaptureSession> continuation) {
        return null;
    }
    
    /**
     * Helper function used to capture a still image using the [CameraDevice.TEMPLATE_STILL_CAPTURE]
     * template. It performs synchronization between the [CaptureResult] and the [Image] resulting
     * from the single capture, ancd outputs a [CombinedCaptureResult] object.
     */
    private final java.lang.Object takePhoto(kotlin.coroutines.Continuation<? super com.example.android.camera2.basic.fragments.CameraFragment.Companion.CombinedCaptureResult> continuation) {
        return null;
    }
    
    /**
     * Helper function used to save a [CombinedCaptureResult] into a [File]
     */
    private final java.lang.Object saveResult(com.example.android.camera2.basic.fragments.CameraFragment.Companion.CombinedCaptureResult result, kotlin.coroutines.Continuation<? super java.io.File> continuation) {
        return null;
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/android/camera2/basic/fragments/CameraFragment$Companion;", "", "()V", "IMAGE_BUFFER_SIZE", "", "IMAGE_CAPTURE_TIMEOUT_MILLIS", "", "TAG", "", "createFile", "Ljava/io/File;", "context", "Landroid/content/Context;", "extension", "CombinedCaptureResult", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Create a [File] named a using formatted timestamp with the current date and time.
         *
         * @return [File] created.
         */
        private final java.io.File createFile(android.content.Context context, java.lang.String extension) {
            return null;
        }
        
        /**
         * Helper data class used to hold capture metadata with their associated image
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001f"}, d2 = {"Lcom/example/android/camera2/basic/fragments/CameraFragment$Companion$CombinedCaptureResult;", "Ljava/io/Closeable;", "image", "Landroid/media/Image;", "metadata", "Landroid/hardware/camera2/CaptureResult;", "orientation", "", "format", "(Landroid/media/Image;Landroid/hardware/camera2/CaptureResult;II)V", "getFormat", "()I", "getImage", "()Landroid/media/Image;", "getMetadata", "()Landroid/hardware/camera2/CaptureResult;", "getOrientation", "close", "", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
        public static final class CombinedCaptureResult implements java.io.Closeable {
            @org.jetbrains.annotations.NotNull()
            private final android.media.Image image = null;
            @org.jetbrains.annotations.NotNull()
            private final android.hardware.camera2.CaptureResult metadata = null;
            private final int orientation = 0;
            private final int format = 0;
            
            /**
             * Helper data class used to hold capture metadata with their associated image
             */
            @org.jetbrains.annotations.NotNull()
            public final com.example.android.camera2.basic.fragments.CameraFragment.Companion.CombinedCaptureResult copy(@org.jetbrains.annotations.NotNull()
            android.media.Image image, @org.jetbrains.annotations.NotNull()
            android.hardware.camera2.CaptureResult metadata, int orientation, int format) {
                return null;
            }
            
            /**
             * Helper data class used to hold capture metadata with their associated image
             */
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Helper data class used to hold capture metadata with their associated image
             */
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            /**
             * Helper data class used to hold capture metadata with their associated image
             */
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public CombinedCaptureResult(@org.jetbrains.annotations.NotNull()
            android.media.Image image, @org.jetbrains.annotations.NotNull()
            android.hardware.camera2.CaptureResult metadata, int orientation, int format) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.media.Image component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.media.Image getImage() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.hardware.camera2.CaptureResult component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.hardware.camera2.CaptureResult getMetadata() {
                return null;
            }
            
            public final int component3() {
                return 0;
            }
            
            public final int getOrientation() {
                return 0;
            }
            
            public final int component4() {
                return 0;
            }
            
            public final int getFormat() {
                return 0;
            }
            
            @java.lang.Override()
            public void close() {
            }
        }
    }
}