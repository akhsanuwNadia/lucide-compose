package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TreePalm") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0f,8.0f)
                curveTo(13.0f,5.24f,10.54f,3.0f,7.5f,3.0f)
                curveTo(4.46f,3.0f,2.0f,5.24f,2.0f,8.0f)
                lineTo(4.0f,8.0f)
                lineTo(5.0f,7.0f)
                lineTo(6.0f,8.0f)
                lineTo(10.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,7.14f)
                curveTo(14.012608f,6.3913503f,15.240724f,5.9913354f,16.5f,6.0f)
                curveTo(19.54f,6.0f,22.0f,8.24f,22.0f,11.0f)
                lineTo(19.0f,11.0f)
                lineTo(18.0f,10.0f)
                lineTo(17.0f,11.0f)
                lineTo(14.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.89f,9.71f)
                curveTo(3.7399998f,11.860001f,3.59f,15.18f,5.54f,17.14f)
                lineTo(9.78f,12.889999f)
                lineTo(10.48f,12.19f)
                lineTo(11.19f,11.48f)
                lineTo(13.309999f,9.36f)
                curveTo(11.36f,7.3999996f,8.039999f,7.5599995f,5.8899994f,9.71f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,15.5f)
                curveTo(11.5f,18.0f,10.83f,20.0f,10.0f,22.0f)
                lineTo(14.0f,22.0f)
                curveTo(16.0f,16.5f,13.5f,10.0f,13.0f,8.0f)
            }
}

public val LucideIcons.All.TreePalmDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TreePalm: ImageVector
    @Composable get() = TreePalmDefinition.asImageVector()
