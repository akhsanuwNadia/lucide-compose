package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Eraser") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0f,21.0f)
                lineTo(8.0f,21.0f)
                curveTo(7.4673877f,21.001217f,6.95629f,20.78994f,6.58f,20.413f)
                lineTo(2.586f,16.414f)
                curveTo(1.8052361f,15.632999f,1.8052361f,14.367f,2.586f,13.5859995f)
                lineTo(12.586f,3.5859995f)
                curveTo(12.961097f,3.2107513f,13.469927f,2.9999263f,14.000501f,2.9999263f)
                curveTo(14.531075f,2.9999263f,15.039905f,3.2107513f,15.415001f,3.5859995f)
                lineTo(21.414001f,9.5859995f)
                curveTo(22.194765f,10.367f,22.194765f,11.632999f,21.414001f,12.414f)
                lineTo(12.834f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.082f,11.09f)
                lineTo(13.91f,19.918f)
            }
}

public val LucideIcons.All.EraserDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Eraser: ImageVector
    @Composable get() = EraserDefinition.asImageVector()
