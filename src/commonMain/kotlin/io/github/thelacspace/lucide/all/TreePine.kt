package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TreePine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f,14.0f)
                lineTo(20.0f,17.3f)
                curveTo(20.28012f,17.5857f,20.362976f,18.010872f,20.210632f,18.380848f)
                curveTo(20.058289f,18.750826f,19.700075f,18.99438f,19.3f,19.0f)
                lineTo(4.7f,19.0f)
                curveTo(4.2999244f,18.99438f,3.9417107f,18.750826f,3.789367f,18.380848f)
                curveTo(3.6370234f,18.01087f,3.7198794f,17.5857f,3.9999998f,17.3f)
                lineTo(7.0f,14.0f)
                lineTo(6.7f,14.0f)
                curveTo(6.299925f,13.99438f,5.941712f,13.750826f,5.789368f,13.380849f)
                curveTo(5.637025f,13.010871f,5.7198806f,12.5857f,6.0f,12.3f)
                lineTo(9.0f,9.0f)
                lineTo(8.8f,9.0f)
                curveTo(8.381598f,9.037744f,7.9842157f,8.809957f,7.805338f,8.429841f)
                curveTo(7.62646f,8.0497265f,7.7042303f,7.5983377f,8.0f,7.3f)
                lineTo(12.0f,3.0f)
                lineTo(16.0f,7.3f)
                curveTo(16.295769f,7.5983377f,16.37354f,8.0497265f,16.194662f,8.429841f)
                curveTo(16.015785f,8.809957f,15.618402f,9.037744f,15.2f,9.0f)
                lineTo(15.0f,9.0f)
                lineTo(18.0f,12.3f)
                curveTo(18.280119f,12.585701f,18.362976f,13.010872f,18.210632f,13.380849f)
                curveTo(18.058289f,13.750826f,17.700075f,13.99438f,17.3f,14.0f)
                lineTo(17.0f,14.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,22.0f)
                lineTo(12.0f,19.0f)
            }
}

public val LucideIcons.All.TreePineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TreePine: ImageVector
    @Composable get() = TreePineDefinition.asImageVector()
