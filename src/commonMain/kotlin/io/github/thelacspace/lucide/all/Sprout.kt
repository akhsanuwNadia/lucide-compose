package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Sprout") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,9.536f)
                lineTo(14.0f,7.0f)
                curveTo(14.0f,4.790861f,15.790861f,3.0f,18.0f,3.0f)
                lineTo(19.5f,3.0f)
                curveTo(19.776142f,3.0f,20.0f,3.2238576f,20.0f,3.5f)
                lineTo(20.0f,5.0f)
                curveTo(20.0f,7.209139f,18.209139f,9.0f,16.0f,9.0f)
                curveTo(13.790861f,9.0f,12.0f,10.790861f,12.0f,13.0f)
                curveTo(12.0f,15.0f,13.0f,16.0f,13.0f,18.0f)
                curveTo(13.0f,19.081852f,12.649111f,20.13452f,12.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,9.0f)
                curveTo(5.515088f,7.8636837f,7.5421476f,7.680904f,9.236068f,8.527864f)
                curveTo(10.929988f,9.374825f,12.0f,11.10614f,12.0f,13.0f)
                curveTo(10.484912f,14.136316f,8.457852f,14.319096f,6.763932f,13.472136f)
                curveTo(5.070012f,12.625175f,4.0f,10.89386f,4.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,21.0f)
                lineTo(19.0f,21.0f)
            }
}

public val LucideIcons.All.SproutDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Sprout: ImageVector
    @Composable get() = SproutDefinition.asImageVector()
