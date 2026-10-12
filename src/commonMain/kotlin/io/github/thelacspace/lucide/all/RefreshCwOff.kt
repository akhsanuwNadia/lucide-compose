package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RefreshCwOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0f,8.0f)
                lineTo(18.74f,5.74f)
                curveTo(16.93103f,3.9912236f,14.516048f,3.009465f,12.0f,3.0f)
                curveTo(11.0f,3.0f,10.03f,3.16f,9.13f,3.47f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,16.0f)
                lineTo(3.0f,16.0f)
                lineTo(3.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,12.0f)
                curveTo(3.0f,9.51f,4.0f,7.26f,5.64f,5.64f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,16.0f)
                lineTo(5.26f,18.26f)
                curveTo(7.0689692f,20.008776f,9.483952f,20.990536f,12.0f,21.0f)
                curveTo(14.49f,21.0f,16.74f,20.0f,18.36f,18.36f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,12.0f)
                curveTo(21.0f,13.0f,20.84f,13.97f,20.53f,14.87f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,3.0f)
                lineTo(21.0f,8.0f)
                lineTo(16.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,22.0f)
                lineTo(2.0f,2.0f)
            }
}

public val LucideIcons.All.RefreshCwOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RefreshCwOff: ImageVector
    @Composable get() = RefreshCwOffDefinition.asImageVector()
