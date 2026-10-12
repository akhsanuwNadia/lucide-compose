package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Gem") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.5f,3.0f)
                lineTo(8.0f,9.0f)
                lineTo(12.0f,22.0f)
                lineTo(16.0f,9.0f)
                lineTo(13.5f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,3.0f)
                curveTo(17.629515f,2.9999998f,18.222292f,3.2963881f,18.6f,3.8f)
                lineTo(21.6f,7.8f)
                curveTo(22.128258f,8.504554f,22.133535f,9.471722f,21.613f,10.182f)
                lineTo(13.623001f,21.168f)
                curveTo(13.247194f,21.690361f,12.643002f,21.999989f,11.999501f,21.999989f)
                curveTo(11.356001f,21.999989f,10.751808f,21.690361f,10.376001f,21.168f)
                lineTo(2.3860016f,10.181999f)
                curveTo(1.8657622f,9.471502f,1.8714461f,8.5043335f,2.4f,7.8f)
                lineTo(5.398f,3.8030002f)
                curveTo(5.7755017f,3.2976942f,6.3692527f,3.0000775f,7.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,9.0f)
                lineTo(22.0f,9.0f)
            }
}

public val LucideIcons.All.GemDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Gem: ImageVector
    @Composable get() = GemDefinition.asImageVector()
