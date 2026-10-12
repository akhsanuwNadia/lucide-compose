package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BroomSparkles") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,2.0f)
                lineTo(11.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,3.0f)
                lineTo(10.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.5f,10.5f)
                lineTo(22.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.734f,13.841f)
                curveTo(15.190599f,13.056538f,15.061681f,12.062957f,14.42f,11.421f)
                lineTo(12.58f,9.58f)
                curveTo(11.9378805f,8.937823f,10.943697f,8.80888f,10.159f,9.266f)
                lineTo(2.5020003f,13.726999f)
                curveTo(2.2335558f,13.883359f,2.053027f,14.155601f,2.0134575f,14.463733f)
                curveTo(1.973888f,14.771865f,2.0797727f,15.080886f,2.3f,15.3f)
                lineTo(8.703f,21.703f)
                curveTo(8.922384f,21.922253f,9.231089f,22.027298f,9.538671f,21.987358f)
                curveTo(9.846252f,21.947416f,10.117889f,21.767012f,10.274f,21.498999f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,15.0f)
                lineTo(20.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,17.0f)
                lineTo(18.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,4.0f)
                lineTo(4.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,18.0f)
                lineTo(7.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,6.0f)
                lineTo(2.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.699f,10.7f)
                lineTo(13.301001f,16.300999f)
            }
}

public val LucideIcons.All.BroomSparklesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BroomSparkles: ImageVector
    @Composable get() = BroomSparklesDefinition.asImageVector()
