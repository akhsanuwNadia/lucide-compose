package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UndoDot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0f,17.0f)
                curveTo(20.996767f,13.452326f,18.909723f,10.237544f,15.670492f,8.7906885f)
                curveTo(12.431263f,7.3438325f,8.6442795f,7.9348817f,6.0f,10.3f)
                lineTo(3.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,7.0f)
                lineTo(3.0f,13.0f)
                lineTo(9.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,17.0f)
                curveTo(10.998398f,17.358332f,11.188645f,17.69013f,11.498705f,17.86976f)
                curveTo(11.8087635f,18.049389f,12.1912365f,18.049389f,12.501295f,17.86976f)
                curveTo(12.811355f,17.69013f,13.001602f,17.358332f,13.0f,17.0f)
                curveTo(13.001602f,16.641668f,12.811355f,16.30987f,12.501295f,16.13024f)
                curveTo(12.1912365f,15.95061f,11.8087635f,15.95061f,11.498705f,16.13024f)
                curveTo(11.188645f,16.30987f,10.998398f,16.641668f,11.0f,17.0f)
            }
}

public val LucideIcons.All.UndoDotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UndoDot: ImageVector
    @Composable get() = UndoDotDefinition.asImageVector()
