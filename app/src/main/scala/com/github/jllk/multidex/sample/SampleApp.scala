/*
 * Copyright (C) 2016 chentaov5@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jllk.multidex.sample

import android.app.Application
import android.content.Context
import com.github.jllk.multidex.JLLKMultiDexInstaller
import com.github.jllk.multidex.hook.JLLKMultiDexHook

class SampleApp extends Application {

  override def attachBaseContext(base: Context): Unit = {
    super.attachBaseContext(base)
    JLLKMultiDexInstaller.installOne(this, 2) // for R
    JLLKMultiDexInstaller.installRange(this, 3, 4) // for scala

    JLLKMultiDexHook.lazyInstall(SampleModuleMgr.getConfig)
  }
}
