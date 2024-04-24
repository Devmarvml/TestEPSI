package com.simplecity.amp_library.glide.utils;

import android.graphics.Bitmap;

public class BitmapAndSize {
    private final Bitmap bitmap; // Modifier bitmap en tant que constante statique finale ou non public
    private final Size size; // Modifier size en tant que constante statique finale ou non public

    public BitmapAndSize(Bitmap bitmap, Size size) {
        this.bitmap = bitmap;
        this.size = size;
    }

    public Bitmap getBitmap() { // Accesseur pour obtenir le bitmap
        return bitmap;
    }

    public Size getSize() { // Accesseur pour obtenir la taille
        return size;
    }

    // Autres méthodes de la classe...

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BitmapAndSize that = (BitmapAndSize) o;
        if (bitmap != null ? !bitmap.equals(that.bitmap) : that.bitmap != null) return false;
        return size != null ? size.equals(that.size) : that.size == null;
    }

    @Override
    public int hashCode() {
        int result = bitmap != null ? bitmap.hashCode() : 0;
        result = 31 * result + (size != null ? size.hashCode() : 0);
        return result;
    }
}
