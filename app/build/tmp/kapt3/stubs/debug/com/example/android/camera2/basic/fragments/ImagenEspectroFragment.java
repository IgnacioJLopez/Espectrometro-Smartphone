package com.example.android.camera2.basic.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00060\nj\u0002`\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006("}, d2 = {"Lcom/example/android/camera2/basic/fragments/ImagenEspectroFragment;", "Landroidx/fragment/app/Fragment;", "()V", "args", "Lcom/example/android/camera2/basic/fragments/ImagenEspectroFragmentArgs;", "getArgs", "()Lcom/example/android/camera2/basic/fragments/ImagenEspectroFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "datos", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "getDatos", "()Ljava/lang/StringBuilder;", "setDatos", "(Ljava/lang/StringBuilder;)V", "graphview", "Lcom/jjoe64/graphview/GraphView;", "getGraphview", "()Lcom/jjoe64/graphview/GraphView;", "setGraphview", "(Lcom/jjoe64/graphview/GraphView;)V", "series", "Lcom/jjoe64/graphview/series/LineGraphSeries;", "Lcom/jjoe64/graphview/series/DataPoint;", "getSeries", "()Lcom/jjoe64/graphview/series/LineGraphSeries;", "setSeries", "(Lcom/jjoe64/graphview/series/LineGraphSeries;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "app_debug"})
public final class ImagenEspectroFragment extends androidx.fragment.app.Fragment {
    
    /**
     * Declaracion de variables a utilizar
     */
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.StringBuilder datos;
    public com.jjoe64.graphview.GraphView graphview;
    @org.jetbrains.annotations.NotNull()
    private com.jjoe64.graphview.series.LineGraphSeries<com.jjoe64.graphview.series.DataPoint> series;
    private java.util.HashMap _$_findViewCache;
    
    public ImagenEspectroFragment() {
        super();
    }
    
    /**
     * Declaracion de variables a utilizar
     */
    private final com.example.android.camera2.basic.fragments.ImagenEspectroFragmentArgs getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.StringBuilder getDatos() {
        return null;
    }
    
    public final void setDatos(@org.jetbrains.annotations.NotNull()
    java.lang.StringBuilder p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jjoe64.graphview.GraphView getGraphview() {
        return null;
    }
    
    public final void setGraphview(@org.jetbrains.annotations.NotNull()
    com.jjoe64.graphview.GraphView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jjoe64.graphview.series.LineGraphSeries<com.jjoe64.graphview.series.DataPoint> getSeries() {
        return null;
    }
    
    public final void setSeries(@org.jetbrains.annotations.NotNull()
    com.jjoe64.graphview.series.LineGraphSeries<com.jjoe64.graphview.series.DataPoint> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    /**
     * Función para guardar y compartir los datos
     */
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}