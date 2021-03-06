/**
 * Copyright 2015 bingoogolapple
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hao.common.adapter;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.ViewParent;

/**
 * 作者:linguoding 邮箱：linggoudingg@gmail.com
 * 创建时间:16/11/10 下午9:34
 * 描述:
 */
public class BaseBindingViewHolder<B extends ViewDataBinding> extends RecyclerView.ViewHolder {
    private B mBinding;
    protected BaseBindingRecyclerViewAdapter mBindingRecyclerViewAdapter;

    public BaseBindingViewHolder(BaseBindingRecyclerViewAdapter bindingRecyclerViewAdapter, B binding) {
        super(binding.getRoot());
        mBindingRecyclerViewAdapter = bindingRecyclerViewAdapter;
        mBinding = binding;
    }

    public B getBinding() {
        return mBinding;
    }

    public RecyclerView getParent() {
        ViewParent parent = mBinding.getRoot().getParent();
        if (parent != null) {
            return (RecyclerView) parent;
        }
        return null;
    }

    public int getAdapterPositionWrapper() {
        if (mBindingRecyclerViewAdapter.getHeadersCount() > 0) {
            return getAdapterPosition() - mBindingRecyclerViewAdapter.getHeadersCount();
        } else {
            return getAdapterPosition();
        }
    }
}