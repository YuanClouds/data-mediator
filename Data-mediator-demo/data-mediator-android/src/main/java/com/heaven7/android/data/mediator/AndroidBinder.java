/**
 * Copyright 2017
 group of data-mediator
 member: heaven7(donshine723@gmail.com)

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.heaven7.android.data.mediator;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.heaven7.core.util.ViewHelper;
import com.heaven7.java.data.mediator.Binder;
import com.heaven7.java.data.mediator.DataMediator;
import com.heaven7.java.data.mediator.Property;
import com.heaven7.java.data.mediator.PropertyInterceptor;

/**
 * the binder of android platform. opened in 1.1.0
 * Created by heaven7 on 2017/9/24.
 */
public class AndroidBinder<T> extends Binder<T> {
    /**
     * create binder for target data mediator.
     *
     * @param mMediator the target data mediator.
     */
    public AndroidBinder(DataMediator<T> mMediator) {
        super(mMediator);
    }

    @Override
    public Binder<T> bindVisibility(String property, Object view, boolean forceAsBoolean) {
        if(!(view instanceof View)){
            throw new IllegalArgumentException("must be any child of android.view.View");
        }
        bind(property, new VisibilityBinderCallback<T>((View)view,
                getPropertyInterceptor(), forceAsBoolean));
        return this;
    }

    @Override
    public Binder<T> bindCheckable(String property, Object view){
        if(!(view instanceof Checkable) || !(view instanceof View)){
            throw new IllegalArgumentException("must be Checkable View");
        }
        bind(property, new CheckableBinderCallback<T>((View) view, getPropertyInterceptor()));
        return this;
    }
    @Override
    public Binder<T> bindText(String property, Object tv){
        if(!(tv instanceof TextView)){
            throw new IllegalArgumentException("must be TextView");
        }
        bind(property, new TextBinderCallback<T>((TextView) tv, getPropertyInterceptor()));
        return this;
    }
    @Override
    public Binder<T> bindTextRes(String property, Object tv){
        if(!(tv instanceof TextView)){
            throw new IllegalArgumentException("must be TextView");
        }
        bind(property, new TextResBinderCallback<T>((TextView) tv, getPropertyInterceptor()));
        return this;
    }
    @Override
    public Binder<T> bindTextColor(String property, Object tv){
        if(!(tv instanceof TextView)){
            throw new IllegalArgumentException("must be TextView");
        }
        bind(property, new TextColorBinderCallback<T>((TextView) tv, getPropertyInterceptor()));
        return this;
    }
    @Override
    public Binder<T> bindTextColorRes(String property, Object tv){
        if(!(tv instanceof TextView)){
            throw new IllegalArgumentException("must be TextView");
        }
        bind(property, new TextColorResBinderCallback<T>((TextView) tv, getPropertyInterceptor()));
        return this;
    }
    @Override
    public Binder<T> bindTextSizeRes(String property, Object tv){
        if(!(tv instanceof TextView)){
            throw new IllegalArgumentException("must be TextView");
        }
        bind(property, new TextSizeResBinderCallback<T>((TextView) tv, getPropertyInterceptor()));
        return this;
    }
    @Override
    public Binder<T> bindTextSize(String property, Object tv){
        if(!(tv instanceof TextView)){
            throw new IllegalArgumentException("must be TextView");
        }
        bind(property, new TextSizeDpBinderCallback<T>((TextView) tv, getPropertyInterceptor()));
        return this;
    }
    @Override
    public Binder<T> bindTextSizePx(String property, Object tv) {
        if(!(tv instanceof TextView)){
            throw new IllegalArgumentException("must be TextView");
        }
        bind(property, new TextSizeBinderCallback<T>((TextView) tv, getPropertyInterceptor()));
        return this;
    }

