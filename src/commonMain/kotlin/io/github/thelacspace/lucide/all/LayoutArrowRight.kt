package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LayoutArrowRight") { strokeWidth ->
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
                moveTo(15.0,3.0)
                lineTo(20.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,10.0)
                lineTo(20.0,10.0)
                lineTo(15.0,10.0)
                lineTo(14.0,10.0)
                lineTo(14.0,3.0)
                lineTo(15.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,18.0)
                lineTo(21.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,21.0)
                lineTo(21.0,18.0)
                lineTo(18.0,15.0)
            }
}

public val LucideIcons.All.LayoutArrowRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LayoutArrowRight: ImageVector
    @Composable get() = LayoutArrowRightDefinition.asImageVector()
