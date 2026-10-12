package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FunnelX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.531f,3.0f)
                lineTo(3.0f,3.0f)
                curveTo(2.6049018f,3.0001426f,2.2469287f,3.2329f,2.0865042f,3.593963f)
                curveTo(1.9260798f,3.9550261f,1.9932841f,4.3766947f,2.258f,4.67f)
                lineTo(9.483f,12.659f)
                curveTo(9.8155365f,13.026501f,9.999775f,13.504382f,10.0f,14.0f)
                lineTo(10.0f,20.0f)
                curveTo(9.999824f,20.379026f,10.213948f,20.725576f,10.5529995f,20.895f)
                lineTo(12.5529995f,21.895f)
                curveTo(12.863061f,22.049938f,13.231244f,22.033264f,13.526031f,21.850933f)
                curveTo(13.820818f,21.6686f,14.000162f,21.346619f,14.0f,21.0f)
                lineTo(14.0f,14.0f)
                curveTo(14.000225f,13.504382f,14.1844635f,13.026501f,14.517f,12.659f)
                lineTo(14.944f,12.186001f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5f,3.5f)
                lineTo(21.5f,8.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.5f,3.5f)
                lineTo(16.5f,8.5f)
            }
}

public val LucideIcons.All.FunnelXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FunnelX: ImageVector
    @Composable get() = FunnelXDefinition.asImageVector()
