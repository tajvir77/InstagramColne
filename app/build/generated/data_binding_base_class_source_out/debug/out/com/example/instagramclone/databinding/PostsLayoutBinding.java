// Generated by view binder compiler. Do not edit!
package com.example.instagramclone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.instagramclone.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PostsLayoutBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView comments;

  @NonNull
  public final TextView description;

  @NonNull
  public final TextView likes;

  @NonNull
  public final LinearLayout linear1;

  @NonNull
  public final ImageView postImageCommentBtn;

  @NonNull
  public final ImageView postImageHome;

  @NonNull
  public final ImageView postImageLikeBtn;

  @NonNull
  public final ImageView postSaveCommentBtn;

  @NonNull
  public final TextView publisher;

  @NonNull
  public final TextView userNamePost;

  @NonNull
  public final CircleImageView userProfileImagePost;

  private PostsLayoutBinding(@NonNull CardView rootView, @NonNull TextView comments,
      @NonNull TextView description, @NonNull TextView likes, @NonNull LinearLayout linear1,
      @NonNull ImageView postImageCommentBtn, @NonNull ImageView postImageHome,
      @NonNull ImageView postImageLikeBtn, @NonNull ImageView postSaveCommentBtn,
      @NonNull TextView publisher, @NonNull TextView userNamePost,
      @NonNull CircleImageView userProfileImagePost) {
    this.rootView = rootView;
    this.comments = comments;
    this.description = description;
    this.likes = likes;
    this.linear1 = linear1;
    this.postImageCommentBtn = postImageCommentBtn;
    this.postImageHome = postImageHome;
    this.postImageLikeBtn = postImageLikeBtn;
    this.postSaveCommentBtn = postSaveCommentBtn;
    this.publisher = publisher;
    this.userNamePost = userNamePost;
    this.userProfileImagePost = userProfileImagePost;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static PostsLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PostsLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.posts_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PostsLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.comments;
      TextView comments = ViewBindings.findChildViewById(rootView, id);
      if (comments == null) {
        break missingId;
      }

      id = R.id.description;
      TextView description = ViewBindings.findChildViewById(rootView, id);
      if (description == null) {
        break missingId;
      }

      id = R.id.likes;
      TextView likes = ViewBindings.findChildViewById(rootView, id);
      if (likes == null) {
        break missingId;
      }

      id = R.id.linear1;
      LinearLayout linear1 = ViewBindings.findChildViewById(rootView, id);
      if (linear1 == null) {
        break missingId;
      }

      id = R.id.post_image_comment_btn;
      ImageView postImageCommentBtn = ViewBindings.findChildViewById(rootView, id);
      if (postImageCommentBtn == null) {
        break missingId;
      }

      id = R.id.post_image_home;
      ImageView postImageHome = ViewBindings.findChildViewById(rootView, id);
      if (postImageHome == null) {
        break missingId;
      }

      id = R.id.post_image_like_btn;
      ImageView postImageLikeBtn = ViewBindings.findChildViewById(rootView, id);
      if (postImageLikeBtn == null) {
        break missingId;
      }

      id = R.id.post_save_comment_btn;
      ImageView postSaveCommentBtn = ViewBindings.findChildViewById(rootView, id);
      if (postSaveCommentBtn == null) {
        break missingId;
      }

      id = R.id.publisher;
      TextView publisher = ViewBindings.findChildViewById(rootView, id);
      if (publisher == null) {
        break missingId;
      }

      id = R.id.user_name_post;
      TextView userNamePost = ViewBindings.findChildViewById(rootView, id);
      if (userNamePost == null) {
        break missingId;
      }

      id = R.id.user_profile_image_post;
      CircleImageView userProfileImagePost = ViewBindings.findChildViewById(rootView, id);
      if (userProfileImagePost == null) {
        break missingId;
      }

      return new PostsLayoutBinding((CardView) rootView, comments, description, likes, linear1,
          postImageCommentBtn, postImageHome, postImageLikeBtn, postSaveCommentBtn, publisher,
          userNamePost, userProfileImagePost);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
