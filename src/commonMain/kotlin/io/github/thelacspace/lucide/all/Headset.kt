package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Headset") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,11.0f)
                lineTo(6.0f,11.0f)
                curveTo(7.1045694f,11.0f,8.0f,11.895431f,8.0f,13.0f)
                lineTo(8.0f,16.0f)
                curveTo(8.0f,17.10457f,7.1045694f,18.0f,6.0f,18.0f)
                lineTo(5.0f,18.0f)
                curveTo(3.8954306f,18.0f,3.0f,17.10457f,3.0f,16.0f)
                lineTo(3.0f,11.0f)
                close()
                moveTo(3.0f,11.0f)
                curveTo(2.9855773f,7.7750216f,4.6978064f,4.788828f,7.488341f,3.172161f)
                curveTo(10.278875f,1.555494f,13.721125f,1.555494f,16.51166f,3.172161f)
                curveTo(19.302193f,4.788828f,21.014423f,7.7750216f,21.0f,11.0f)
                moveTo(21.0f,11.0f)
                lineTo(21.0f,16.0f)
                curveTo(21.0f,17.10457f,20.10457f,18.0f,19.0f,18.0f)
                lineTo(18.0f,18.0f)
                curveTo(16.89543f,18.0f,16.0f,17.10457f,16.0f,16.0f)
                lineTo(16.0f,13.0f)
                curveTo(16.0f,11.895431f,16.89543f,11.0f,18.0f,11.0f)
                lineTo(21.0f,11.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,16.0f)
                lineTo(21.0f,18.0f)
                curveTo(21.0f,20.209139f,19.209139f,22.0f,17.0f,22.0f)
                lineTo(12.0f,22.0f)
            }
}

public val LucideIcons.All.HeadsetDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Headset: ImageVector
    @Composable get() = HeadsetDefinition.asImageVector()
