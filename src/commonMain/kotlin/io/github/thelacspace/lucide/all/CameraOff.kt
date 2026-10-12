package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CameraOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.564f,14.558f)
                curveTo(13.917839f,15.622073f,12.681648f,16.176517f,11.457271f,15.951403f)
                curveTo(10.232894f,15.726287f,9.274765f,14.768391f,9.049352f,13.544067f)
                curveTo(8.823938f,12.319745f,9.378083f,11.08342f,10.441999f,10.437f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,20.0f)
                lineTo(4.0f,20.0f)
                curveTo(2.8954306f,20.0f,2.0f,19.10457f,2.0f,18.0f)
                lineTo(2.0f,9.0f)
                curveTo(2.0f,7.8954306f,2.8954306f,7.0f,4.0f,7.0f)
                lineTo(5.9969997f,7.0f)
                curveTo(6.2792907f,7.000119f,6.558409f,6.940479f,6.816f,6.825f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.695f,4.024f)
                curveTo(9.797224f,4.0080194f,9.900534f,3.9999952f,10.004f,4.0f)
                lineTo(13.997f,4.0f)
                curveTo(14.732041f,3.9999895f,15.407855f,4.403174f,15.757f,5.05f)
                lineTo(16.243f,5.9500003f)
                curveTo(16.592144f,6.596826f,17.26796f,7.0000105f,18.003f,7.0f)
                lineTo(20.0f,7.0f)
                curveTo(21.10457f,7.0f,22.0f,7.8954306f,22.0f,9.0f)
                lineTo(22.0f,16.344f)
            }
}

public val LucideIcons.All.CameraOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CameraOff: ImageVector
    @Composable get() = CameraOffDefinition.asImageVector()
