package com.example.android.camera2.basic.fragments;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.android.camera2.basic.R;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class MedicionFragmentDirections {
  private MedicionFragmentDirections() {
  }

  @NonNull
  public static ActionMedicionFragmentToImagenEspectroFragment actionMedicionFragmentToImagenEspectroFragment(
      @NonNull Bitmap bitmap, float tita, float b, @NonNull float[] h, float relacion,
      int ordenCero) {
    return new ActionMedicionFragmentToImagenEspectroFragment(bitmap, tita, b, h, relacion, ordenCero);
  }

  public static class ActionMedicionFragmentToImagenEspectroFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionMedicionFragmentToImagenEspectroFragment(@NonNull Bitmap bitmap, float tita,
        float b, @NonNull float[] h, float relacion, int ordenCero) {
      if (bitmap == null) {
        throw new IllegalArgumentException("Argument \"bitmap\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("bitmap", bitmap);
      this.arguments.put("tita", tita);
      this.arguments.put("b", b);
      if (h == null) {
        throw new IllegalArgumentException("Argument \"h\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("h", h);
      this.arguments.put("relacion", relacion);
      this.arguments.put("ordenCero", ordenCero);
    }

    @NonNull
    public ActionMedicionFragmentToImagenEspectroFragment setBitmap(@NonNull Bitmap bitmap) {
      if (bitmap == null) {
        throw new IllegalArgumentException("Argument \"bitmap\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("bitmap", bitmap);
      return this;
    }

    @NonNull
    public ActionMedicionFragmentToImagenEspectroFragment setTita(float tita) {
      this.arguments.put("tita", tita);
      return this;
    }

    @NonNull
    public ActionMedicionFragmentToImagenEspectroFragment setB(float b) {
      this.arguments.put("b", b);
      return this;
    }

    @NonNull
    public ActionMedicionFragmentToImagenEspectroFragment setH(@NonNull float[] h) {
      if (h == null) {
        throw new IllegalArgumentException("Argument \"h\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("h", h);
      return this;
    }

    @NonNull
    public ActionMedicionFragmentToImagenEspectroFragment setRelacion(float relacion) {
      this.arguments.put("relacion", relacion);
      return this;
    }

    @NonNull
    public ActionMedicionFragmentToImagenEspectroFragment setOrdenCero(int ordenCero) {
      this.arguments.put("ordenCero", ordenCero);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("bitmap")) {
        Bitmap bitmap = (Bitmap) arguments.get("bitmap");
        if (Parcelable.class.isAssignableFrom(Bitmap.class) || bitmap == null) {
          __result.putParcelable("bitmap", Parcelable.class.cast(bitmap));
        } else if (Serializable.class.isAssignableFrom(Bitmap.class)) {
          __result.putSerializable("bitmap", Serializable.class.cast(bitmap));
        } else {
          throw new UnsupportedOperationException(Bitmap.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
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
    public int getActionId() {
      return R.id.action_medicionFragment_to_imagenEspectroFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Bitmap getBitmap() {
      return (Bitmap) arguments.get("bitmap");
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
    public float getRelacion() {
      return (float) arguments.get("relacion");
    }

    @SuppressWarnings("unchecked")
    public int getOrdenCero() {
      return (int) arguments.get("ordenCero");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionMedicionFragmentToImagenEspectroFragment that = (ActionMedicionFragmentToImagenEspectroFragment) object;
      if (arguments.containsKey("bitmap") != that.arguments.containsKey("bitmap")) {
        return false;
      }
      if (getBitmap() != null ? !getBitmap().equals(that.getBitmap()) : that.getBitmap() != null) {
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
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getBitmap() != null ? getBitmap().hashCode() : 0);
      result = 31 * result + Float.floatToIntBits(getTita());
      result = 31 * result + Float.floatToIntBits(getB());
      result = 31 * result + java.util.Arrays.hashCode(getH());
      result = 31 * result + Float.floatToIntBits(getRelacion());
      result = 31 * result + getOrdenCero();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionMedicionFragmentToImagenEspectroFragment(actionId=" + getActionId() + "){"
          + "bitmap=" + getBitmap()
          + ", tita=" + getTita()
          + ", b=" + getB()
          + ", h=" + getH()
          + ", relacion=" + getRelacion()
          + ", ordenCero=" + getOrdenCero()
          + "}";
    }
  }
}
