package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GapHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,8.0f)
                lineTo(12.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,14.0f)
                lineTo(12.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,20.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,3.0f)
                lineTo(18.0f,3.0f)
                curveTo(16.89543f,3.0f,16.0f,3.8954306f,16.0f,5.0f)
                lineTo(16.0f,19.0f)
                curveTo(16.0f,20.10457f,16.89543f,21.0f,18.0f,21.0f)
                lineTo(21.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,3.0f)
                lineTo(6.0f,3.0f)
                curveTo(7.1045694f,3.0f,8.0f,3.8954306f,8.0f,5.0f)
                lineTo(8.0f,19.0f)
                curveTo(8.0f,20.10457f,7.1045694f,21.0f,6.0f,21.0f)
                lineTo(3.0f,21.0f)
            }
}

public val LucideIcons.All.GapHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GapHorizontal: ImageVector
    @Composable get() = GapHorizontalDefinition.asImageVector()
