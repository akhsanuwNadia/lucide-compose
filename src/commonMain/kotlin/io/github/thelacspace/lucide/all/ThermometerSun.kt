package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ThermometerSun") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,8.0f)
                curveTo(10.1142845f,7.9990487f,8.484017f,9.315232f,8.08744f,11.158775f)
                curveTo(7.690862f,13.002317f,8.635698f,14.87245f,10.355f,15.646999f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                lineTo(4.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,14.54f)
                curveTo(21.567873f,15.445211f,22.332275f,17.290644f,21.863703f,19.039377f)
                curveTo(21.395132f,20.788113f,19.810423f,22.0041f,18.0f,22.0041f)
                curveTo(16.189577f,22.0041f,14.604869f,20.788113f,14.136296f,19.039377f)
                curveTo(13.667725f,17.290644f,14.432128f,15.445211f,16.0f,14.54f)
                lineTo(16.0f,4.0f)
                curveTo(16.004925f,2.8989217f,16.89891f,2.0089242f,18.0f,2.0089242f)
                curveTo(19.10109f,2.0089242f,19.995075f,2.8989217f,20.0f,4.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.93f,4.93f)
                lineTo(6.3399997f,6.3399997f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.34f,17.66f)
                lineTo(4.9300003f,19.07f)
            }
}

public val LucideIcons.All.ThermometerSunDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ThermometerSun: ImageVector
    @Composable get() = ThermometerSunDefinition.asImageVector()
