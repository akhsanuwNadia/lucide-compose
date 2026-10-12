package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HandHeart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,14.0f)
                lineTo(13.0f,14.0f)
                curveTo(14.101078f,13.995076f,14.9910755f,13.1010895f,14.9910755f,12.0f)
                curveTo(14.9910755f,10.8989105f,14.101078f,10.004924f,13.0f,10.0f)
                lineTo(10.0f,10.0f)
                curveTo(9.4f,10.0f,8.9f,10.2f,8.6f,10.6f)
                lineTo(3.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.45f,13.39f)
                lineTo(19.5f,8.696001f)
                curveTo(20.196f,8.0f,21.0f,6.85f,21.0f,5.75f)
                curveTo(21.000257f,4.61044f,20.297657f,3.5887778f,19.23346f,3.181246f)
                curveTo(18.169264f,2.7737143f,16.963968f,3.0647523f,16.203f,3.913f)
                curveTo(16.150742f,3.9697304f,16.07713f,4.0020056f,15.999999f,4.0020056f)
                curveTo(15.922868f,4.0020056f,15.8492565f,3.9697304f,15.796999f,3.913f)
                curveTo(15.03603f,3.0647538f,13.830735f,2.773717f,12.76654f,3.1812484f)
                curveTo(11.702343f,3.58878f,10.999743f,4.6104407f,11.0f,5.75f)
                curveTo(11.0f,6.95f,11.802f,7.998f,12.5f,8.696f)
                lineTo(16.0f,11.95f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,15.0f)
                lineTo(8.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,20.0f)
                lineTo(8.6f,18.6f)
                curveTo(8.900001f,18.2f,9.400001f,18.0f,10.0f,18.0f)
                lineTo(14.0f,18.0f)
                curveTo(15.1f,18.0f,16.1f,17.6f,16.8f,16.8f)
                lineTo(21.4f,12.4f)
                curveTo(22.197649f,11.639426f,22.230505f,10.377177f,21.473507f,9.576135f)
                curveTo(20.716509f,8.775093f,19.45442f,8.736591f,18.65f,9.49f)
            }
}

public val LucideIcons.All.HandHeartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HandHeart: ImageVector
    @Composable get() = HandHeartDefinition.asImageVector()
