package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MonitorPlay") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.033f,9.44f)
                curveTo(15.232872f,9.555658f,15.355949f,9.769076f,15.355949f,10.0f)
                curveTo(15.355949f,10.230923f,15.232872f,10.444341f,15.033f,10.559999f)
                lineTo(10.968f,12.912f)
                curveTo(10.7681875f,13.027602f,10.521828f,13.027605f,10.322011f,12.912009f)
                curveTo(10.122194f,12.796412f,9.99939f,12.582843f,10.0f,12.351999f)
                lineTo(10.0f,7.648f)
                curveTo(9.999598f,7.4174657f,10.122266f,7.204244f,10.321762f,7.0887136f)
                curveTo(10.521259f,6.973183f,10.767248f,6.972911f,10.967f,7.088f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,17.0f)
                lineTo(12.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,21.0f)
                lineTo(16.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,3.0f)
                lineTo(20.0f,3.0f)
                lineTo(22.0f,3.0f)
                lineTo(22.0f,17.0f)
                lineTo(20.0f,17.0f)
                lineTo(4.0f,17.0f)
                lineTo(2.0f,17.0f)
                lineTo(2.0f,3.0f)
                lineTo(4.0f,3.0f)
                close()
            }
}

public val LucideIcons.All.MonitorPlayDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MonitorPlay: ImageVector
    @Composable get() = MonitorPlayDefinition.asImageVector()
