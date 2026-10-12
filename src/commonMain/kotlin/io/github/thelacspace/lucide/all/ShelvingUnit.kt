package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShelvingUnit") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,12.0f)
                lineTo(12.0f,9.0f)
                curveTo(12.0f,8.447715f,11.552285f,8.0f,11.0f,8.0f)
                lineTo(9.0f,8.0f)
                curveTo(8.447715f,8.0f,8.0f,8.447715f,8.0f,9.0f)
                lineTo(8.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,20.0f)
                lineTo(16.0f,17.0f)
                curveTo(16.0f,16.447716f,15.552285f,16.0f,15.0f,16.0f)
                lineTo(13.0f,16.0f)
                curveTo(12.447715f,16.0f,12.0f,16.447716f,12.0f,17.0f)
                lineTo(12.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,22.0f)
                lineTo(20.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,12.0f)
                lineTo(20.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,20.0f)
                lineTo(20.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,2.0f)
                lineTo(4.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,4.0f)
                lineTo(20.0f,4.0f)
            }
}

public val LucideIcons.All.ShelvingUnitDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShelvingUnit: ImageVector
    @Composable get() = ShelvingUnitDefinition.asImageVector()
