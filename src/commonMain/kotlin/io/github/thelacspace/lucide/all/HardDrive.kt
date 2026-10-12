package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HardDrive") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,16.0f)
                lineTo(10.01f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.212f,11.577f)
                curveTo(2.0726109f,11.855114f,2.0000207f,12.16191f,1.9999999f,12.473f)
                lineTo(1.9999999f,18.0f)
                curveTo(1.9999999f,18.530434f,2.2107136f,19.03914f,2.5857863f,19.414213f)
                curveTo(2.960859f,19.789286f,3.469567f,20.0f,4.0f,20.0f)
                lineTo(20.0f,20.0f)
                curveTo(21.10457f,20.0f,22.0f,19.10457f,22.0f,18.0f)
                lineTo(22.0f,12.473f)
                curveTo(21.999979f,12.16191f,21.92739f,11.855114f,21.788f,11.577f)
                lineTo(18.55f,5.11f)
                curveTo(18.212269f,4.4303427f,17.518944f,4.000403f,16.76f,4.0f)
                lineTo(7.24f,4.0f)
                curveTo(6.4810557f,4.000403f,5.7877297f,4.430342f,5.45f,5.11f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21.946f,12.013f)
                lineTo(2.054f,12.013f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,16.0f)
                lineTo(6.01f,16.0f)
            }
}

public val LucideIcons.All.HardDriveDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HardDrive: ImageVector
    @Composable get() = HardDriveDefinition.asImageVector()
