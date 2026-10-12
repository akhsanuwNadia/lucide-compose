package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FishOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,12.47f)
                lineTo(18.0f,12.5f)
                moveTo(18.0f,12.0f)
                lineTo(18.0f,12.47f)
                moveTo(17.525f,17.526001f)
                curveTo(16.721481f,17.844337f,15.864264f,18.005257f,15.0f,18.0f)
                curveTo(11.440001f,18.0f,7.44f,15.47f,6.5f,12.0f)
                curveTo(6.848f,10.72f,7.614f,9.566999f,8.621f,8.62f)
                moveTo(12.065001f,6.5319996f)
                curveTo(13.005943f,6.1889815f,13.998526f,6.0090656f,15.0f,6.0f)
                curveTo(18.56f,6.0f,21.06f,8.54f,22.0f,12.0f)
                curveTo(21.691f,13.14f,21.214f,14.177f,20.587f,15.058001f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,10.67f)
                curveTo(7.0f,8.0f,5.58f,5.97f,2.73f,5.5f)
                curveTo(1.73f,7.0f,1.73f,10.5f,2.96f,12.0f)
                curveTo(1.72f,13.5f,1.72f,17.0f,2.73f,18.5f)
                curveTo(5.58f,18.03f,7.0f,16.0f,7.0f,13.33f)
                moveTo(14.48f,8.958f)
                curveTo(14.82116f,7.91692f,15.334994f,6.9406357f,16.0f,6.07f)
                moveTo(16.0f,17.93f)
                curveTo(15.18007f,16.856432f,14.5916815f,15.624494f,14.272f,14.312f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.01f,17.93f)
                lineTo(15.780001f,19.33f)
                curveTo(15.618303f,20.296595f,14.78002f,21.003632f,13.8f,21.0f)
                lineTo(9.5f,21.0f)
                curveTo(10.46885f,19.901493f,10.999264f,18.484686f,10.99f,17.02f)
                moveTo(8.53f,3.0f)
                lineTo(13.799999f,3.0f)
                curveTo(14.780018f,2.996369f,15.618301f,3.703406f,15.779999f,4.67f)
                lineTo(16.009998f,6.07f)
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
}

public val LucideIcons.All.FishOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FishOff: ImageVector
    @Composable get() = FishOffDefinition.asImageVector()
