package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WebcamOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,22.0f)
                lineTo(12.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.754f,7.096f)
                curveTo(13.807664f,7.369512f,14.630487f,8.192336f,14.903999f,9.246f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.863f,12.873f)
                curveTo(11.805948f,13.190257f,10.66006f,12.901515f,9.879567f,12.121231f)
                curveTo(9.099075f,11.340948f,8.810026f,10.195137f,9.127f,9.1380005f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.566f,16.57f)
                curveTo(13.3863535f,18.78347f,9.077596f,18.400465f,6.338229f,15.660852f)
                curveTo(3.5988626f,12.92124f,3.2162435f,8.612448f,5.43f,5.433f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,22.0f)
                lineTo(17.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.478f,2.817f)
                curveTo(11.54925f,1.3110943f,15.238137f,1.9244388f,17.656849f,4.34315f)
                curveTo(20.07556f,6.761862f,20.688904f,10.450749f,19.182999f,13.521999f)
            }
}

public val LucideIcons.All.WebcamOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WebcamOff: ImageVector
    @Composable get() = WebcamOffDefinition.asImageVector()
