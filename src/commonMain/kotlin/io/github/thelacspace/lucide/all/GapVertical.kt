package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GapVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                lineTo(4.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,12.0f)
                lineTo(10.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,12.0f)
                lineTo(16.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,12.0f)
                lineTo(22.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,21.0f)
                lineTo(3.0f,18.0f)
                curveTo(3.0f,16.89543f,3.8954306f,16.0f,5.0f,16.0f)
                lineTo(19.0f,16.0f)
                curveTo(20.10457f,16.0f,21.0f,16.89543f,21.0f,18.0f)
                lineTo(21.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,3.0f)
                lineTo(3.0f,6.0f)
                curveTo(3.0f,7.1045694f,3.8954306f,8.0f,5.0f,8.0f)
                lineTo(19.0f,8.0f)
                curveTo(20.10457f,8.0f,21.0f,7.1045694f,21.0f,6.0f)
                lineTo(21.0f,3.0f)
            }
}

public val LucideIcons.All.GapVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GapVertical: ImageVector
    @Composable get() = GapVerticalDefinition.asImageVector()
