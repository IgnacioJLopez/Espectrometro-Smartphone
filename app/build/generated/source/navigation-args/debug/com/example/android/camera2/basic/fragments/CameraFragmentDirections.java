package com.example.android.camera2.basic.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.android.camera2.basic.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class CameraFragmentDirections {
  private CameraFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionCameraToPermissions() {
    return new ActionOnlyNavDirections(R.id.action_camera_to_permissions);
  }

  @NonNull
  public static ActionCameraFragmentToLongOndaFragment actionCameraFragmentToLongOndaFragment(
      @NonNull String cameraId, int pixelFormat, float tita, float b, @NonNull float[] h) {
    return new ActionCameraFragmentToLongOndaFragment(cameraId, pixelFormat, tita, b, h);
  }

  public static class ActionCameraFragmentToLongOndaFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionCameraFragmentToLongOndaFragment(@NonNull String cameraId, int pixelFormat,
        float tita, float b, @NonNull float[] h) {
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
    public ActionCameraFragmentToLongOndaFragment setCameraId(@NonNull String cameraId) {
      if (cameraId == null) {
        throw new IllegalArgumentException("Argument \"camera_id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("camera_id", cameraId);
      return this;
    }

    @NonNull
    public ActionCameraFragmentToLongOndaFragment setPixelFormat(int pixelFormat) {
      this.arguments.put("pixel_format", pixelFormat);
      return this;
    }

    @NonNull
    public ActionCameraFragmentToLongOndaFragment setTita(float tita) {
      this.arguments.put("tita", tita);
      return this;
    }

    @NonNull
    public ActionCameraFragmentToLongOndaFragment setB(float b) {
      this.arguments.put("b", b);
      return this;
    }

    @NonNull
    public ActionCameraFragmentToLongOndaFragment setH(@NonNull float[] h) {
      if (h == null) {
        throw new IllegalArgumentException("Argument \"h\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("h", h);
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
      if (arguments.containsKey("h")) {
        float[] h = (float[]) arguments.get("h");
        __result.putFloatArray("h", h);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_camera_fragment_to_longOndaFragment;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionCameraFragmentToLongOndaFragment that = (ActionCameraFragmentToLongOndaFragment) object;
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
      result = 31 * result + java.util.Arrays.hashCode(getH());
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionCameraFragmentToLongOndaFragment(actionId=" + getActionId() + "){"
          + "cameraId=" + getCameraId()
          + ", pixelFormat=" + getPixelFormat()
          + ", tita=" + getTita()
          + ", b=" + getB()
          + ", h=" + getH()
          + "}";
    }
  }
}