    @Override
    public Binder<T> bindEnable(String property, Object view){
        if(!(view instanceof View)){
            throw new IllegalArgumentException("must be any child of android.view.View");
        }
        bind(property, new EnableBinderCallback<T>((View) view, getPropertyInterceptor()));
        return this;
    }
    @Override
    public Binder<T> bindBackgroundRes(String property, Object view){
        if(!(view instanceof View)){
            throw new IllegalArgumentException("must be any child of android.view.View");
        }
        bind(property, new BackgroundResBinderCallback<T>((View) view, getPropertyInterceptor()));
        return this;
    }
    @Override
    public Binder<T> bindBackground(String property, Object view){
        if(!(view instanceof View)){
            throw new IllegalArgumentException("must be any child of android.view.View");
        }
        bind(property, new BackgroundBinderCallback<T>((View) view, getPropertyInterceptor()));
        return this;
    }
    @Override
    public Binder<T> bindBackgroundColor(String property, Object view){
        if(!(view instanceof View)){
            throw new IllegalArgumentException("must be any child of android.view.View");
        }
        bind(property, new BackgroundColorBinderCallback<T>((View) view, getPropertyInterceptor()));
        return this;
    }
    @Override
    public Binder<T> bindImageUrl(String property, Object imageView, Object imageLoader){
        if(!(imageView instanceof ImageView)){
            throw new IllegalArgumentException("the view must be ImageView");
        }
        if(!(imageLoader instanceof ViewHelper.IImageLoader)){
            throw new IllegalArgumentException("the loader must be  com.heaven7.core.util.ViewHelper.IImageLoader");
        }
        bind(property, new ImageUrlBinderCallback<T>((ImageView)imageView, getPropertyInterceptor(),
                (ViewHelper.IImageLoader) imageLoader));
        return this;
    }
    @Override
    public Binder<T> bindImageUri(String property, Object imageView){
        if(!(imageView instanceof ImageView)){
            throw new IllegalArgumentException("the view must be ImageView");
        }
        bind(property, new ImageUriBinderCallback<T>((ImageView) imageView, getPropertyInterceptor()));
        return this;
    }
    @Override
    public Binder<T> bindImageRes(String property, Object imageView){
        if(!(imageView instanceof ImageView)){
            throw new IllegalArgumentException("the view must be ImageView");
        }
        bind(property, new ImageResBinderCallback<T>((ImageView) imageView, getPropertyInterceptor()));
        return this;
    }
    @Override
    public Binder<T> bindImageDrawable(String property, Object imageView){
        if(!(imageView instanceof ImageView)){
            throw new IllegalArgumentException("the view must be ImageView");
        }
        bind(property, new ImageDrawableBinderCallback<T>((ImageView) imageView, getPropertyInterceptor()));
        return this;
    }
    @Override
    public Binder<T> bindImageBitmap(String property, Object imageView){
        if(!(imageView instanceof ImageView)){
            throw new IllegalArgumentException("the view must be ImageView");
        }
        bind(property, new ImageBitmapBinderCallback<T>((ImageView) imageView, getPropertyInterceptor()));
        return this;
    }
    @Override
    public Binder<T> bindRecyclerList(String property, Object recyclerView){
        if(!(recyclerView instanceof RecyclerView)){
            throw new IllegalArgumentException("the view must be RecyclerView");
        }
        final RecyclerView.Adapter adapter = ((RecyclerView)recyclerView).getAdapter();
        if(adapter == null || !(adapter instanceof BinderCallback)){
            throw new IllegalStateException("RecyclerView must set adapter and the adapter " +
                    "must impl BinderCallback !");
        }
        return bind(property, (BinderCallback<T>) adapter);
    }
    @Override
    public Binder<T> bindList(String property, Object listView){
        if(!(listView instanceof ListView)){
            throw new IllegalArgumentException("the view must be ListView");
        }
        final ListAdapter adapter = ((ListView)listView).getAdapter();
        if(adapter == null || !(adapter instanceof BinderCallback)){
            throw new IllegalStateException("ListView must set adapter and the adapter " +
                    "must impl BinderCallback !");
        }
        return bind(property, (BinderCallback<T>) adapter);
    }

