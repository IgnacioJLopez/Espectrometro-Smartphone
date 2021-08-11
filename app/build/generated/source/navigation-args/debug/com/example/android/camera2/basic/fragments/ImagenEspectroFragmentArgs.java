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

public class ImagenEspectroFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ImagenEspectroFragmentArgs() {
  }

  private ImagenEspectroFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ImagenEspectroFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ImagenEspectroFragmentArgs __result = new ImagenEspectroFragmentArgs();
    bundle.setClassLoader(ImagenEspectroFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("datosX")) {
      int[] datosX;
      datosX = bundle.getIntArray("datosX");
      if (datosX == null) {
        throw new IllegalArgumentException("Argument \"datosX\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("datosX", datosX);
    } else {
      throw new IllegalArgumentException("Required argument \"datosX\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("datosL")) {
      float[] datosL;
      datosL = bundle.getFloatArray("datosL");
      if (datosL == null) {
        throw new IllegalArgumentException("Argument \"datosL\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("datosL", datosL);
    } else {
      throw new IllegalArgumentException("Required argument \"datosL\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("datosR")) {
      float[] datosR;
      datosR = bundle.getFloatArray("datosR");
      if (datosR == null) {
        throw new IllegalArgumentException("Argument \"datosR\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("datosR", datosR);
    } else {
      throw new IllegalArgumentException("Required argument \"datosR\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("datosG")) {
      float[] datosG;
      datosG = bundle.getFloatArray("datosG");
      if (datosG == null) {
        throw new IllegalArgumentException("Argument \"datosG\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("datosG", datosG);
    } else {
      throw new IllegalArgumentException("Required argument \"datosG\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("datosB")) {
      float[] datosB;
      datosB = bundle.getFloatArray("datosB");
      if (datosB == null) {
        throw new IllegalArgumentException("Argument \"datosB\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("datosB", datosB);
    } else {
      throw new IllegalArgumentException("Required argument \"datosB\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public int[] getDatosX() {
    return (int[]) arguments.get("datosX");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public float[] getDatosL() {
    return (float[]) arguments.get("datosL");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public float[] getDatosR() {
    return (float[]) arguments.get("datosR");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public float[] getDatosG() {
    return (float[]) arguments.get("datosG");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public float[] getDatosB() {
    return (float[]) arguments.get("datosB");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("datosX")) {
      int[] datosX = (int[]) arguments.get("datosX");
      __result.putIntArray("datosX", datosX);
    }
    if (arguments.containsKey("datosL")) {
      float[] datosL = (float[]) arguments.get("datosL");
      __result.putFloatArray("datosL", datosL);
    }
    if (arguments.containsKey("datosR")) {
      float[] datosR = (float[]) arguments.get("datosR");
      __result.putFloatArray("datosR", datosR);
    }
    if (arguments.containsKey("datosG")) {
      float[] datosG = (float[]) arguments.get("datosG");
      __result.putFloatArray("datosG", datosG);
    }
    if (arguments.containsKey("datosB")) {
      float[] datosB = (float[]) arguments.get("datosB");
      __result.putFloatArray("datosB", datosB);
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
    ImagenEspectroFragmentArgs that = (ImagenEspectroFragmentArgs) object;
    if (arguments.containsKey("datosX") != that.arguments.containsKey("datosX")) {
      return false;
    }
    if (getDatosX() != null ? !getDatosX().equals(that.getDatosX()) : that.getDatosX() != null) {
      return false;
    }
    if (arguments.containsKey("datosL") != that.arguments.containsKey("datosL")) {
      return false;
    }
    if (getDatosL() != null ? !getDatosL().equals(that.getDatosL()) : that.getDatosL() != null) {
      return false;
    }
    if (arguments.containsKey("datosR") != that.arguments.containsKey("datosR")) {
      return false;
    }
    if (getDatosR() != null ? !getDatosR().equals(that.getDatosR()) : that.getDatosR() != null) {
      return false;
    }
    if (arguments.containsKey("datosG") != that.arguments.containsKey("datosG")) {
      return false;
    }
    if (getDatosG() != null ? !getDatosG().equals(that.getDatosG()) : that.getDatosG() != null) {
      return false;
    }
    if (arguments.containsKey("datosB") != that.arguments.containsKey("datosB")) {
      return false;
    }
    if (getDatosB() != null ? !getDatosB().equals(that.getDatosB()) : that.getDatosB() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + java.util.Arrays.hashCode(getDatosX());
    result = 31 * result + java.util.Arrays.hashCode(getDatosL());
    result = 31 * result + java.util.Arrays.hashCode(getDatosR());
    result = 31 * result + java.util.Arrays.hashCode(getDatosG());
    result = 31 * result + java.util.Arrays.hashCode(getDatosB());
    return result;
  }

  @Override
  public String toString() {
    return "ImagenEspectroFragmentArgs{"
        + "datosX=" + getDatosX()
        + ", datosL=" + getDatosL()
        + ", datosR=" + getDatosR()
        + ", datosG=" + getDatosG()
        + ", datosB=" + getDatosB()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(ImagenEspectroFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull int[] datosX, @NonNull float[] datosL, @NonNull float[] datosR,
        @NonNull float[] datosG, @NonNull float[] datosB) {
      if (datosX == null) {
        throw new IllegalArgumentException("Argument \"datosX\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("datosX", datosX);
      if (datosL == null) {
        throw new IllegalArgumentException("Argument \"datosL\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("datosL", datosL);
      if (datosR == null) {
        throw new IllegalArgumentException("Argument \"datosR\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("datosR", datosR);
      if (datosG == null) {
        throw new IllegalArgumentException("Argument \"datosG\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("datosG", datosG);
      if (datosB == null) {
        throw new IllegalArgumentException("Argument \"datosB\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("datosB", datosB);
    }

    @NonNull
    public ImagenEspectroFragmentArgs build() {
      ImagenEspectroFragmentArgs result = new ImagenEspectroFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setDatosX(@NonNull int[] datosX) {
      if (datosX == null) {
        throw new IllegalArgumentException("Argument \"datosX\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("datosX", datosX);
      return this;
    }

    @NonNull
    public Builder setDatosL(@NonNull float[] datosL) {
      if (datosL == null) {
        throw new IllegalArgumentException("Argument \"datosL\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("datosL", datosL);
      return this;
    }

    @NonNull
    public Builder setDatosR(@NonNull float[] datosR) {
      if (datosR == null) {
        throw new IllegalArgumentException("Argument \"datosR\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("datosR", datosR);
      return this;
    }

    @NonNull
    public Builder setDatosG(@NonNull float[] datosG) {
      if (datosG == null) {
        throw new IllegalArgumentException("Argument \"datosG\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("datosG", datosG);
      return this;
    }

    @NonNull
    public Builder setDatosB(@NonNull float[] datosB) {
      if (datosB == null) {
        throw new IllegalArgumentException("Argument \"datosB\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("datosB", datosB);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public int[] getDatosX() {
      return (int[]) arguments.get("datosX");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public float[] getDatosL() {
      return (float[]) arguments.get("datosL");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public float[] getDatosR() {
      return (float[]) arguments.get("datosR");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public float[] getDatosG() {
      return (float[]) arguments.get("datosG");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public float[] getDatosB() {
      return (float[]) arguments.get("datosB");
    }
  }
}
