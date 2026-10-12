package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Merge") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0,6.0)
                lineTo(12.0,2.0)
                lineTo(16.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,12.300000190734863)
                curveTo(12.011545181274414,13.376006126403809,11.589071273803711,14.41128158569336,10.82800006866455,15.17199993133545)
                lineTo(4.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,22.0)
                lineTo(15.0,17.0)
            }
}

public val LucideIcons.All.MergeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Merge: ImageVector
    @Composable get() = MergeDefinition.asImageVector()
