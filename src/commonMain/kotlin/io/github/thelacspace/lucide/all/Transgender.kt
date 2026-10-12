package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Transgender") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,16.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,20.0f)
                lineTo(10.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,2.0f)
                lineTo(22.0f,2.0f)
                lineTo(22.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(9.17f,9.17f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,5.355f)
                lineTo(2.0f,2.0f)
                lineTo(5.3570004f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,2.0f)
                lineTo(14.83f,9.17f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,5.0f)
                lineTo(5.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,12.0f)
                curveTo(7.99359f,13.433324f,8.7545805f,14.760521f,9.994819f,15.479039f)
                curveTo(11.235056f,16.197557f,12.764944f,16.197557f,14.005181f,15.479039f)
                curveTo(15.2454195f,14.760521f,16.00641f,13.433324f,16.0f,12.0f)
                curveTo(16.00641f,10.566676f,15.2454195f,9.239479f,14.005181f,8.520961f)
                curveTo(12.764944f,7.8024416f,11.235056f,7.8024416f,9.994819f,8.520961f)
                curveTo(8.7545805f,9.239479f,7.99359f,10.566676f,8.0f,12.0f)
            }
}

public val LucideIcons.All.TransgenderDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Transgender: ImageVector
    @Composable get() = TransgenderDefinition.asImageVector()
