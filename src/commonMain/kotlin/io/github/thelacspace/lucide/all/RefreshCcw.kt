package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RefreshCcw") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0f,12.0f)
                curveTo(21.0f,7.029437f,16.970562f,3.0f,12.0f,3.0f)
                curveTo(9.483952f,3.009465f,7.0689692f,3.9912236f,5.26f,5.74f)
                lineTo(3.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,3.0f)
                lineTo(3.0f,8.0f)
                lineTo(8.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,12.0f)
                curveTo(3.0f,16.970562f,7.029437f,21.0f,12.0f,21.0f)
                curveTo(14.516048f,20.990536f,16.93103f,20.008776f,18.74f,18.26f)
                lineTo(21.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,16.0f)
                lineTo(21.0f,16.0f)
                lineTo(21.0f,21.0f)
            }
}

public val LucideIcons.All.RefreshCcwDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RefreshCcw: ImageVector
    @Composable get() = RefreshCcwDefinition.asImageVector()
