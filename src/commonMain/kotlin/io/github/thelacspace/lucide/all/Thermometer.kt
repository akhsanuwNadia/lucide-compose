package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Thermometer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,4.0f)
                lineTo(14.0f,14.54f)
                curveTo(15.567872f,15.445211f,16.332275f,17.290644f,15.863704f,19.039377f)
                curveTo(15.395131f,20.788113f,13.810423f,22.0041f,12.0f,22.0041f)
                curveTo(10.189577f,22.0041f,8.604869f,20.788113f,8.136296f,19.039377f)
                curveTo(7.6677246f,17.290644f,8.432128f,15.445211f,10.0f,14.54f)
                lineTo(10.0f,4.0f)
                curveTo(10.004924f,2.8989217f,10.8989105f,2.0089242f,12.0f,2.0089242f)
                curveTo(13.1010895f,2.0089242f,13.995076f,2.8989217f,14.0f,4.0f)
                close()
            }
}

public val LucideIcons.All.ThermometerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Thermometer: ImageVector
    @Composable get() = ThermometerDefinition.asImageVector()