    @Override
    public Binder<T> bindTextGravity(String property, Object textView) {
        if(!(textView instanceof TextView)){
            throw new IllegalArgumentException("must be TextView." );
        }
        return bind(property, new TextGravityCallback<T>((TextView) textView,
                getPropertyInterceptor()));
    }

    @Override
    public Binder<T> bindHintText(String property, Object textView) {
        if(!(textView instanceof TextView)){
            throw new IllegalArgumentException("must be TextView.");
        }
        return bind(property, new HintTextCallback<T>((TextView) textView,
                getPropertyInterceptor()));
    }

    @Override
    public Binder<T> bindHintTextRes(String property, Object textView) {
        if(!(textView instanceof TextView)){
            throw new IllegalArgumentException("must be TextView.");
        }
        return bind(property, new HintTextResCallback<T>((TextView) textView,
                getPropertyInterceptor()));
    }

    @Override
    public Binder<T> bindHintTextColor(String property, Object textView) {
        if(!(textView instanceof TextView)){
            throw new IllegalArgumentException("must be TextView.");
        }
        return bind(property, new HintTextColorCallback<T>((TextView) textView,
                getPropertyInterceptor()));
    }

    @Override
    public Binder<T> bindHintTextColorRes(String property, Object textView) {
        if(!(textView instanceof TextView)){
            throw new IllegalArgumentException("must be TextView.");
        }
        return bind(property, new HintTextColorResCallback<T>((TextView) textView,
                getPropertyInterceptor()));
    }

    @Override
    public Binder<T> bindHighlightColor(String property, Object textView) {
        if(!(textView instanceof TextView)){
            throw new IllegalArgumentException("must be TextView.");
        }
        return bind(property, new HighLightColorCallback<T>((TextView) textView,
                getPropertyInterceptor()));
    }

    @Override
    protected boolean shouldUseWeakMap() {
        return true;
    }
    //=================================== internal class ==========================
    private static class HighLightColorCallback<T> extends SimpleBinderCallback2<T>{
        public HighLightColorCallback(View tv, PropertyInterceptor interceptor) {
            super(tv, interceptor);
        }
        @Override
        protected void apply(Property prop, View view, Object newValue) {
            ((TextView)view).setHighlightColor((Integer) newValue);
        }
    }
    private static class HintTextColorResCallback<T> extends SimpleBinderCallback2<T>{
        public HintTextColorResCallback(View tv, PropertyInterceptor interceptor) {
            super(tv, interceptor);
        }
        @Override
        protected void apply(Property prop, View view, Object newValue) {
            ColorStateList list = view.getResources().getColorStateList((Integer) newValue);
            ((TextView)view).setHintTextColor(list);
        }
    }
    private static class HintTextColorCallback<T> extends SimpleBinderCallback2<T>{
        public HintTextColorCallback(View tv, PropertyInterceptor interceptor) {
            super(tv, interceptor);
        }
        @Override
        protected void apply(Property prop, View view, Object newValue) {
            ((TextView)view).setHintTextColor((Integer) newValue);
        }
    }
    private static class HintTextResCallback<T> extends SimpleBinderCallback2<T>{
        public HintTextResCallback(View tv, PropertyInterceptor interceptor) {
            super(tv, interceptor);
        }
        @Override
        protected void apply(Property prop, View view, Object newValue) {
            ((TextView)view).setHint((Integer) newValue);
        }
    }
    private static class HintTextCallback<T> extends SimpleBinderCallback2<T>{
        public HintTextCallback(View tv, PropertyInterceptor interceptor) {
            super(tv, interceptor);
        }
        @Override
        protected void apply(Property prop, View view, Object newValue) {
            ((TextView)view).setHint((CharSequence) newValue);
        }
    }
    private static class TextGravityCallback<T> extends SimpleBinderCallback2<T>{
        public TextGravityCallback(View tv, PropertyInterceptor interceptor) {
            super(tv, interceptor);
        }
        @Override
        protected void apply(Property prop, View view, Object newValue) {
            ((TextView)view).setGravity((Integer) newValue);
        }
    }
    private static class VisibilityBinderCallback<T> extends SimpleBinderCallback2<T>{

