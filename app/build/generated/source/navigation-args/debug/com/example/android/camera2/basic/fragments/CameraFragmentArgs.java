package com.example.android.camera2.basic.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class CameraFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private CameraFragmentArgs() {
  }

  private CameraFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static CameraFragmentArgs fromBundle(@NonNull Bundle bundle) {
    CameraFragmentArgs __result = new CameraFragmentArgs();
    bundle.setClassLoader(CameraFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("camera_id")) {
      String cameraId;
      cameraId = bundle.getString("camera_id");
      if (cameraId == null) {
        throw new IllegalArgumentException("Argument \"camera_id\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("camera_id", cameraId);
    } else {
      throw new IllegalArgumentException("Required argument \"camera_id\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("pixel_format")) {
      int pixelFormat;
      pixelFormat = bundle.getInt("pixel_format");
      __result.arguments.put("pixel_format", pixelFormat);
    } else {
      throw new IllegalArgumentException("Required argument \"pixel_format\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("tita")) {
      float tita;
      tita = bundle.getFloat("tita");
      __result.arguments.put("tita", tita);
    } else {
      throw new IllegalArgumentException("Required argument \"tita\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("b")) {
      float b;
      b = bundle.getFloat("b");
      __result.arguments.put("b", b);
    } else {
      throw new IllegalArgumentException("Required argument \"b\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("yi")) {
      int yi;
      yi = bundle.getInt("yi");
      __result.arguments.put("yi", yi);
    } else {
      throw new IllegalArgumentException("Required argument \"yi\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("yf")) {
      int yf;
      yf = bundle.getInt("yf");
      __result.arguments.put("yf", yf);
    } else {
      throw new IllegalArgumentException("Required argument \"yf\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("relacion")) {
      float relacion;
      relacion = bundle.getFloat("relacion");
      __result.arguments.put("relacion", relacion);
    } else {
      throw new IllegalArgumentException("Required argument \"relacion\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("ordenCero")) {
      int ordenCero;
      ordenCero = bundle.getInt("ordenCero");
      __result.arguments.put("ordenCero", ordenCero);
    } else {
      throw new IllegalArgumentException("Required argument \"ordenCero\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getCameraId() {
    return (String) arguments.get("camera_id");
  }

  @SuppressWarnings("unchecked")
  public int getPixelFormat() {
    return (int) arguments.get("pixel_format");
  }

  @SuppressWarnings("unchecked")
  public float getTita() {
    return (float) arguments.get("tita");
  }

  @SuppressWarnings("unchecked")
  public float getB() {
    return (float) arguments.get("b");
  }

  @SuppressWarnings("unchecked")
  public int getYi() {
    return (int) arguments.get("yi");
  }

  @SuppressWarnings("unchecked")
  public int getYf() {
    return (int) arguments.get("yf");
  }

  @SuppressWarnings("unchecked")
  public float getRelacion() {
    return (float) arguments.get("relacion");
  }

  @SuppressWarnings("unchecked")
  public int getOrdenCero() {
    return (int) arguments.get("ordenCero");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("camera_id")) {
      String cameraId = (String) arguments.get("camera_id");
      __result.putString("camera_id", cameraId);
    }
    if (arguments.containsKey("pixel_format")) {
      int pixelFormat = (int) arguments.get("pixel_format");
      __result.putInt("pixel_format", pixelFormat);
    }
    if (arguments.containsKey("tita")) {
      float tita = (float) arguments.get("tita");
      __result.putFloat("tita", tita);
    }
    if (arguments.containsKey("b")) {
      float b = (float) arguments.get("b");
      __result.putFloat("b", b);
    }
    if (arguments.containsKey("yi")) {
      int yi = (int) arguments.get("yi");
      __result.putInt("yi", yi);
    }
    if (arguments.containsKey("yf")) {
      int yf = (int) arguments.get("yf");
      __result.putInt("yf", yf);
    }
    if (arguments.containsKey("relacion")) {
      float relacion = (float) arguments.get("relacion");
      __result.putFloat("relacion", relacion);
    }
    if (arguments.containsKey("ordenCero")) {
      int ordenCero = (int) arguments.get("ordenCero");
      __result.putInt("ordenCero", ordenCero);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    CameraFragmentArgs that = (CameraFragmentArgs) object;
    if (arguments.containsKey("camera_id") != that.arguments.containsKey("camera_id")) {
      return false;
    }
    if (getCameraId() != null ? !getCameraId().equals(that.getCameraId()) : that.getCameraId() != null) {
      return false;
    }
    if (arguments.containsKey("pixel_format") != that.arguments.containsKey("pixel_format")) {
      return false;
    }
    if (getPixelFormat() != that.getPixelFormat()) {
      return false;
    }
    if (arguments.containsKey("tita") != that.arguments.containsKey("tita")) {
      return false;
    }
    if (Float.compare(that.getTita(), getTita()) != 0) {
      return false;
    }
    if (arguments.containsKey("b") != that.arguments.containsKey("b")) {
      return false;
    }
    if (Float.compare(that.getB(), getB()) != 0) {
      return false;
    }
    if (arguments.containsKey("yi") != that.arguments.containsKey("yi")) {
      return false;
    }
    if (getYi() != that.getYi()) {
      return false;
    }
    if (arguments.containsKey("yf") != that.arguments.containsKey("yf")) {
      return false;
    }
    if (getYf() != that.getYf()) {
      return false;
    }
    if (arguments.containsKey("relacion") != that.arguments.containsKey("relacion")) {
      return false;
    }
    if (Float.compare(that.getRelacion(), getRelacion()) != 0) {
      return false;
    }
    if (arguments.containsKey("ordenCero") != that.arguments.containsKey("ordenCero")) {
      return false;
    }
    if (getOrdenCero() != that.getOrdenCero()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getCameraId() != null ? getCameraId().hashCode() : 0);
    result = 31 * result + getPixelFormat();
    result = 31 * result + Float.floatToIntBits(getTita());
    result = 31 * result + Float.floatToIntBits(getB());
    result = 31 * result + getYi();
    result = 31 * result + getYf();
    result = 31 * result + Float.floatToIntBits(getRelacion());
    result = 31 * result + getOrdenCero();
    return result;
  }

  @Override
  public String toString() {
    return "CameraFragmentArgs{"
        + "cameraId=" + getCameraId()
        + ", pixelFormat=" + getPixelFormat()
        + ", tita=" + getTita()
        + ", b=" + getB()
        + ", yi=" + getYi()
        + ", yf=" + getYf()
        + ", relacion=" + getRelacion()
        + ", ordenCero=" + getOrdenCero()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(CameraFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull String cameraId, int pixelFormat, float tita, float b, int yi, int yf,
        float relacion, int ordenCero) {
      if (cameraId == null) {
        throw new IllegalArgumentException("Argument \"camera_id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("camera_id", cameraId);
      this.arguments.put("pixel_format", pixelFormat);
      this.arguments.put("tita", tita);
      this.arguments.put("b", b);
      this.arguments.put("yi", yi);
      this.arguments.put("yf", yf);
      this.arguments.put("relacion", relacion);
      this.arguments.put("ordenCero", ordenCero);
    }

    @NonNull
    public CameraFragmentArgs build() {
      CameraFragmentArgs result = new CameraFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setCameraId(@NonNull String cameraId) {
      if (cameraId == null) {
        throw new IllegalArgumentException("Argument \"camera_id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("camera_id", cameraId);
      return this;
    }

    @NonNull
    public Builder setPixelFormat(int pixelFormat) {
      this.arguments.put("pixel_format", pixelFormat);
      return this;
    }

    @NonNull
    public Builder setTita(float tita) {
      this.arguments.put("tita", tita);
      return this;
    }

    @NonNull
    public Builder setB(float b) {
      this.arguments.put("b", b);
      return this;
    }

    @NonNull
    public Builder setYi(int yi) {
      this.arguments.put("yi", yi);
      return this;
    }

    @NonNull
    public Builder setYf(int yf) {
      this.arguments.put("yf", yf);
      return this;
    }

    @NonNull
    public Builder setRelacion(float relacion) {
      this.arguments.put("relacion", relacion);
      return this;
    }

    @NonNull
    public Builder setOrdenCero(int ordenCero) {
      this.arguments.put("ordenCero", ordenCero);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getCameraId() {
      return (String) arguments.get("camera_id");
    }

    @SuppressWarnings("unchecked")
    public int getPixelFormat() {
      return (int) arguments.get("pixel_format");
    }

    @SuppressWarnings("unchecked")
    public float getTita() {
      return (float) arguments.get("tita");
    }

    @SuppressWarnings("unchecked")
    public float getB() {
      return (float) arguments.get("b");
    }

    @SuppressWarnings("unchecked")
    public int getYi() {
      return (int) arguments.get("yi");
    }

    @SuppressWarnings("unchecked")
    public int getYf() {
      return (int) arguments.get("yf");
    }

    @SuppressWarnings("unchecked")
    public float getRelacion() {
      return (float) arguments.get("relacion");
    }

    @SuppressWarnings("unchecked")
    public int getOrdenCero() {
      return (int) arguments.get("ordenCero");
    }
  }
}
