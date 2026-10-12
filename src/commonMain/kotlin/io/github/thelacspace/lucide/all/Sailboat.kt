package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Sailboat") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,2.0f)
                lineTo(10.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,22.0f)
                curveTo(4.790861f,22.0f,3.0f,20.209139f,3.0f,18.0f)
                curveTo(3.0f,17.447716f,3.4477153f,17.0f,4.0f,17.0f)
                lineTo(20.0f,17.0f)
                curveTo(20.552284f,17.0f,21.0f,17.447716f,21.0f,18.0f)
                curveTo(21.0f,20.209139f,19.209139f,22.0f,17.0f,22.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.159f,2.46f)
                curveTo(9.318937f,2.2110548f,9.580911f,2.0457215f,9.874451f,2.008474f)
                curveTo(10.167992f,1.9712267f,10.462956f,2.06589f,10.68f,2.267f)
                lineTo(20.657001f,11.247f)
                curveTo(20.970657f,11.521091f,21.08156f,11.960903f,20.935377f,12.350949f)
                curveTo(20.789192f,12.740995f,20.41654f,12.999576f,20.0f,13.0f)
                lineTo(4.0f,13.0f)
                curveTo(3.6284869f,13.000105f,3.2875376f,12.794243f,3.1146278f,12.465421f)
                curveTo(2.941718f,12.136598f,2.965352f,11.739021f,3.176f,11.433f)
                close()
            }
}

public val LucideIcons.All.SailboatDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Sailboat: ImageVector
    @Composable get() = SailboatDefinition.asImageVector()
