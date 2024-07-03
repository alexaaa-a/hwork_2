// Generated by view binder compiler. Do not edit!
package com.first.homework_2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.first.homework_2.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemProduct1Binding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final ImageView ivImage;

  @NonNull
  public final TextView tvProduct;

  @NonNull
  public final TextView tvSection;

  private ItemProduct1Binding(@NonNull MaterialCardView rootView, @NonNull ImageView ivImage,
      @NonNull TextView tvProduct, @NonNull TextView tvSection) {
    this.rootView = rootView;
    this.ivImage = ivImage;
    this.tvProduct = tvProduct;
    this.tvSection = tvSection;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemProduct1Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemProduct1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_product1, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemProduct1Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivImage;
      ImageView ivImage = ViewBindings.findChildViewById(rootView, id);
      if (ivImage == null) {
        break missingId;
      }

      id = R.id.tvProduct;
      TextView tvProduct = ViewBindings.findChildViewById(rootView, id);
      if (tvProduct == null) {
        break missingId;
      }

      id = R.id.tvSection;
      TextView tvSection = ViewBindings.findChildViewById(rootView, id);
      if (tvSection == null) {
        break missingId;
      }

      return new ItemProduct1Binding((MaterialCardView) rootView, ivImage, tvProduct, tvSection);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}