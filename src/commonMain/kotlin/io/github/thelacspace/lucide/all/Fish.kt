package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Fish") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.5f,12.0f)
                curveTo(7.44f,8.54f,11.440001f,6.0f,15.0f,6.0f)
                curveTo(18.56f,6.0f,21.06f,8.54f,22.0f,12.0f)
                curveTo(21.06f,15.47f,18.56f,18.0f,15.0f,18.0f)
                curveTo(11.440001f,18.0f,7.44f,15.47f,6.5f,12.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,12.0f)
                lineTo(18.0f,12.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,17.93f)
                curveTo(13.326047f,14.428819f,13.326047f,9.571182f,16.0f,6.0700006f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,10.67f)
                curveTo(7.0f,8.0f,5.58f,5.97f,2.73f,5.5f)
                curveTo(1.73f,7.0f,1.73f,10.5f,2.96f,12.0f)
                curveTo(1.72f,13.5f,1.72f,17.0f,2.73f,18.5f)
                curveTo(5.58f,18.03f,7.0f,16.0f,7.0f,13.33f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.46f,7.26f)
                curveTo(10.2f,5.88f,9.17f,4.24f,8.0f,3.0f)
                lineTo(13.8f,3.0f)
                curveTo(14.78002f,2.9963684f,15.618303f,3.7034059f,15.780001f,4.67f)
                lineTo(16.01f,6.07f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.01f,17.93f)
                lineTo(15.780001f,19.33f)
                curveTo(15.618303f,20.296595f,14.78002f,21.003632f,13.8f,21.0f)
                lineTo(9.5f,21.0f)
                curveTo(10.46885f,19.901493f,10.999264f,18.484686f,10.99f,17.02f)
            }
}

public val LucideIcons.All.FishDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Fish: ImageVector
    @Composable get() = FishDefinition.asImageVector()
