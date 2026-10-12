package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LayoutFreeform") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,3.0)
                lineTo(9.0,3.0)
                lineTo(10.0,3.0)
                lineTo(10.0,10.0)
                lineTo(9.0,10.0)
                lineTo(4.0,10.0)
                lineTo(3.0,10.0)
                lineTo(3.0,3.0)
                lineTo(4.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,4.0)
                lineTo(20.0,4.0)
                lineTo(21.0,4.0)
                lineTo(21.0,11.0)
                lineTo(20.0,11.0)
                lineTo(15.0,11.0)
                lineTo(14.0,11.0)
                lineTo(14.0,4.0)
                lineTo(15.0,4.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,14.0)
                lineTo(10.0,14.0)
                lineTo(11.0,14.0)
                lineTo(11.0,21.0)
                lineTo(10.0,21.0)
                lineTo(5.0,21.0)
                lineTo(4.0,21.0)
                lineTo(4.0,14.0)
                lineTo(5.0,14.0)
                close()
            }
}

public val LucideIcons.All.LayoutFreeformDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LayoutFreeform: ImageVector
    @Composable get() = LayoutFreeformDefinition.asImageVector()
