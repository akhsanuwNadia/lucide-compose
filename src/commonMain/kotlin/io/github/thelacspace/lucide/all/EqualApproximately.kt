package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EqualApproximately") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,15.0)
                curveTo(7.134082317352295,13.636301040649414,9.865917205810547,13.636301040649414,12.0,15.0)
                curveTo(14.134082794189453,16.363698959350586,16.865917205810547,16.363698959350586,19.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,9.0)
                curveTo(7.134082317352295,7.636300563812256,9.865917205810547,7.636300563812256,12.0,9.0)
                curveTo(14.134082794189453,10.363698959350586,16.865917205810547,10.363698959350586,19.0,9.0)
            }
}

public val LucideIcons.All.EqualApproximatelyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EqualApproximately: ImageVector
    @Composable get() = EqualApproximatelyDefinition.asImageVector()
