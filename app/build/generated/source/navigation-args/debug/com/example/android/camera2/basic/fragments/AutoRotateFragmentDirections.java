package com.example.android.camera2.basic.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.android.camera2.basic.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class AutoRotateFragmentDirections {
  private AutoRotateFragmentDirections() {
  }

  @NonNull
  public static ActionAutoRotateFragmentToCameraFragment actionAutoRotateFragmentToCameraFragment(
      @NonNull String cameraId, int pixelFormat, float tita, float b) {
    return new ActionAutoRotateFragmentToCameraFragment(cameraId, pixelFormat, tita, b);
  }

  public static class ActionAutoRotateFragmentToCameraFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionAutoRotateFragmentToCameraFragment(@NonNull String cameraId, int pixelFormat,
        float tita, float b) {
      if (cameraId == null) {
        throw new IllegalArgumentException("Argument \"camera_id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("camera_id", cameraId);
      this.arguments.put("pixel_format", pixelFormat);
      this.arguments.put("tita", tita);
      this.arguments.put("b", b);
    }

    @NonNull
    public ActionAutoRotateFragmentToCameraFragment setCameraId(@NonNull String cameraId) {
      if (cameraId == null) {
        throw new IllegalArgumentException("Argument \"camera_id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("camera_id", cameraId);
      return this;
    }

    @NonNull
    public ActionAutoRotateFragmentToCameraFragment setPixelFormat(int pixelFormat) {
      this.arguments.put("pixel_format", pixelFormat);
      return this;
    }

    @NonNull
    public ActionAutoRotateFragmentToCameraFragment setTita(float tita) {
      this.arguments.put("tita", tita);
      return this;
    }

    @NonNull
    public ActionAutoRotateFragmentToCameraFragment setB(float b) {
      this.arguments.put("b", b);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_autoRotateFragment_to_camera_fragment;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionAutoRotateFragmentToCameraFragment that = (ActionAutoRotateFragmentToCameraFragment) object;
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
      if (getActionId() != that.getActionId()) {
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
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionAutoRotateFragmentToCameraFragment(actionId=" + getActionId() + "){"
          + "cameraId=" + getCameraId()
          + ", pixelFormat=" + getPixelFormat()
          + ", tita=" + getTita()
          + ", b=" + getB()
          + "}";
    }
  }
}
