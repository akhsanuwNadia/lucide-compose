package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Trees") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,10.0f)
                lineTo(10.0f,10.2f)
                curveTo(11.353412f,10.720467f,12.140851f,12.134449f,11.870661f,13.559091f)
                curveTo(11.60047f,14.983733f,10.349994f,16.011213f,8.9f,16.0f)
                lineTo(5.0f,16.0f)
                curveTo(3.5683858f,15.964381f,2.3615527f,14.921885f,2.1182363f,13.510649f)
                curveTo(1.8749198f,12.099414f,2.66297f,10.712971f,4.0f,10.2f)
                lineTo(4.0f,10.0f)
                curveTo(4.007386f,8.348383f,5.3483663f,7.0133862f,7.0f,7.0133862f)
                curveTo(8.651634f,7.0133862f,9.992614f,8.348383f,10.0f,10.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,16.0f)
                lineTo(7.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,19.0f)
                lineTo(13.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,19.0f)
                lineTo(20.3f,19.0f)
                curveTo(20.700075f,18.99438f,21.058289f,18.750826f,21.210632f,18.380848f)
                curveTo(21.362976f,18.010872f,21.28012f,17.5857f,21.0f,17.3f)
                lineTo(18.0f,14.0f)
                lineTo(18.3f,14.0f)
                curveTo(18.700075f,13.99438f,19.058289f,13.750826f,19.210632f,13.380849f)
                curveTo(19.362976f,13.010872f,19.280119f,12.585701f,19.0f,12.3f)
                lineTo(16.0f,9.0f)
                lineTo(16.2f,9.0f)
                curveTo(16.618402f,9.037743f,17.015785f,8.809956f,17.194662f,8.429841f)
                curveTo(17.373539f,8.049726f,17.295769f,7.5983377f,17.0f,7.3f)
                lineTo(13.0f,3.0f)
                lineTo(11.6f,4.5f)
            }
}

public val LucideIcons.All.TreesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Trees: ImageVector
    @Composable get() = TreesDefinition.asImageVector()
