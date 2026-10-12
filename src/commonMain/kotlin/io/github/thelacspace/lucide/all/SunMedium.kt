package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SunMedium") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f,12.0f)
                curveTo(7.99359f,13.433324f,8.7545805f,14.760521f,9.994819f,15.479039f)
                curveTo(11.235056f,16.197557f,12.764944f,16.197557f,14.005181f,15.479039f)
                curveTo(15.2454195f,14.760521f,16.00641f,13.433324f,16.0f,12.0f)
                curveTo(16.00641f,10.566676f,15.2454195f,9.239479f,14.005181f,8.520961f)
                curveTo(12.764944f,7.8024416f,11.235056f,7.8024416f,9.994819f,8.520961f)
                curveTo(8.7545805f,9.239479f,7.99359f,10.566676f,8.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,3.0f)
                lineTo(12.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,20.0f)
                lineTo(12.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,12.0f)
                lineTo(4.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,12.0f)
                lineTo(21.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.364f,5.636f)
                lineTo(17.657f,6.3430004f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.343f,17.657f)
                lineTo(5.6359997f,18.364f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.636f,5.636f)
                lineTo(6.3430004f,6.3430004f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.657f,17.657f)
                lineTo(18.364f,18.364f)
            }
}

public val LucideIcons.All.SunMediumDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SunMedium: ImageVector
    @Composable get() = SunMediumDefinition.asImageVector()
