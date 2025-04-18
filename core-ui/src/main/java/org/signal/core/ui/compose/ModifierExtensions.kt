/*
 * Copyright 2025 Signal Messenger, LLC
 * SPDX-License-Identifier: AGPL-3.0-only
 */

package org.signal.core.ui.compose

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.Dp
import org.signal.core.ui.R

/**
 * Applies sensible horizontal padding to the given component.
 */
@Composable
fun Modifier.horizontalGutters(
  gutterSize: Dp = dimensionResource(R.dimen.gutter)
): Modifier {
  return padding(horizontal = gutterSize)
}
