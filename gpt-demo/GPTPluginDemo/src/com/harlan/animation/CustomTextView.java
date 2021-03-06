/**
 * Copyright (c) 2014 Baidu, Inc. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.harlan.animation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * CustomTextView
 *
 * @author liuhaitao
 * @since 2014-06-05
 */
public class CustomTextView extends TextView {

    /**
     * 构造方法
     *
     * @param context Context
     */
    public CustomTextView(Context context) {
        super(context);
        setText("View 插件来自：" + context.getResources().getString(R.string.app_name));

    }

    /**
     * 构造方法
     *
     * @param context Context
     * @param attrs   AttributeSet
     */
    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    /**
     * 构造方法
     *
     * @param context  Context
     * @param attrs    AttributeSet
     * @param defStyle defStyle
     */
    public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

    }

}

