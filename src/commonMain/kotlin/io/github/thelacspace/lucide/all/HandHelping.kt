package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HandHelping") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,12.0f)
                lineTo(13.0f,12.0f)
                curveTo(13.716661f,12.003205f,14.38026f,11.622709f,14.73952f,11.002591f)
                curveTo(15.098779f,10.382472f,15.098779f,9.617528f,14.73952f,8.997409f)
                curveTo(14.38026f,8.377291f,13.716661f,7.996795f,13.0f,8.0f)
                lineTo(10.0f,8.0f)
                curveTo(9.4f,8.0f,8.9f,8.2f,8.6f,8.6f)
                lineTo(3.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,18.0f)
                lineTo(8.6f,16.6f)
                curveTo(8.900001f,16.2f,9.400001f,16.0f,10.0f,16.0f)
                lineTo(14.0f,16.0f)
                curveTo(15.1f,16.0f,16.1f,15.6f,16.8f,14.8f)
                lineTo(21.4f,10.4f)
                curveTo(22.197649f,9.639426f,22.230505f,8.377177f,21.473507f,7.576135f)
                curveTo(20.716509f,6.7750926f,19.45442f,6.736591f,18.65f,7.49f)
                lineTo(14.45f,11.389999f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,13.0f)
                lineTo(8.0f,19.0f)
            }
}

public val LucideIcons.All.HandHelpingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HandHelping: ImageVector
    @Composable get() = HandHelpingDefinition.asImageVector()
