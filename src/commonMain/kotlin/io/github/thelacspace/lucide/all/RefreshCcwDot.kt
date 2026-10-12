package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RefreshCcwDot") { strokeWidth ->
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
            lucidePath(strokeWidth) {
                moveTo(11.0f,12.0f)
                curveTo(10.998398f,12.358331f,11.188645f,12.69013f,11.498705f,12.86976f)
                curveTo(11.8087635f,13.04939f,12.1912365f,13.04939f,12.501295f,12.86976f)
                curveTo(12.811355f,12.69013f,13.001602f,12.358331f,13.0f,12.0f)
                curveTo(13.001602f,11.641669f,12.811355f,11.30987f,12.501295f,11.13024f)
                curveTo(12.1912365f,10.95061f,11.8087635f,10.95061f,11.498705f,11.13024f)
                curveTo(11.188645f,11.30987f,10.998398f,11.641669f,11.0f,12.0f)
            }
}

public val LucideIcons.All.RefreshCcwDotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RefreshCcwDot: ImageVector
    @Composable get() = RefreshCcwDotDefinition.asImageVector()
