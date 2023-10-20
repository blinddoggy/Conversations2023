// Generated by data binding compiler. Do not edit!
package eu.siacs.conversations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.makeramen.roundedimageview.RoundedImageView;
import eu.siacs.conversations.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class SearchResultItemBinding extends ViewDataBinding {
  @NonNull
  public final RoundedImageView avatar;

  @NonNull
  public final TextView description;

  @NonNull
  public final TextView language;

  @NonNull
  public final TextView name;

  @NonNull
  public final TextView room;

  protected SearchResultItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RoundedImageView avatar, TextView description, TextView language, TextView name,
      TextView room) {
    super(_bindingComponent, _root, _localFieldCount);
    this.avatar = avatar;
    this.description = description;
    this.language = language;
    this.name = name;
    this.room = room;
  }

  @NonNull
  public static SearchResultItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.search_result_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SearchResultItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SearchResultItemBinding>inflateInternal(inflater, R.layout.search_result_item, root, attachToRoot, component);
  }

  @NonNull
  public static SearchResultItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.search_result_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SearchResultItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SearchResultItemBinding>inflateInternal(inflater, R.layout.search_result_item, null, false, component);
  }

  public static SearchResultItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static SearchResultItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (SearchResultItemBinding)bind(component, view, R.layout.search_result_item);
  }
}