        final boolean mForceAsBoolean;

        public VisibilityBinderCallback(View tv, PropertyInterceptor interceptor,
                                        boolean forceAsBoolean) {
            super(tv, interceptor);
            this.mForceAsBoolean = forceAsBoolean;
        }
        @Override
        protected void apply(Property prop, View view, Object newValue) {
            if(mForceAsBoolean){
                view.setVisibility(Boolean.valueOf(newValue.toString())
                        ? View.VISIBLE : View.GONE);
            }else{
                view.setVisibility(Integer.valueOf(newValue.toString()));
            }
        }
    }

    private static class EnableBinderCallback<T> extends SimpleBinderCallback2<T> {
        public EnableBinderCallback(View tv, PropertyInterceptor interceptor) {
            super(tv,interceptor);
        }
        @Override
        protected void apply(Property prop, View view, Object newValue) {
            view.setEnabled((Boolean) newValue);
        }
    }
    private static class CheckableBinderCallback<T> extends SimpleBinderCallback2<T> {
        public CheckableBinderCallback(View tv, PropertyInterceptor interceptor) {
            super(tv, interceptor);
        }
        @Override
        protected void apply(Property prop, View view, Object newValue) {
            ((Checkable) view).setChecked((Boolean) newValue);
        }
    }
    private static class ImageUriBinderCallback<T> extends SimpleBinderCallback2<T> {
        public ImageUriBinderCallback(ImageView tv, PropertyInterceptor interceptor) {
            super(tv, interceptor);
        }
        @Override
        protected void apply(Property prop, View view, Object newValue) {
            ((ImageView) view).setImageURI((Uri)newValue);
        }
    }
    private static class ImageBitmapBinderCallback<T> extends SimpleBinderCallback2<T> {
        public ImageBitmapBinderCallback(ImageView tv, PropertyInterceptor interceptor) {
            super(tv, interceptor);
        }
        @Override
        protected void apply(Property prop, View view, Object newValue) {
            ((ImageView) view).setImageBitmap((Bitmap) newValue);
        }
    }
    private static class ImageDrawableBinderCallback<T> extends SimpleBinderCallback2<T> {
        public ImageDrawableBinderCallback(ImageView tv, PropertyInterceptor interceptor) {
            super(tv, interceptor);
        }
        @Override
        protected void apply(Property prop, View view, Object newValue) {
            ((ImageView) view).setImageDrawable((Drawable) newValue);
        }
    }

