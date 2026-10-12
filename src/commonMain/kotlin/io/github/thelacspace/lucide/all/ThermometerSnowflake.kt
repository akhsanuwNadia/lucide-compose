package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ThermometerSnowflake") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,20.0f)
                lineTo(8.75f,17.5f)
                lineTo(6.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,4.0f)
                lineTo(8.75f,6.5f)
                lineTo(6.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.585f,15.0f)
                lineTo(10.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                lineTo(8.5f,12.0f)
                lineTo(10.0f,9.0f)
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
                moveTo(4.0f,10.0f)
                lineTo(5.5f,12.0f)
                lineTo(4.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,21.0f)
                lineTo(10.0f,15.0f)
                lineTo(8.5f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,3.0f)
                lineTo(10.0f,9.0f)
                lineTo(12.0f,9.0f)
            }
}

public val LucideIcons.All.ThermometerSnowflakeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ThermometerSnowflake: ImageVector
    @Composable get() = ThermometerSnowflakeDefinition.asImageVector()
