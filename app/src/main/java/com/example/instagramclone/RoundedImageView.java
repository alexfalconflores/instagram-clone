package com.example.instagramclone;

import android.support.v4.graphics.drawable.*;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

@SuppressWarnings({"WeakerAccess", "StatementWithEmptyBody"})
public class RoundedImageView extends androidx.appcompat.widget.AppCompatImageView {
    public RoundedImageView(@NonNull @org.jetbrains.annotations.NotNull Context context) {
        super(context);
    }

    public RoundedImageView(@NonNull @org.jetbrains.annotations.NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public RoundedImageView(@NonNull @org.jetbrains.annotations.NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        float radius = 20f;
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        RoundedBitmapDrawable rid = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        rid.setCornerRadius(bitmap.getWidth() * radius);
        super.setImageDrawable(rid);
    }
}