    private static class ImageResBinderCallback<T> extends SimpleBinderCallback2<T> {
        public ImageResBinderCallback(ImageView tv,  PropertyInterceptor interceptor) {
            super(tv, interceptor);
        }
        @Override
        protected void apply(Property prop, View view, Object newValue) {
            ((ImageView) view).setImageResource((Integer) newValue);
        }
    }
    private static class ImageUrlBinderCallback<T> extends SimpleBinderCallback2<T> {
        final ViewHelper.IImageLoader mLoader;
        public ImageUrlBinderCallback(View tv, PropertyInterceptor interceptor,
                                      ViewHelper.IImageLoader loader) {
            super(tv, interceptor);
            this.mLoader = loader;
        }
        @Override
        protected void apply(Property prop, View view, Object newValue) {
            mLoader.load((String) newValue, (ImageView) view);
        }
    }
    private static class BackgroundColorBinderCallback<T> extends SimpleBinderCallback2<T> {
        public BackgroundColorBinderCallback(View tv, PropertyInterceptor interceptor) {
            super(tv, interceptor);
        }
        @Override
        protected void apply(Property prop, View view, Object newValue) {
            view.setBackgroundColor((Integer) newValue);
        }
    }
    private static class BackgroundBinderCallback<T> extends SimpleBinderCallback2<T> {
        public BackgroundBinderCallback(View tv, PropertyInterceptor interceptor) {
            super(tv, interceptor);
        }
        @Override
        protected void apply(Property prop, View view, Object newValue) {
            ViewCompat.setBackground(view, (Drawable) newValue);
        }
    }
    private static class BackgroundResBinderCallback<T> extends SimpleBinderCallback2<T> {
        public BackgroundResBinderCallback(View tv, PropertyInterceptor interceptor) {
            super(tv, interceptor);
        }
        @Override
        protected void apply(Property prop, View view, Object newValue) {
            int resId = Integer.valueOf(newValue.toString());
            view.setBackgroundResource(resId);
        }
    }
    private static class TextBinderCallback<T> extends SimpleBinderCallback2<T> {
        public TextBinderCallback(View tv, PropertyInterceptor interceptor) {
            super(tv, interceptor);
        }
        @Override
        protected void apply(Property prop, View view,  Object newValue) {
            ((TextView)view).setText(String.valueOf(newValue));
        }
    }
    private static class TextResBinderCallback<T> extends SimpleBinderCallback2<T> {
        public TextResBinderCallback(View tv, PropertyInterceptor interceptor) {
            super(tv, interceptor);
        }
        @Override
        protected void apply(Property prop, View view,  Object newValue) {
            ((TextView)view).setText(view.getResources()
                    .getString((Integer) newValue));
        }
    }
    private static class TextSizeResBinderCallback<T> extends SimpleBinderCallback2<T> {
        public TextSizeResBinderCallback(View tv, PropertyInterceptor interceptor) {
            super(tv, interceptor);
        }
        @Override
        protected void apply(Property prop, View view,  Object newValue) {
            ((TextView)view).setTextSize(TypedValue.COMPLEX_UNIT_PX,
                    view.getResources().getDimensionPixelSize((Integer) newValue));
        }
    }
    private static class TextSizeDpBinderCallback<T> extends SimpleBinderCallback2<T> {
        public TextSizeDpBinderCallback(View tv, PropertyInterceptor interceptor) {
            super(tv, interceptor);
        }
        @Override
        protected void apply(Property prop, View view,  Object newValue) {
            ((TextView)view).setTextSize(Float.valueOf(newValue.toString()));
        }
    }
    private static class TextSizeBinderCallback<T> extends SimpleBinderCallback2<T> {
        public TextSizeBinderCallback(View tv, PropertyInterceptor interceptor) {
            super(tv, interceptor);
        }
        @Override
        protected void apply(Property prop, View view,  Object newValue) {
            ((TextView)view).setTextSize(TypedValue.COMPLEX_UNIT_PX,
                    Float.valueOf(newValue.toString()));
        }
    }
    private static class TextColorBinderCallback<T> extends SimpleBinderCallback2<T> {
        public TextColorBinderCallback(View tv, PropertyInterceptor interceptor) {
            super(tv, interceptor);
        }
        @Override
        protected void apply(Property prop, View view,  Object newValue) {
            if(newValue != null) {
                ((TextView) view).setTextColor((Integer) newValue);
            }
        }
    }
    private static class TextColorResBinderCallback<T> extends SimpleBinderCallback2<T> {
        public TextColorResBinderCallback(View tv, PropertyInterceptor interceptor) {
            super(tv, interceptor);
        }
        @Override
        protected void apply(Property prop, View view,  Object newValue) {
            ((TextView) view).setTextColor(
                    view.getResources().getColor((Integer) newValue));
        }
    }

}
