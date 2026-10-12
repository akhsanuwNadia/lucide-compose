package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GamepadDirectional") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.146f,15.854f)
                curveTo(11.372398f,15.627324f,11.679627f,15.499955f,12.0f,15.499955f)
                curveTo(12.320373f,15.499955f,12.627602f,15.627324f,12.854f,15.854f)
                lineTo(14.414f,17.414f)
                curveTo(14.789099f,17.788984f,14.9998865f,18.29761f,15.0f,18.828f)
                lineTo(15.0f,21.0f)
                curveTo(15.0f,21.552284f,14.552285f,22.0f,14.0f,22.0f)
                lineTo(10.0f,22.0f)
                curveTo(9.447715f,22.0f,9.0f,21.552284f,9.0f,21.0f)
                lineTo(9.0f,18.828f)
                curveTo(9.0001135f,18.29761f,9.210901f,17.788984f,9.586f,17.414f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(18.828f,15.0f)
                curveTo(18.29761f,14.9998865f,17.788984f,14.789099f,17.414f,14.414f)
                lineTo(15.854f,12.854f)
                curveTo(15.627324f,12.627602f,15.499955f,12.320373f,15.499955f,12.0f)
                curveTo(15.499955f,11.679627f,15.627324f,11.372398f,15.854f,11.146f)
                lineTo(17.414f,9.586f)
                curveTo(17.788984f,9.210901f,18.29761f,9.0001135f,18.828f,9.0f)
                lineTo(21.0f,9.0f)
                curveTo(21.552284f,9.0f,22.0f,9.447715f,22.0f,10.0f)
                lineTo(22.0f,14.0f)
                curveTo(22.0f,14.552285f,21.552284f,15.0f,21.0f,15.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.586f,14.414f)
                curveTo(6.2110147f,14.789099f,5.7023897f,14.9998865f,5.172f,15.0f)
                lineTo(3.0f,15.0f)
                curveTo(2.4477153f,15.0f,2.0f,14.552285f,2.0f,14.0f)
                lineTo(2.0f,10.0f)
                curveTo(2.0f,9.447715f,2.4477153f,9.0f,3.0f,9.0f)
                lineTo(5.172f,9.0f)
                curveTo(5.7023897f,9.0001135f,6.2110147f,9.210901f,6.586f,9.586f)
                lineTo(8.146f,11.146f)
                curveTo(8.372676f,11.372398f,8.500045f,11.679627f,8.500045f,12.0f)
                curveTo(8.500045f,12.320373f,8.372676f,12.627602f,8.146f,12.854f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,3.0f)
                curveTo(9.0f,2.4477153f,9.447715f,2.0f,10.0f,2.0f)
                lineTo(14.0f,2.0f)
                curveTo(14.552285f,2.0f,15.0f,2.4477153f,15.0f,3.0f)
                lineTo(15.0f,5.172f)
                curveTo(14.9998865f,5.7023897f,14.789099f,6.2110147f,14.414f,6.586f)
                lineTo(12.854f,8.146f)
                curveTo(12.627602f,8.372676f,12.320373f,8.500045f,12.0f,8.500045f)
                curveTo(11.679627f,8.500045f,11.372398f,8.372676f,11.146f,8.146f)
                lineTo(9.586f,6.586f)
                curveTo(9.210901f,6.2110147f,9.0001135f,5.7023897f,9.0f,5.172f)
                close()
            }
}

public val LucideIcons.All.GamepadDirectionalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GamepadDirectional: ImageVector
    @Composable get() = GamepadDirectionalDefinition.asImageVector()
