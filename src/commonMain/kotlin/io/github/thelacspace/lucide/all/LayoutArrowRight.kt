package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LayoutArrowRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,3.0f)
                lineTo(9.0f,3.0f)
                lineTo(10.0f,3.0f)
                lineTo(10.0f,10.0f)
                lineTo(9.0f,10.0f)
                lineTo(4.0f,10.0f)
                lineTo(3.0f,10.0f)
                lineTo(3.0f,3.0f)
                lineTo(4.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,3.0f)
                lineTo(20.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,10.0f)
                lineTo(20.0f,10.0f)
                lineTo(15.0f,10.0f)
                lineTo(14.0f,10.0f)
                lineTo(14.0f,3.0f)
                lineTo(15.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,18.0f)
                lineTo(21.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,21.0f)
                lineTo(21.0f,18.0f)
                lineTo(18.0f,15.0f)
            }
}

public val LucideIcons.All.LayoutArrowRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LayoutArrowRight: ImageVector
    @Composable get() = LayoutArrowRightDefinition.asImageVector()
