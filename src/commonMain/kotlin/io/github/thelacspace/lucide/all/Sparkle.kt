package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Sparkle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.017f,2.814f)
                curveTo(11.105402f,2.3407087f,11.518523f,1.9976065f,12.0f,1.9976065f)
                curveTo(12.481477f,1.9976065f,12.894598f,2.3407087f,12.983f,2.814f)
                lineTo(14.033999f,8.372f)
                curveTo(14.186764f,9.180686f,14.819313f,9.813235f,15.627999f,9.966f)
                lineTo(21.185999f,11.016999f)
                curveTo(21.65929f,11.105401f,22.002392f,11.518522f,22.002392f,11.999999f)
                curveTo(22.002392f,12.481476f,21.65929f,12.894597f,21.185999f,12.982999f)
                lineTo(15.627998f,14.0339985f)
                curveTo(14.819312f,14.186763f,14.186763f,14.819312f,14.0339985f,15.627998f)
                lineTo(12.982999f,21.185999f)
                curveTo(12.894597f,21.65929f,12.481476f,22.002392f,11.999999f,22.002392f)
                curveTo(11.518522f,22.002392f,11.105401f,21.65929f,11.016999f,21.185999f)
                lineTo(9.966f,15.627998f)
                curveTo(9.813235f,14.819312f,9.180686f,14.186763f,8.372f,14.0339985f)
                lineTo(2.8139997f,12.982999f)
                curveTo(2.3407085f,12.894597f,1.9976063f,12.481476f,1.9976063f,11.999999f)
                curveTo(1.9976063f,11.518522f,2.3407085f,11.105401f,2.8139997f,11.016999f)
                lineTo(8.372f,9.966f)
                curveTo(9.180686f,9.813235f,9.813235f,9.180686f,9.966f,8.372f)
                close()
            }
}

public val LucideIcons.All.SparkleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Sparkle: ImageVector
    @Composable get() = SparkleDefinition.asImageVector()
