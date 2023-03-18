package sh.christian.ozone.ui.icons

/*
 * Copyright 2022 The Android Open Source Project
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

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.materialIcon
import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector

val Icons.Filled.Repeat: ImageVector
  get() {
    if (_repeat != null) {
      return _repeat!!
    }
    _repeat = materialIcon(name = "Filled.Repeat") {
      materialPath {
        moveTo(7.0f, 7.0f)
        horizontalLineToRelative(10.0f)
        verticalLineToRelative(3.0f)
        lineToRelative(4.0f, -4.0f)
        lineToRelative(-4.0f, -4.0f)
        verticalLineToRelative(3.0f)
        lineTo(5.0f, 5.0f)
        verticalLineToRelative(6.0f)
        horizontalLineToRelative(2.0f)
        lineTo(7.0f, 7.0f)
        close()
        moveTo(17.0f, 17.0f)
        lineTo(7.0f, 17.0f)
        verticalLineToRelative(-3.0f)
        lineToRelative(-4.0f, 4.0f)
        lineToRelative(4.0f, 4.0f)
        verticalLineToRelative(-3.0f)
        horizontalLineToRelative(12.0f)
        verticalLineToRelative(-6.0f)
        horizontalLineToRelative(-2.0f)
        verticalLineToRelative(4.0f)
        close()
      }
    }
    return _repeat!!
  }

private var _repeat: ImageVector? = null
