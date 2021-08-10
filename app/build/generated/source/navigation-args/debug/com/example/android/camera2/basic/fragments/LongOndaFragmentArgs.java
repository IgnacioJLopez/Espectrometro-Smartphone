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

public class LongOndaFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private LongOndaFragmentArgs() {
  }

  private LongOndaFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static LongOndaFragmentArgs fromBundle(@NonNull Bundle bundle) {
    LongOndaFragmentArgs __result = new LongOndaFragmentArgs();
    bundle.setClassLoader(LongOndaFragmentArgs.class.getClassLoader());
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
    if (bundle.containsKey("h")) {
      float[] h;
      h = bundle.getFloatArray("h");
      if (h == null) {
        throw new IllegalArgumentException("Argument \"h\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("h", h);
    } else {
      throw new IllegalArgumentException("Required argument \"h\" is missing and does not have an android:defaultValue");
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
  @NonNull
  public float[] getH() {
    return (float[]) arguments.get("h");
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
    if (arguments.containsKey("h")) {
      float[] h = (float[]) arguments.get("h");
      __result.putFloatArray("h", h);
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
    LongOndaFragmentArgs that = (LongOndaFragmentArgs) object;
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
    if (arguments.containsKey("h") != that.arguments.containsKey("h")) {
      return false;
    }
    if (getH() != null ? !getH().equals(that.getH()) : that.getH() != null) {
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
    result = 31 * result + java.util.Arrays.hashCode(getH());
    return result;
  }

  @Override
  public String toString() {
    return "LongOndaFragmentArgs{"
        + "cameraId=" + getCameraId()
        + ", pixelFormat=" + getPixelFormat()
        + ", tita=" + getTita()
        + ", b=" + getB()
        + ", h=" + getH()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(LongOndaFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull String cameraId, int pixelFormat, float tita, float b,
        @NonNull float[] h) {
      if (cameraId == null) {
        throw new IllegalArgumentException("Argument \"camera_id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("camera_id", cameraId);
      this.arguments.put("pixel_format", pixelFormat);
      this.arguments.put("tita", tita);
      this.arguments.put("b", b);
      if (h == null) {
        throw new IllegalArgumentException("Argument \"h\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("h", h);
    }

    @NonNull
    public LongOndaFragmentArgs build() {
      LongOndaFragmentArgs result = new LongOndaFragmentArgs(arguments);
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
    public Builder setH(@NonNull float[] h) {
      if (h == null) {
        throw new IllegalArgumentException("Argument \"h\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("h", h);
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
    @NonNull
    public float[] getH() {
      return (float[]) arguments.get("h");
    }
  }
}
