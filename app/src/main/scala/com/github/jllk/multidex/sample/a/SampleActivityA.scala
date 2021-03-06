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
package com.github.jllk.multidex.sample.a

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.github.jllk.multidex.sample.R

class SampleActivityA extends Activity {

  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_a)


  }

  override def onResume(): Unit = {
    super.onResume()
    Toast.makeText(this, SampleObjectA.hello, Toast.LENGTH_SHORT).show()
  }
}
