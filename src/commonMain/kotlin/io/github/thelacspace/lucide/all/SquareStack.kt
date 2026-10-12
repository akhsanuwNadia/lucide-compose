package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareStack") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,10.0f)
                curveTo(2.9f,10.0f,2.0f,9.1f,2.0f,8.0f)
                lineTo(2.0f,4.0f)
                curveTo(2.0f,2.9f,2.9f,2.0f,4.0f,2.0f)
                lineTo(8.0f,2.0f)
                curveTo(9.1f,2.0f,10.0f,2.9f,10.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,16.0f)
                curveTo(8.9f,16.0f,8.0f,15.1f,8.0f,14.0f)
                lineTo(8.0f,10.0f)
                curveTo(8.0f,8.9f,8.9f,8.0f,10.0f,8.0f)
                lineTo(14.0f,8.0f)
                curveTo(15.1f,8.0f,16.0f,8.9f,16.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,14.0f)
                lineTo(20.0f,14.0f)
                lineTo(22.0f,14.0f)
                lineTo(22.0f,22.0f)
                lineTo(20.0f,22.0f)
                lineTo(16.0f,22.0f)
                lineTo(14.0f,22.0f)
                lineTo(14.0f,14.0f)
                lineTo(16.0f,14.0f)
                close()
            }
}

public val LucideIcons.All.SquareStackDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareStack: ImageVector
    @Composable get() = SquareStackDefinition.asImageVector()
